package com.producttrackingproject;

import java.util.Date;

import lombok.Data;

@Data
public class ProductDelivery {

    private String productName;
    private String productShippingAddress;
    private float productPrice;
    private int productQuantity;
    private Date productPlaceDate;

}
