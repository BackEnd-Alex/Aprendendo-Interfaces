package apllication;

import entities.Contract;
import entities.InstallMent;
import service.ContractService;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do Contrato: ");
        System.out.print("Número: ");
        int number = sc.nextInt();
        System.out.print("Data: ");
        LocalDate date =LocalDate.parse(sc.next(), fmt);

        System.out.print("Valor do contrato: ");
        double valueTotal = sc.nextDouble();
        Contract contract = new Contract(number,date,valueTotal);
        System.out.print("Entre com o número de Parcelas: ");
        int n = sc.nextInt();
        ContractService contractService = new ContractService(null);
        contractService.processContract(contract, n);
        System.out.println("Parcelas:");
        for(InstallMent installMent: contract.getInstallments()){
            System.out.println(installMent);
        }









        
        sc.close();
    }
}
