package com.zb.pojo;


import java.sql.Date;

public class Order {
    private Integer id;
    private Integer door_id;
    private String Order_no;
    private String Order_type;
    private Integer pnum;
    private String cashier;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", door_id=" + door_id +
                ", Order_no='" + Order_no + '\'' +
                ", Order_type='" + Order_type + '\'' +
                ", pnum=" + pnum +
                ", cashier='" + cashier + '\'' +
                ", order_time=" + order_time +
                ", pay_time=" + pay_time +
                ", pay_type='" + pay_type + '\'' +
                ", price=" + price +
                '}';
    }
    private Date order_time;
    private Date pay_time;

    public Date getPay_time() {
        return pay_time;
    }

    public void setPay_time(Date pay_time) {
        this.pay_time = pay_time;
    }

    public Date getOrder_time() {
        return order_time;
    }

    public void setOrder_time(Date order_time) {
        this.order_time = order_time;
    }

    private String pay_type;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getPnum() {
        return pnum;
    }

    public void setPnum(Integer pnum) {
        this.pnum = pnum;
    }

    public String getPay_type() {
        return pay_type;
    }

    public void setPay_type(String pay_type) {
        this.pay_type = pay_type;
    }



    public String getOrder_type() {
        return Order_type;
    }

    public void setOrder_type(String order_type) {
        Order_type = order_type;
    }



    public String getOrder_no() {
        return Order_no;
    }

    public void setOrder_no(String order_no) {
        Order_no = order_no;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDoor_id() {
        return door_id;
    }

    public void setDoor_id(Integer door_id) {
        this.door_id = door_id;
    }

    public String getCashier() {
        return cashier;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier;
    }
}
