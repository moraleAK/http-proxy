package com.canno.http.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HttpProxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(HttpProxyApplication.class, args);
        new HttpProxyInit().init(10000);
    }
}
