/*
 * Copyright (c) 2018., CipherGateway and/or its affiliates. All rights  reserved.
 *
 */

package com.huangyingzhi.searcher.server.module.cse;

import com.google.api.services.customsearch.model.Search;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author huangyingzhi.
 */

@RestController("/search")
@RequiredArgsConstructor
public class CseController {

  private final CseService cseService;

  @GetMapping()
  public Search search(String p) throws IOException {
    return cseService.search(p);
  }

}
