package a6.model.services;

import a6.model.entities.Contract;
import a6.model.entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months){
        double valorPMes = contract.getTotalAmount() / months;
        for (int i = 0; i < months; i++){
            LocalDate dueDate = contract.getDate().plusMonths(i);
            Double interest = onlinePaymentService.interest(valorPMes,i+1);
            Double paymentFee = onlinePaymentService.paymentFee(interest);

            Double total = valorPMes + interest + paymentFee;
            contract.getInstallments().add(new Installment(dueDate,total));
        }
    }
}
