package org.example.test22.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/hi")
    public ResponseEntity<Object> test() {
        String result = "test";
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
