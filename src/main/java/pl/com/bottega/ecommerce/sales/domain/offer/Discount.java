package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Discount {

	private String discountCause;
	private Money discount;

	public Discount() {
	}

	public Discount(String discountCause, Money discount) {
		this.discountCause = discountCause;
		this.setDiscount(discount);
	}

	public String getDiscountCause() {
		return discountCause;
	}

	public void setDiscountCause(String discountCause) {
		this.discountCause = discountCause;
	}

	public Money getDiscount() {
		return discount;
	}

	public void setDiscount(Money discount) {
		this.discount = discount;
	}

}
