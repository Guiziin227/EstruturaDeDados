package a6.model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Contract {
    private Integer numberAccount;
    private Double totalAmount;
    private LocalDate date;

    List<Installment> installments = new ArrayList<>();

    public Contract(Integer numberAccount, Double totalAmount, LocalDate date) {
        this.numberAccount = numberAccount;
        this.totalAmount = totalAmount;
        this.date = date;
    }

    public Integer getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(Integer numberAccount) {
        this.numberAccount = numberAccount;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contract contract = (Contract) o;
        return Objects.equals(numberAccount, contract.numberAccount);
    }

}
