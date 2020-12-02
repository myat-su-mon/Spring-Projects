package com.solt.jdc.application.view;

import com.solt.jdc.framework.model.Model;
import com.solt.jdc.framework.view.View;

public class AddNumbersView implements View {
    @Override
    public String render(Model model) {
        return String.format(
                "Result of adding numberA = [%s] and numberB = [%s] is [%s]",
                model.get("numberA"), model.get("numberB"), model.get("result")
        );
    }
}
