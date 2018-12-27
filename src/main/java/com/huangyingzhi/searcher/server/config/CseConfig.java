/*
 * Copyright (c) 2018., CipherGateway and/or its affiliates. All rights  reserved.
 *
 */

package com.huangyingzhi.searcher.server.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author huangyingzhi.
 */

@Data
@Component
@ConfigurationProperties("search.cse")
public class CseConfig {

  private String key;

  private String cx;

}
