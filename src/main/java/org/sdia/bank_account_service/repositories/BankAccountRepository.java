package org.sdia.bank_account_service.repositories;

import org.sdia.bank_account_service.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
}
