package ax.jansson.customer;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @RequestMapping
    public int test() {
        return 1;
    }
}
