package com.shoppinghp.entity;

import javax.persistence.*;
import java.util.Date;

//@Entity
//@Table(name = "accounts")
public class Account {
    //@Id
    //@Column(name = "Email", length = 200, nullable = false)
    private String email;
    //@Column(name = "Password", length = 30, nullable = false)
    private String password;
    //@Column(name = "Role", length = 45, nullable = false)
    private String role;
    //@Column(name = "Fullname", length = 200, nullable = false)
    private String fullName;
    //@Column(name = "Address", length = 200, nullable = false)
    private String address;
    //@Column(name = "Phone", length = 45)
    private String phone;
    //@Column(name = "BillingAddress", length = 200)
    private String billingAddress;
    //@Column(name = "ShipAddress", length = 200)
    private String shipAddress;
    //@Column(name = "DateEntered")
    private Date dateEntered;
    //@Lob @Basic(fetch = FetchType.LAZY)
    //@Column(name = "Image", length = 100000)
    private byte[] image;
    @Column(name = "IsActive", nullable = false)
    private short isActive;

    public Account() {}

    public Account(Account acc) {
        this.email = acc.getEmail();
        this.password = acc.getPassword();
        this.role = acc.getRole();
        this.fullName = acc.getFullName();
        this.address = acc.getAddress();
        this.phone = acc.phone;
        this.billingAddress = acc.getBillingAddress();
        this.shipAddress = acc.getShipAddress();
        this.dateEntered = acc.getDateEntered();
        this.image = acc.getImage();
        this.isActive = acc.getIsActive();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public Date getDateEntered() {
        return dateEntered;
    }

    public void setDateEntered(Date dateEntered) {
        this.dateEntered = dateEntered;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public short getIsActive() {
        return isActive;
    }

    public boolean getIsActiveBoolean() {
        return isActive == 1? true : false;
    }

    public void setIsActive(short isActive) {
        this.isActive = isActive;
    }
}
