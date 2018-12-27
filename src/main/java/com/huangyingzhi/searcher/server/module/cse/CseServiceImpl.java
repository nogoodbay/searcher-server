/*
 * Copyright (c) 2018., CipherGateway and/or its affiliates. All rights  reserved.
 *
 */

package com.huangyingzhi.searcher.server.module.cse;

import com.google.api.services.customsearch.Customsearch;
import com.google.api.services.customsearch.model.Search;
import com.huangyingzhi.searcher.server.config.CseConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author huangyingzhi.
 */

@Component
@RequiredArgsConstructor
public class CseServiceImpl implements CseService {

  private final Customsearch customsearch;

  private final CseConfig cseConfig;

  @Override
  public Search search(String parameter) throws IOException {
    Customsearch.Cse.List list = customsearch
      .cse()
      .list(parameter)
      .setKey(cseConfig.getKey())
      .setCx(cseConfig.getCx());

    return list.execute();
  }

}
