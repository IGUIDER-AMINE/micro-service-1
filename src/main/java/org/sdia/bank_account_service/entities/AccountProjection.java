package org.sdia.bank_account_service.entities;

import org.sdia.bank_account_service.enums.AccountType;
import org.springframework.data.rest.core.config.Projection;

//http://localhost:8081/bankAccounts?projection=p1
@Projection(types = BankAccount.class, name = "p1")
public interface AccountProjection {
    public String getId();
    public AccountType getType();
    public Double getBalance();
}
