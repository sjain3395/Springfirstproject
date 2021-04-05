package org.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class  Topic {

@RequestMapping("topic")
    public String getAllTopics() {
        return "All Topics";
    }

}
