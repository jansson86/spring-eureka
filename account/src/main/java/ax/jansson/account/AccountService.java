package ax.jansson.account;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
public class AccountService {

    @RequestMapping
    public String test() {
        return "Account";
    }
}
