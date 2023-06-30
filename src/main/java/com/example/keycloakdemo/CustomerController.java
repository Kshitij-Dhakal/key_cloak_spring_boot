package com.example.keycloakdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;
import java.util.List;
import java.util.UUID;

@Controller
public class CustomerController {
    @GetMapping(path = "/")
    public String index() {
        return "external";
    }

    @GetMapping(path = "/customers")
    public String customers(Principal principal, Model model) {
        var c1 = new Customer();
        c1.setId(UUID.randomUUID().toString());
        c1.setName("Chintan Karki");
        c1.setAddress("Kathmandu");
        c1.setServiceRendered("Developer");
        var customers = List.of(c1);
        model.addAttribute("customers", customers);
        model.addAttribute("username", principal.getName());
        return "customers";
    }
}
