package a6;

import a6.model.entities.Contract;
import a6.model.entities.Installment;
import a6.model.services.ContractService;
import a6.model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Contract> list = new ArrayList<>();

        Contract contrato;
        int escolha;

        System.out.println("Cadastrando a primeira conta");
        do {

            System.out.println("Digite o numero da conta: ");
            int numeroConta = sc.nextInt();

            boolean contaExiste = false;
            for (Contract c : list){
                if (c.getNumberAccount() == numeroConta){
                    contaExiste = true;
                    break;
                }
            }

            if (!contaExiste){
                System.out.println("Digite a data");
                LocalDate dataDep = LocalDate.parse(sc.next(), fmt);
                System.out.println("Valor contrato");
                double valorContrato = sc.nextDouble();
                System.out.println("Quantas parcelas?");
                int parcelas = sc.nextInt();

                contrato = new Contract(numeroConta, valorContrato, dataDep);
                ContractService service = new ContractService(new PaypalService());
                service.processContract(contrato, parcelas);
                list.add(contrato);
                System.out.println("Conta cadastrada com sucesso");
            } else {
                System.out.println("O cadastro dessa conta já existe");
            }

            System.out.println("Deseja fazer outro cadastro?");
            escolha = sc.nextInt();

        } while (escolha != 0);

        for (Contract c : list){
            System.out.println("Contas do " + c.getNumberAccount());
            for (Installment i : c.getInstallments()){
                System.out.println(i);
            }
        }
    }
}
