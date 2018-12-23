package com.shoppinghp.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "suppliers")
public class Supplier {
    @Id
    @Column(name = "SupplierID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int supplierId;

    @Column(name = "CompanyName", unique = true, length = 200, nullable = false)
    private String companyName;

    @Column(name = "ContactName", unique = true, length = 200, nullable = false)
    private String contactName;

    @Column(name = "Address", unique = true, length = 200, nullable = false)
    private String address;

    @Column(name = "Phone", unique = true, length = 45, nullable = false)
    private String phone;

    @Column(name = "Fax", unique = true, length = 45, nullable = true)
    private String fax;

    @Column(name = "Email", unique = true, length = 200, nullable = true)
    private String email;

    @Column(name = "Website", unique = true, length = 200, nullable = true)
    private String website;

    @Column(name = "Note", unique = true, length = 1000, nullable = true)
    private String note;

    @OneToMany(mappedBy = "supplier", cascade = CascadeType.ALL)
    private Set<Product> products;

    @Column(name = "IsActive", nullable = false)
    private short isActive;

    public Supplier() {}

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
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

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public short getIsActive() {
        return isActive;
    }

    public void setIsActive(short isActive) {
        this.isActive = isActive;
    }
}
