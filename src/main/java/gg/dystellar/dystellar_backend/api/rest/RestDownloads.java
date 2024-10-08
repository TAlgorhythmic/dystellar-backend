package gg.dystellar.dystellar_backend.api.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/downloads")
public class RestDownloads {
   
   @PostMapping("/diff")
   public String getDiff() {
      return "asda";
   }
}
