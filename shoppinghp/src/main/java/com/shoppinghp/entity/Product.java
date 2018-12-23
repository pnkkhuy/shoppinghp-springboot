package com.shoppinghp.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @Column(name = "ProductID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    @Column(name = "ProductName", unique = true, length = 200, nullable = false)
    private String productName;

    @Column(name = "ProductDescription")
    private String productDescription;

    @ManyToOne
    @JoinColumn(name = "SupplierID", nullable = true)
    private Supplier supplier;

    @ManyToOne
    @JoinColumn(name = "CategoryID", nullable = true)
    private Category category;

    @Column(name = "QuantityPerUnit")
    private String quantityPerUnit;

    @Column(name = "UnitPrice")
    private BigDecimal unitPrice;

    @Column(name = "AvailableSize", length = 200)
    private String availableSize;

    @Column(name = "AvailableColors", length = 200)
    private String availableColors;

    @Column(name = "Size", length = 200)
    private String size;

    @Column(name = "Color", length = 200)
    private String color;

    @Column(name = "Discount")
    private BigDecimal discount;

    @Column(name = "UnitWeight", length = 45)
    private String unitWeight;

    @Column(name = "UnitOnStock", length = 45)
    private String unitOnStock;

    @Column(name = "UnitOnOrder", length = 45)
    private String unitOnOrder;

    @Column(name = "IsActive", nullable = false)
    private short isActive;

    public Product() {}

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
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

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getAvailableSize() {
        return availableSize;
    }

    public void setAvailableSize(String availableSize) {
        this.availableSize = availableSize;
    }

    public String getAvailableColors() {
        return availableColors;
    }

    public void setAvailableColors(String availableColors) {
        this.availableColors = availableColors;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public String getUnitWeight() {
        return unitWeight;
    }

    public void setUnitWeight(String unitWeight) {
        this.unitWeight = unitWeight;
    }

    public String getUnitOnStock() {
        return unitOnStock;
    }

    public void setUnitOnStock(String unitOnStock) {
        this.unitOnStock = unitOnStock;
    }

    public String getUnitOnOrder() {
        return unitOnOrder;
    }

    public void setUnitOnOrder(String unitOnOrder) {
        this.unitOnOrder = unitOnOrder;
    }

    public short getIsActive() {
        return isActive;
    }

    public void setIsActive(short isActive) {
        this.isActive = isActive;
    }
}
