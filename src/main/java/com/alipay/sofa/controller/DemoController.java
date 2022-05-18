package com.alipay.sofa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.StringWriter;

@Controller
public class DemoController {
    @RequestMapping(value = "/test1")
    @ResponseBody
    private void metrics(HttpServletResponse response) throws IOException {
        StringWriter writer = new StringWriter();
        response.setHeader("Content-Type", "text/plain; version=0.0.4; charset=utf-8");
        writer.append("hello world!");
        response.getOutputStream().print(writer.toString());
    }
}
