package org.arry.samplewebapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("/isAlive")
    public String capplicationChecker() {
        return "Application is up.";
    }

}
