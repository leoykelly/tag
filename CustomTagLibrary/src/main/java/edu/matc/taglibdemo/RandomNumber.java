package edu.matc.taglibdemo;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by Kelly on 3/27/2017.
 */
public class RandomNumber extends SimpleTagSupport {
    public void doTag() throws JspException, IOException {

        double number = Math.random();
        super.doTag();
        JspWriter out = getJspContext().getOut();

        out.println("Random Number:" + number);

    }
}