package com.example.demo.controllers;

import com.example.demo.model.MessageRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.ai.openai.OpenAiChatOptions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenAiController {
    private final Logger logger = LoggerFactory.getLogger(OpenAiController.class);


    private final OpenAiChatModel openAiChatModel;

    public OpenAiController(OpenAiChatModel openAiChatModel) {
        this.openAiChatModel = openAiChatModel;
    }

    @GetMapping(value = "/openAi")
    public String conciliarTags(@RequestBody MessageRequest messageRequest) {


        Prompt prompt = new Prompt(
                messageRequest.getMessage(),
                OpenAiChatOptions.builder()
                        .withModel("ft:gpt-3.5-turbo-1106:asap-log:testeconciliacao:9ovURXiB")
                        .withTemperature(0.5F)
//                            .withResponseFormat(new OpenAiApi.ChatCompletionRequest.ResponseFormat("json_object"))
                        .build()
        );

        ChatResponse response = openAiChatModel.call(prompt);

        logger.info("Resposta: {}", response.getResult().getOutput().getContent());
        return response.getResult().getOutput().getContent();
    }

}
