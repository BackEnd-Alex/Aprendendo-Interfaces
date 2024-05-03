package service;

import entities.Contract;
import entities.InstallMent;

import java.time.LocalDate;

public class ContractService  {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }
    public void processContract(Contract contract, int months){

        contract.getInstallments().add(new InstallMent(LocalDate.of(2018,7,25),206.04));
        contract.getInstallments().add(new InstallMent(LocalDate.of(2018,8,25),208.08));

    }

}
