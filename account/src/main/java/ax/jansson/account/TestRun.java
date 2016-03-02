package ax.jansson.account;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
public class TestRun {

    Logger log = LoggerFactory.getLogger(TestRun.class);

    @Autowired
    private CustomerService customerService;

    @Scheduled(fixedDelay = 45000L)
    public void run() {
        while (true) {
            try {
                int test = customerService.test();
                log.info("Got {}, from service ", test);
            } catch (Exception ex) {
                log.error("Excetpions", ex);
            }

        }
    }
}
