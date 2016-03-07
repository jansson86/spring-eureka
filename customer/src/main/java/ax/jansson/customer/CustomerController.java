package ax.jansson.customer;


import ax.jansson.customer.remote.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {


    @RequestMapping
    public int customer() {
        return 1;
    }



}

