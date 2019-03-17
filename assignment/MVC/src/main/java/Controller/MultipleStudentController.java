package Controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MultipleStudentController extends MultiActionController{
    public ModelAndView dummy(HttpServletRequest request,HttpServletResponse response)
    {
        ModelAndView modelAndView = new ModelAndView("dummy");
        return modelAndView;
    }
    public void dummy2(HttpServletRequest request,HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.getWriter().println("<b>Hello World</b>");
    }
}