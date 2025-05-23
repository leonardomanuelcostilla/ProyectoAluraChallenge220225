import java.util.Scanner;

public class ConversorDeMonedas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tasaDolarAPesoArg = 1444.0;
        double tasaPesoArgADolar = 1.0 / 1444.0;
        double tasaDolarAPesoBr = 5.10;
        double tasaPesoBrADolar = 1.0 / 5.10;

        boolean continuar = true;

        while (continuar) {
            System.out.println("=== Conversor de Monedas ===");
            System.out.println("1. Dólar a Peso Argentino");
            System.out.println("2. Peso Argentino a Dólar");
            System.out.println("3. Dólar a Peso Brasileño");
            System.out.println("4. Peso Brasileño a Dólar");
            System.out.println("5. Salir");
            System.out.print("Elige una opción (1-5): ");
            int opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingresa la cantidad: ");
                double cantidad = scanner.nextDouble();
                double resultado;

                switch (opcion) {
                    case 1:
                        resultado = cantidad * tasaDolarAPesoArg;
                        System.out.printf("%.2f dólares = %.2f pesos argentinos\n", cantidad, resultado);
                        break;
                    case 2:
                        resultado = cantidad * tasaPesoArgADolar;
                        System.out.printf("%.2f pesos argentinos = %.2f dólares\n", cantidad, resultado);
                        break;
                    case 3:
                        resultado = cantidad * tasaDolarAPesoBr;
                        System.out.printf("%.2f dólares = %.2f reales brasileños\n", cantidad, resultado);
                        break;
                    case 4:
                        resultado = cantidad * tasaPesoBrADolar;
                        System.out.printf("%.2f reales brasileños = %.2f dólares\n", cantidad, resultado);
                        break;
                }

                // Preguntar si desea volver a convertir
                System.out.print("\n¿Deseas hacer otra conversión? (s/n): ");
                String respuesta = scanner.next();

                if (!respuesta.equalsIgnoreCase("s")) {
                    continuar = false;
                    System.out.println("Gracias por usar el conversor. ¡Hasta pronto!");
                }

            } else if (opcion == 5) {
                continuar = false;
                System.out.println("Gracias por usar el conversor. ¡Hasta pronto!");
            } else {
                System.out.println("Opción no válida.\n");
            }
        }

        scanner.close();
    }
}