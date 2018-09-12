package com.quanwc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Weixin Config
 * @author quanwenchao
 * @date 2018/8/18 18:53:05
 */
@Data
@Component
@ConfigurationProperties(prefix = "weixin")
public class WeixinConfig {
    private String appId;
    private String appSecret;
    private String token;
    private String aesKey;
}