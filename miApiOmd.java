import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class miApiOmd {

    public static void main(String[] args) {
        try {
            // 👇 Reemplazá TU_API_KEY con la clave que te dio OMDb
            String apiKey = "3afb0322";
            String titulo = "Titanic"; // podés cambiar esto por cualquier película
            String urlString = "https://www.omdbapi.com/?t=" + titulo + "&apikey=" + apiKey;

            URL url = new URL(urlString);
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
            StringBuilder respuesta = new StringBuilder();
            String linea;

            while ((linea = reader.readLine()) != null) {
                respuesta.append(linea);
            }

            reader.close();

            // Mostrar la respuesta de la API en texto plano (JSON)
            System.out.println("Respuesta de la API:");
            System.out.println(respuesta.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
