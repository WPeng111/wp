package com.zb.servlet;

import com.zb.dao.OrderDao;
import com.zb.pojo.Order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/orderInfo")
public class OrderInfoServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        //根据门店id查询门店信息
        OrderDao orderDao = new OrderDao();
        Order order = orderDao.findById(id);
        System.out.println(order);
        request.setAttribute("order",order);
        request.getRequestDispatcher("/order_update.jsp").forward(request,response);

    }
}
