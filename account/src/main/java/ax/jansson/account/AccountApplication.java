package ax.jansson.account;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableScheduling

public class AccountApplication {

    public static void main(String... args) {
        SpringApplication.run(AccountApplication.class, args);
    }


    @Bean
    public TestRun testRun() {
        return new TestRun();
    }

}
