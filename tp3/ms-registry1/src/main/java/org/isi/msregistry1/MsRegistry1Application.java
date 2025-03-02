package org.isi.msregistry1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsRegistry1Application {

    public static void main(String[] args) {
        SpringApplication.run(MsRegistry1Application.class, args);
    }

}
