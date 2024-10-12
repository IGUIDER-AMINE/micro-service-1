package org.sdia.bank_account_service.repositories;

import org.sdia.bank_account_service.entities.BankAccount;
import org.sdia.bank_account_service.enums.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource // ou démarrge démarre moi un web service REST full qui permit de gérer l'entité BankAccount
//http://localhost:8081/bankAccounts
public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
    //http://localhost:8081/bankAccounts/search/findByType?type=SAVING_ACCOUNT
    //http://localhost:8081/bankAccounts/search/byType?t=SAVING_ACCOUNT
    @RestResource(path="/byType")
    List<BankAccount> findByType(@Param("t") AccountType type);

}
