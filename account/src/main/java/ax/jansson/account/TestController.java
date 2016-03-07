package ax.jansson.account;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    Logger log = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private CustomerService customerService;

    @RequestMapping("loop")
    public void run(@RequestParam("times") int loop) {
        for(int i = 0; i < loop; i++) {
            try {
                int test = customerService.customer();
                log.info("Got {}, from service ", test);
            } catch (Exception ex) {
                log.error("Excetpions", ex);
            }
        }
    }
}
