package com.zb.servlet;

import com.zb.dao.OrderDao;
import com.zb.pojo.Order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/orderUpdate")
public class OrderUpdateServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        Integer door_id = Integer.parseInt(request.getParameter("door_id"));
        String order_no = request.getParameter("order_no");
        String order_type = request.getParameter("order_type");
        Integer pnum = Integer.parseInt("pnum");
        String cashier = request.getParameter("cashier");
//        Date order_time = request.getParameter("order_time");
        String o_time = request.getParameter("o_time");
        Date order_time = Str2Date.str2date(o_time);
        String p_time = request.getParameter("pay_time");
        Date pay_time = Str2Date.str2date(p_time);
        String pay_type = request.getParameter("pay_type");
        Double price = Double.parseDouble(request.getParameter("price"));
        Order order = new Order();
        order.setId(id);
        order.setDoor_id(door_id);
        order.setOrder_no(order_no);
        order.setOrder_type(order_type);
        order.setPnum(pnum);
        order.setCashier(cashier);
//        order.setOrder_time(order_time);
//        order.setPay_time(pay_time);
        order.setPay_type(pay_type);
        order.setPrice(price);

        OrderDao orderDao = new OrderDao();
        orderDao.updateById(order);
        response.sendRedirect("/orderList");



    }
}
