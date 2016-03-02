package ax.jansson.account;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "customer")
public interface CustomerService {

    @RequestMapping(value = "customer", method = RequestMethod.GET)
    int test();
}
