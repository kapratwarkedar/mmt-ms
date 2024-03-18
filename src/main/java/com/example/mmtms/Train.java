
package com.example.mmtms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Train {
    @GetMapping("/train")
    public String getData() {return "Please book a Train tickets at 25% discount";}
}
