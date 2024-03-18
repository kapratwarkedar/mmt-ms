package com.example.mmtms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Train {
    @GetMapping("/hotelsn")
    public String getData() {return "Please book a Hotel reservations at 25% discount";}
}
