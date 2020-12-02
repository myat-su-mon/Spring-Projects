package com.solt.jdc.application.controller;

import com.solt.jdc.application.view.SquareNumberView;
import com.solt.jdc.framework.controller.ControllerMapping;
import com.solt.jdc.framework.controller.IController;
import com.solt.jdc.framework.ds.ModelAndView;
import com.solt.jdc.framework.model.Model;
import com.solt.jdc.framework.model.SimpleModel;

import javax.servlet.http.HttpServletRequest;

@ControllerMapping("/square-number")
public class SquareNumberController implements IController {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest) {
        Model model = new SimpleModel();
        int number = Integer.parseInt(httpServletRequest.getParameter("number"));
        int numberSquare = (int)Math.pow(number,2);
        model.set("number", String.valueOf(number));
        model.set("numberSquare", String.valueOf(numberSquare));
        return new ModelAndView(model, new SquareNumberView());
    }
}
