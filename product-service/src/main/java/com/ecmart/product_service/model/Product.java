package com.ecmart.product_service.model;

import java.time.LocalDateTime;
import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

@Entity
@Table(name="Products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="Product_Name", nullable = false)
    private String name;

    @Column(name="Description", nullable = false)
    private String description;

    @Column(name="price",nullable = false)
    private double price;

    @Column(name="Quantity",nullable = false)
    private long quantity;

    @Column(name="status",nullable = false)
    private String status;

    @Column(name="Created_at",nullable = false)
    private LocalDateTime createdAt;


    public Product() {};

    public Product(long id, String name, String description, double price, long quantity, String status, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.status = status;
        this.createdAt = createdAt;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public long getQuantity() {
        return quantity;
    }
    public void setQuantity(long Quantity){
        this.quantity = Quantity;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt = createdAt;
    }

}
