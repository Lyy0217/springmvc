package controller.annot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pojo.Product;

@Controller
@RequestMapping("product")
public class ProductController {

    @RequestMapping("/addProduct")
    public ModelAndView add(Product product) {
        ModelAndView view = new ModelAndView("showProduct");

        return view;
    }
}