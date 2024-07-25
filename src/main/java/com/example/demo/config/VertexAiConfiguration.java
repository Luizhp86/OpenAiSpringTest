//package com.example.demo.config;
//
//import com.google.api.client.util.Lists;
//import com.google.api.gax.core.FixedCredentialsProvider;
//import com.google.auth.Credentials;
//import com.google.auth.oauth2.GoogleCredentials;
//import com.google.cloud.vertexai.VertexAI;
//import com.google.cloud.vertexai.VertexAI.Builder;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.io.ByteArrayInputStream;
//import java.io.IOException;
//
//@Configuration
//public class VertexAiConfiguration {
//
//    @Value("${spring.ai.vertexai.project-id}")
//    private String projectId;
//
//    @Value("${spring.ai.vertexai.location}")
//    private String location;
//
//    @Value("${spring.ai.vertexai.api-key}")
//    private String apiKey;
//
//    @Bean
//    public VertexAI vertexAi() throws IOException {
//        Credentials credentials = GoogleCredentials.fromStream(new ByteArrayInputStream(apiKey.getBytes()))
//                .createScoped(Lists.newArrayList());
//        return new Builder()
//                .setProjectId(projectId)
////                .setLocation(location)
//                .setCredentials(credentials)
//                .build();
//    }
//}