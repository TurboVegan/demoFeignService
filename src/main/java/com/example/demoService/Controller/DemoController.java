package com.example.demoService.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class DemoController {

    @GetMapping("/name")
    public String getName () {
        return "name";
    }
    @GetMapping("/country")
    public String getCountry () {
        return "country";
    }

    @GetMapping("/status")
    public String getStatus () {
        return "status";
    }

}
