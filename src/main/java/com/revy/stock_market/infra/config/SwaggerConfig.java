package com.revy.stock_market.infra.config;

import com.revy.stock_market.common.constants.CommonConstant;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(title = "실시간 Stock 랭킹",
                description = "실시간 Stock 랭킹 API 명세",
                version = "v1"))
@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi chatOpenApi() {
        String[] paths = {
                CommonConstant.API_V1 + "/**"
                , CommonConstant.API_V2 + "/**"
        };

        return GroupedOpenApi.builder()
                .group("실시간 Stock 랭킹 API")
                .pathsToMatch(paths)
                .build();
    }

}
