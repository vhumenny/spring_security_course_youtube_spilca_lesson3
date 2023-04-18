package com.spring.security.course.spilca.spring_security_course_youtube_spilca_lesson3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/demo")
    public String demo() {
        return "demo";
    }
}
