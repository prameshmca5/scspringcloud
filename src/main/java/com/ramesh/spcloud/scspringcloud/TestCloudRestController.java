package com.ramesh.spcloud.scspringcloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class TestCloudRestController {

    @GetMapping
    public String welcome() {
        return  "Welcome Test screen Java";
    }

    @GetMapping("/welcome")
    public String test(){
        return  "Hi! Welcome Mr.Ramesh Pongiannan";
    }

    @GetMapping("/test")
    public String weltest() {
        return  "Hello Test content for this site..";
    }
}
