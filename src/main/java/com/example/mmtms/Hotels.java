package com.example.mmtms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Hotels {
    @GetMapping("/hotels")

    public String getData() {return "Please do the reservations at 20% discount";}

}
