package info.tranxuanvinh.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import info.tranxuanvinh.demo.entities.Transaction;

public interface TransactionRepository extends CrudRepository<Transaction, Integer> {

}
