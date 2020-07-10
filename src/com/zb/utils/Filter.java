package com.zb.utils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "Filter")
public class Filter implements javax.servlet.Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化过滤器");

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤器准备就绪");
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("过滤器销毁");
    }
}
