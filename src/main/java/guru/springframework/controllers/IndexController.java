package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This controller will have the responsability
 * to the index page management.
 *
 * @author Rodriguez Acosta Ernesto Antonio
 */
@Controller
public class IndexController {

    /**
     * Returns the index page
     * @return the Thymeleaf template for index page.
     */
    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        return "index";
    }
}
