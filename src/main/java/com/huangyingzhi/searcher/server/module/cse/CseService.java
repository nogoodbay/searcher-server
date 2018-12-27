/*
 * Copyright (c) 2018., CipherGateway and/or its affiliates. All rights  reserved.
 *
 */

package com.huangyingzhi.searcher.server.module.cse;

import com.google.api.services.customsearch.model.Search;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 *
 * Cse Service interface
 *
 * @author huangyingzhi.
 */

@Service
public interface CseService {

  /**
   *
   * 使用CSE搜索指定的parameter关键字
   *
   * @param parameter 指定的关键字
   * @return 搜索结果
   */
  Search search(String parameter) throws IOException;

}
