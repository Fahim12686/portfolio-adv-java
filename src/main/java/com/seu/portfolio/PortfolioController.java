package com.seu.portfolio;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class PortfolioController {

    // Serves the portfolio-index.html page
    @GetMapping("/portfolio")
    public String portfolioPage() {
        return "portfolio-index";
    }

    // Handles the form submission from the portfolio page
    @PostMapping("/submit-portfolio-contact")
    public String submitPortfolioContact(@ModelAttribute Contact contact) {
        System.out.println("Portfolio contact form submitted");
        System.out.println(contact);

        log.info("Contact form submitted from Portfolio {}", contact);

        // Redirects back to the portfolio page after submission
        return "redirect:/portfolio";
    }
}
