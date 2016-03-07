package ax.jansson.customer;

import ax.jansson.customer.remote.AccountService;
import org.apache.log4j.spi.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    private final Logger log = org.slf4j.LoggerFactory.getLogger(TestController.class);
    @Autowired
    private AccountService accountService;

    @RequestMapping("loop")
    public void run(@RequestParam("times") int loop) {
        for(int i = 0; i < loop; i++) {
            try {
                String test = accountService.account();
                log.info("Got {}, from service ", test);
            } catch (Exception ex) {
                log.error("Excetpions", ex);
            }
        }
    }
}
