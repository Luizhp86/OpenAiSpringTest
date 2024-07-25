package com.example.demo.controllers;

import com.example.demo.model.MessageRequest;
import com.example.demo.services.ConciliacaoAiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConciliacaoAiController {
    ConciliacaoAiService conciliacaoAiService;


    @GetMapping(value = "/conciliarTags")
    public String conciliarTags(@RequestBody MessageRequest messageRequest) {

        return conciliacaoAiService.conciliarTags(messageRequest);

    }


}
