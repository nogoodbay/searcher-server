/*
 * Copyright (c) 2018., CipherGateway and/or its affiliates. All rights  reserved.
 *
 */

package com.huangyingzhi.searcher.server.config;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.customsearch.Customsearch;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.security.GeneralSecurityException;

/**
 * @author huangyingzhi.
 */

@Configuration
public class CustomSearchConfig {

  @Bean
  public Customsearch customsearch() throws GeneralSecurityException, IOException {
    HttpTransport httpTransport = GoogleNetHttpTransport.newTrustedTransport();
    JsonFactory jsonFactory = GsonFactory.getDefaultInstance();
    return new Customsearch(httpTransport, jsonFactory, null);
  }

}
