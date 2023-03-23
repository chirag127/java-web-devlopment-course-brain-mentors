
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class LibreTranslateAPI {

    private static final String API_ENDPOINT = "https://libretranslate.com/translate";

    private final String apiKey;

    public LibreTranslateAPI(String apiKey) {
        this.apiKey = apiKey;
    }

    public String translate(String text, String targetLang) throws IOException, InterruptedException, URISyntaxException {
        String encodedText = Base64.getEncoder().encodeToString(text.getBytes(StandardCharsets.UTF_8));
        String requestJson = String.format("{\"q\":\"%s\",\"source\":\"en\",\"target\":\"%s\"}", encodedText, targetLang);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(API_ENDPOINT))
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + apiKey)
                .POST(HttpRequest.BodyPublishers.ofString(requestJson))
                .build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String responseBody = response.body();
        String decodedText = new String(Base64.getDecoder().decode(responseBody), StandardCharsets.UTF_8);
        return decodedText;
    }
}
