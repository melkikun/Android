package com.example.it01.android.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by IT01 on 3/21/2017.
 */

public class Product {

    @SerializedName("productCode")
    @Expose
    private Integer productCode;
    @SerializedName("productName")
    @Expose
    private String productName;
    @SerializedName("productLine")
    @Expose
    private String productLine;
    @SerializedName("productScale")
    @Expose
    private String productScale;
    @SerializedName("productVendor")
    @Expose
    private String productVendor;
    @SerializedName("productDescription")
    @Expose
    private String productDescription;
    @SerializedName("quantityInStock")
    @Expose
    private Integer quantityInStock;
    @SerializedName("buyPrice")
    @Expose
    private String buyPrice;
    @SerializedName("MSRP")
    @Expose
    private String mSRP;

    public Integer getProductCode() {
        return productCode;
    }

    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public String getProductScale() {
        return productScale;
    }

    public void setProductScale(String productScale) {
        this.productScale = productScale;
    }

    public String getProductVendor() {
        return productVendor;
    }

    public void setProductVendor(String productVendor) {
        this.productVendor = productVendor;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public String getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(String buyPrice) {
        this.buyPrice = buyPrice;
    }

    public String getMSRP() {
        return mSRP;
    }

    public void setMSRP(String mSRP) {
        this.mSRP = mSRP;
    }

}
