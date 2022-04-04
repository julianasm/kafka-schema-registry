package com.example.kfakaestudos;

import com.example.kfakaestudos.emailService.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class emailController {

    private final EmailService emailService;

    @GetMapping("/email")
    public void listener() throws Exception {
        emailService.sendEmail("Vinicius Silva Farias", "julianasouzamelo@live.com", "Salve Salve");
    }
}
