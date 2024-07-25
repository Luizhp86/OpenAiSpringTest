//package com.example.demo.controllers;
//
//import org.springframework.ai.openai.OpenAiChatModel;
//import org.springframework.ai.vertexai.gemini.VertexAiGeminiChatModel;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@RequestMapping("/api")
//@RestController
//public class ChatController {
//    private final OpenAiChatModel openAiChatModel;
//    private final VertexAiGeminiChatModel vertexAiGeminiChatModel;
//
//    public ChatController(OpenAiChatModel openAiChatModel, VertexAiGeminiChatModel vertexAiGeminiChatModel) {
//        this.openAiChatModel = openAiChatModel;
//        this.vertexAiGeminiChatModel = vertexAiGeminiChatModel;
//    }
//
//    @PostMapping("/chat")
//    public Map<String, String> chat(@RequestBody String message) {
//        Map<String, String> responses = new HashMap<>();
//
//        String openAiResponse = openAiChatModel.call(message);
//        responses.put("openai(chatGPT) response", openAiResponse);
//
//        String vertexAiGeminiResponse = vertexAiGeminiChatModel.call(message);
//        responses.put("vertexai(gemini) response", vertexAiGeminiResponse);
//        return responses;
//    }
//}