package com.nit;

public class FoodDeliveryContext {

    private DeliveryService deliveryService;

    public void setDeliveryService(DeliveryService deliveryService) {

        this.deliveryService = deliveryService;

    }

    public void executeDelivery() {

        deliveryService.deliverOrder();

    }

}
