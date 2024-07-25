package com.example.demo.controllers;

import com.example.demo.model.MessageRequest;
import com.example.demo.services.ConciliacaoAiService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConciliacaoAiController {

    ConciliacaoAiService conciliacaoAiService;

    public ConciliacaoAiController(ConciliacaoAiService conciliacaoAiService) {
        this.conciliacaoAiService = conciliacaoAiService;
    }


    @GetMapping(value = "/conciliarTags")
    public String conciliarTags(@RequestBody MessageRequest messageRequest) throws JsonProcessingException {

        return conciliacaoAiService.conciliarTags(messageRequest);

    }


}
