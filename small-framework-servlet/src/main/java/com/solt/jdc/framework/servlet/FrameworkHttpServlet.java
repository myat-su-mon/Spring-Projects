package com.solt.jdc.framework.servlet;

import com.solt.jdc.framework.controller.IController;
import com.solt.jdc.framework.ds.ModelAndView;
import com.solt.jdc.framework.model.Model;
import com.solt.jdc.framework.utils.ApplicationControllerFinder;
import com.solt.jdc.framework.view.View;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "framework-servlet", urlPatterns = "/*")
public class FrameworkHttpServlet extends HttpServlet {

    private Map<String, IController> uriToControllerMap;

    @Override
    public void init() throws ServletException {
        uriToControllerMap = new ApplicationControllerFinder().findControllers();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestURI = req.getRequestURI();
        IController controller = uriToControllerMap.get(requestURI);

        if (controller != null) {
            ModelAndView modelAndView = controller.handleRequest(req);
            Model model = modelAndView.getModel();
            View view = modelAndView.getView();

            String renderedView = view.render(model);
            resp.setContentType("text/html");
            resp.getWriter().print(renderedView);
        } else {
            throw new ServletException(String.format("Unable to find controller for request uri [%s] ", requestURI));
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }


}
