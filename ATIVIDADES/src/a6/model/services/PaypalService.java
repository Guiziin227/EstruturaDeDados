package a6.model.services;

public class PaypalService implements OnlinePaymentService{

    @Override
    public double interest(Double amount, Integer months) {
        return amount * 0.01 * months;
    }

    @Override
    public double paymentFee(Double amount) {
        return amount += amount * 0.02;
    }
}
