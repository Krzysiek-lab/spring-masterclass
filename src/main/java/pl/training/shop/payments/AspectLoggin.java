package pl.training.shop.payments;


import lombok.extern.java.Log;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Log
@Aspect
public class AspectLoggin {

    private static final String LongFormat = "A new payment of %s has been initiated";

    private String createLogEntry(Payment payment) {
        return String.format(LongFormat, payment.getMoney());
    }


    @AfterReturning(value = "@annotation(CreateAnnotation)",returning = "payment")
    public void logging(Payment payment){
        log.info(createLogEntry(payment));
    }
}
