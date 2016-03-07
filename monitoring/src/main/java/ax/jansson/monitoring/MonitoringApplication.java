package ax.jansson.monitoring;


import com.netflix.discovery.EurekaClient;
import com.netflix.turbine.discovery.InstanceDiscovery;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.cloud.netflix.turbine.TurbineProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableHystrixDashboard
@EnableEurekaClient
@EnableTurbine
public class MonitoringApplication {


    public static void main (String... args) {
        SpringApplication.run(MonitoringApplication.class);
    }

    @Bean
    public InstanceDiscovery instanceDiscovery(EurekaClient eurekaClient, TurbineProperties turbinePoperties) {
        return new CustomInstanceDiscovery(turbinePoperties, eurekaClient);
    }
}
