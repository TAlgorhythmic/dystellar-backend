package gg.dystellar.dystellar_backend.api.rest;

import gg.dystellar.dystellar_backend.api.type.responses.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/microsoft")
public class MicrosoftHandler {

    private static final String TOKEN_ENDPOINT = "https://login.microsoftonline.com/common/oauth2/v2.0/token";

    @GetMapping(value = "/login/{code}")
    public Response getLogin(@PathVariable("code") String code) {

    }
}
