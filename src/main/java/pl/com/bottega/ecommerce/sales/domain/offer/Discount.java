package pl.com.bottega.ecommerce.sales.domain.offer;

/**
 * Created by Justyna on 12.12.2017.
 */
public class Discount {

    private String discountCause;

    private Money discount;

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
