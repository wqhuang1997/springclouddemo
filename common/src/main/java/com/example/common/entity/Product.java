package com.example.common.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Product implements Serializable {


    private static final long serialVersionUID = 1253828117450258163L;
    // ========================================================================
    // fields =================================================================
    private String itemCode;                                    // 产品货号
    private String name;                                        // 产品名称
    private String bandName;                                    // 产品品牌名称
    private int price;                                          // 产品价格(分)

    // ========================================================================
    // constructor ============================================================
    public Product() {
    }

    public Product(String itemCode, String name, String bandName, int price) {
        this.itemCode = itemCode;
        this.name = name;
        this.bandName = bandName;
        this.price = price;
    }
}
