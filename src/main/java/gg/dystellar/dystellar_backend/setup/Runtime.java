package gg.dystellar.dystellar_backend.setup;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.stereotype.Component;

@Component
public class Runtime {

    private static final Dotenv env = Dotenv.configure()
            .directory("/")
            .filename(".env")
            .load();

    public String getMicrosoftClientId() {
        return env.get("MICROSOFT_CLIENT_ID");
    }

    public String getMicrosoftClientSecret() {
        return env.get("MICROSOFT_CLIENT_SECRET");
    }
}
