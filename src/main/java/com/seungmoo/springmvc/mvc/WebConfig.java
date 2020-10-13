package com.seungmoo.springmvc.mvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// @Configuration + WebMvcConfigurer : 기존 스프링부트의 MVC설정을 받고 추가적인 커스텀 설정 셋팅
@Configuration
public class WebConfig implements WebMvcConfigurer {
}
