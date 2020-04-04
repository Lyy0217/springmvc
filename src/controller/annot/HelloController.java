package controller.annot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("/annot/hello")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView view = new ModelAndView("hello");

        view.addObject("message", "Hello Word with annotation");

        return view;
    }

    @RequestMapping("/annot/jump")
    public ModelAndView jump() {
        ModelAndView view = new ModelAndView("redirect:/hello/annot/hello");

        return view;
    }
}