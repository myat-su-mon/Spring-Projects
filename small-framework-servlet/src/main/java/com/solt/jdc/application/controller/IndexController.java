package com.solt.jdc.application.controller;

import com.solt.jdc.application.view.IndexView;
import com.solt.jdc.framework.controller.ControllerMapping;
import com.solt.jdc.framework.controller.IController;
import com.solt.jdc.framework.ds.ModelAndView;
import com.solt.jdc.framework.model.SimpleModel;

import javax.servlet.http.HttpServletRequest;

@ControllerMapping("/")
public class IndexController implements IController {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest) {
        return new ModelAndView(new SimpleModel(), new IndexView());
    }
}
