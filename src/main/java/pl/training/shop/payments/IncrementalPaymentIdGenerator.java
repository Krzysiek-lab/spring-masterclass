package pl.training.shop.payments;
import lombok.Setter;
import org.springframework.stereotype.Component;


//@Component// zmienilem na generetaor z klsy mojej UUIDGenerator poprzez poprostu zakomentowanie tu @Component i dodanie tam jej
public class IncrementalPaymentIdGenerator implements PaymentIdGenerator {


    private static final String idFormat = "%010d";

    @Setter
    private long index;

    @Override
    public String getNext() {
        return String.format(idFormat,++index);
    }
}
