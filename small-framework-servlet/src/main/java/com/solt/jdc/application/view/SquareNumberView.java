package com.solt.jdc.application.view;

import com.solt.jdc.framework.model.Model;
import com.solt.jdc.framework.view.View;

public class SquareNumberView implements View {
    @Override
    public String render(Model model) {
        return String.format(
                "Result of square-number [%s] is [%s]",
                model.get("number"), model.get("numberSquare"));
    }
}
