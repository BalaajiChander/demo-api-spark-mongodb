package com.wendysa.apidemo.models;

import java.math.BigDecimal;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("gamingpc")
public class GamingPc {
    @Id
    private ObjectId id;
    private String name;
    private BigDecimal price;
    private boolean inStock;

    GamingPc() {}

    public ObjectId getId() {
        return this.id;
    }

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    public BigDecimal getPrice() { return this.price; }    
    public void setPrice(BigDecimal price) { this.price = price; }

    public boolean getInStock() { return this.inStock; }
    public void setInStock(boolean inStock) { this.inStock = inStock; }
}