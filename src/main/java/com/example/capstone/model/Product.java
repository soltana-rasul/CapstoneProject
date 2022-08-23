package com.example.capstone.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Product")
public class Product implements Serializable {

    @Id @Column(name = "productId", nullable = false, unique = true)
    Long productId;

    @Column(name = "product")
    private String productName;
    @Column(name = "description")
    private String productDescription;
    @Column(name = "category")
    private String productCategory;
    @Column(name = "inventory_count")
    private Long inventoryCount;
    @Column(name = "price")
    private Long price;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public Long getInventoryCount() {
        return inventoryCount;
    }

    public void setInventoryCount(Long inventoryCount) {
        this.inventoryCount = inventoryCount;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", inventoryCount=" + inventoryCount +
                ", price=" + price +
                '}';
    }
}
