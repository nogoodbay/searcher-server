/*
 * Copyright (c) 2018., CipherGateway and/or its affiliates. All rights  reserved.
 *
 */

package com.huangyingzhi.searcher.server;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.customsearch.Customsearch;
import com.google.api.services.customsearch.model.Search;
import org.junit.Test;

import java.io.IOException;
import java.security.GeneralSecurityException;

/**
 * @author huangyingzhi.
 */


public class CSETest {

  @Test
  public void testJavaAPI() throws GeneralSecurityException, IOException {
    HttpTransport httpTransport = GoogleNetHttpTransport.newTrustedTransport();
    JsonFactory jsonFactory = GsonFactory.getDefaultInstance();
    Customsearch customsearch = new Customsearch(httpTransport, jsonFactory, null);
    String parameter = "lectures";
    Customsearch.Cse.List request = customsearch.cse().list(parameter);
    Search search = request.setKey("AIzaSyDrW1N3EWt8XTZ2cfYe4xPOaBPNn6Csxiw")
      .setCx("002600470224700499886:3jhn6sxtfsw")
      .execute();
    search.getItems().forEach(System.out::println);
  }
}
