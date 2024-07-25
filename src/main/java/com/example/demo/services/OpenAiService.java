package com.example.demo.services;

import com.example.demo.model.MessageRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.ai.openai.OpenAiChatOptions;
import org.springframework.stereotype.Service;

@Service
public class OpenAiService {
    private final OpenAiChatModel openAiChatModel;
    private final Logger logger = LoggerFactory.getLogger(ConciliacaoAiService.class);


    public OpenAiService(OpenAiChatModel openAiChatModel) {
        this.openAiChatModel = openAiChatModel;
    }

    public String openAiChatConciliacao(MessageRequest messageRequest) {


        Prompt prompt = new Prompt(
                messageRequest.getMessage(),
                OpenAiChatOptions.builder()
                        .withModel("ft:gpt-3.5-turbo-1106:asap-log:testeconciliacao:9ovURXiB")
                        .withTemperature(0.5F)
//                            .withResponseFormat(new OpenAiApi.ChatCompletionRequest.ResponseFormat("json_object"))
                        .build()
        );

        ChatResponse response = openAiChatModel.call(prompt);

        //response vira em json e deve ser deserializado para objeto respectivo

        logger.info("Resposta: {}", response.getResult().getOutput().getContent());
        return response.getResult().getOutput().getContent();
    }

}
