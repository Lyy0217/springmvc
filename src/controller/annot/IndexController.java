package controller.annot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("index")
public class IndexController {

    @RequestMapping("/annot/index")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView view = new ModelAndView("index");
        view.addObject("message", "Hello index whtn annotation");

        return view;
    }

    @RequestMapping("/annot/jump")
    public ModelAndView jump() {
        ModelAndView view = new ModelAndView("redirect:/index/annot/index");

        return view;
    }

    @RequestMapping("/annot/check")
    public ModelAndView check(HttpSession session) {
        ModelAndView view = new ModelAndView("check");

        Integer cnt = (Integer) session.getAttribute("couunt");

        if (cnt == null) {
            cnt = 0;
        }
        cnt++;

        session.setAttribute("couunt", cnt);

        return view;
    }

    @RequestMapping("/annot/clear")
    public ModelAndView clear(HttpSession session) {
        ModelAndView view = new ModelAndView("check");

        Integer cnt = (Integer) session.getAttribute("couunt");

        if (cnt == null || cnt == 0) {
            return view;
        }

        cnt = 0;
        session.setAttribute("couunt", cnt);
        return view;
    }
}