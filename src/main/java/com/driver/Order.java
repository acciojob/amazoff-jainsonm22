package com.driver;

public class Order {

    private String id;
    private int deliveryTime;

    public Order(String id, String deliveryTime) {

       this.id=id;
       Integer hours=Integer.valueOf(deliveryTime.substring(0,2));
       Integer minutes=Integer.valueOf(deliveryTime.substring(3));
       this.deliveryTime=hours*60+minutes;

    }

    public String getId() {
        return id;
    }

    public int getDeliveryTime() {return deliveryTime;}
}
