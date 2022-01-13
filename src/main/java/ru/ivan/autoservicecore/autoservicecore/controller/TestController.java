package ru.ivan.autoservicecore.autoservicecore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ivan.model.Test;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/check")
    public Test check(){
        return new Test("id1", "sometext");
    }
}
