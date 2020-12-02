package com.solt.jdc.application.controller;

import com.solt.jdc.application.view.AddNumbersView;
import com.solt.jdc.framework.controller.ControllerMapping;
import com.solt.jdc.framework.controller.IController;
import com.solt.jdc.framework.ds.ModelAndView;
import com.solt.jdc.framework.model.Model;
import com.solt.jdc.framework.model.SimpleModel;

import javax.servlet.http.HttpServletRequest;

@ControllerMapping("/add-numbers")
public class AddNumberController implements IController {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest) {
        Model model = new SimpleModel();
        String str;
        int numberA = Integer.parseInt(httpServletRequest.getParameter("numberA"));
        int numberB = Integer.parseInt(httpServletRequest.getParameter("numberB"));
        model.set("numberA", String.valueOf(numberA));
        model.set("numberB", String.valueOf(numberB));
        model.set("result", String.valueOf(numberA+numberB));
        return new ModelAndView(model, new AddNumbersView());
    }
}
