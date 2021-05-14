package com.tts.W13D4Lab.Lab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class NewClass {

    @GetMapping("/newFile")
    public Integer ourFunction() {
        return 5+6;
    }
}
