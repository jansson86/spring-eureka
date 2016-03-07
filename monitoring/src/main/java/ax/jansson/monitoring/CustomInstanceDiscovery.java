package ax.jansson.monitoring;

import com.netflix.discovery.EurekaClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.turbine.EurekaInstanceDiscovery;
import org.springframework.cloud.netflix.turbine.TurbineProperties;

public class CustomInstanceDiscovery extends EurekaInstanceDiscovery {
    private final Logger logger = LoggerFactory.getLogger(CustomInstanceDiscovery.class);
    public CustomInstanceDiscovery(TurbineProperties turbineProperties, EurekaClient eurekaClient) {
        super(turbineProperties, eurekaClient);
        logger.info("Constructor called");
    }

    @Override
    protected String getClusterName(Object object) {
        logger.info("Returning clusternmae");
        return "eurekacluster";
    }
}
