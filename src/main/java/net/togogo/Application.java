package net.togogo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lingeros
 * @date 8/10/18
 **/

@EnableEurekaServer
@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}
