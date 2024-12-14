package org.example.islamprojectrk.controller;

import jakarta.mail.MessagingException;
import org.example.islamprojectrk.services.EmailService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/email")
public class EmailController {
    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @GetMapping
    public String showEmailForm() {
        return "email-form";
    }

    @PostMapping
    public String sendEmail(@RequestParam String to,
                            @RequestParam String subject,
                            @RequestParam String body,
                            Model model) {
        try {
            emailService.sendEmail(to, subject, body);
            model.addAttribute("success", "Email sent successfully!");
        } catch (MessagingException e) {
            model.addAttribute("error", "Failed to send email: " + e.getMessage());
        }
        return "email-form";
    }
}


