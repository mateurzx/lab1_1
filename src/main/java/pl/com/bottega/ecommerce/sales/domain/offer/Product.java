package pl.com.bottega.ecommerce.sales.domain.offer;

import java.util.Date;

public class Product {
    private String productId;
    private Money productPrice;
    private String productName;
    private Date productSnapshotDate;
    private String productType;

    public Product() {
	super();
    }

    public Product(String productId, Money productPrice, String productName, Date productSnapshotDate,
	    String productType) {
	super();
	this.productId = productId;
	this.productPrice = productPrice;
	this.productName = productName;
	this.productSnapshotDate = productSnapshotDate;
	this.productType = productType;
    }

    public void setProductId(String productId) {
	this.productId = productId;
    }

    public void setProductPrice(Money productPrice) {
	this.productPrice = productPrice;
    }

    public void setProductName(String productName) {
	this.productName = productName;
    }

    public void setProductSnapshotDate(Date productSnapshotDate) {
	this.productSnapshotDate = productSnapshotDate;
    }

    public String getProductId() {
	return productId;
    }

    public void setProductType(String productType) {
	this.productType = productType;
    }

    public Money getProductPrice() {
	return productPrice;
    }

    public String getProductName() {
	return productName;
    }

    public Date getProductSnapshotDate() {
	return productSnapshotDate;
    }

    public String getProductType() {
	return productType;
    }

}
