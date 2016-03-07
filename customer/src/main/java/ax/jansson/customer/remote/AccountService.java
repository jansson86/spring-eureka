package ax.jansson.customer.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "account")
public interface AccountService {

    @RequestMapping(value = "account", method = RequestMethod.GET)
    String account();
}
