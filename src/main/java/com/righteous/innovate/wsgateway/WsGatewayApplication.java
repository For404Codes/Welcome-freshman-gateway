package com.righteous.innovate.wsgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class WsGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(WsGatewayApplication.class, args);
    }

}
