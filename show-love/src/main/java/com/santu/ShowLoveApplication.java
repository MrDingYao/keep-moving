package com.santu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author santu
 * @date 2020/11/16 21:51
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ShowLoveApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShowLoveApplication.class, args);
    }
}
