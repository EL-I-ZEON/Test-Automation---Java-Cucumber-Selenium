package automation.utils;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class AIUtils {

    private static final String API_KEY = "YOUR_SAPIENT_AI_API_KEY";
    private static final String API_ENDPOINT = "https://api.sapient.ai/v1/generateUnitTest";

    public static String generateUnitTests(String code) throws IOException {
        // Construct request payload
        String payload = "{\"code\": \"" + code + "\"}";

        // Set up HTTP connection
        URL url = new URL(API_ENDPOINT);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setRequestProperty("x-api-key", API_KEY);
        conn.setDoOutput(true);

        // Send request
        try (DataOutputStream wr = new DataOutputStream(conn.getOutputStream())) {
            wr.write(payload.getBytes(StandardCharsets.UTF_8));
        }

        // Get response
        StringBuilder response = new StringBuilder();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
            String line;
            while ((line = in.readLine()) != null) {
                response.append(line);
            }
        }

        // Extract generated unit tests from response
        String responseData = response.toString();
        String unitTests = responseData.substring(responseData.indexOf("unitTests\":") + 11, responseData.lastIndexOf("\""));

        return unitTests;
    }
}