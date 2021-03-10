package pl.training.shop.payments;

import lombok.Setter;

import java.util.Locale;

public class IncrementalPaymentIdGenerator implements PaymentIdGenerator {


    private static final String idFormat = "%010d";

    @Setter
    private long index;

    @Override
    public String getNext() {
        return String.format(idFormat,++index);
    }
}
