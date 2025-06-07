package com.eldanielhumberto.springtutorial.interceptors;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TimeInterceptor implements HandlerInterceptor {
    private static final String START_TIME = "Start";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        long startTime = System.currentTimeMillis();
        request.setAttribute(START_TIME, startTime);

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            @Nullable ModelAndView modelAndView) throws Exception {
        long startTime = (long) request.getAttribute(START_TIME);
        long finalTime = System.currentTimeMillis() - startTime;

        System.out.println("Excute time: " + finalTime + " for " + request.getRequestURI());
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

}
