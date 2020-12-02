package com.solt.jdc.framework.controller;

import com.solt.jdc.framework.ds.ModelAndView;

import javax.servlet.http.HttpServletRequest;

public interface IController {
    ModelAndView handleRequest(HttpServletRequest httpServletRequest);
}
