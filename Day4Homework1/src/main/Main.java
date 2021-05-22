package main;

import java.time.LocalDate;


import Abstract.BaseCustomerManager;

import Adapters.MernisServiceAdapter;

import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1, "Mahmut Can", "Çankaya", LocalDate.of(1999, 8, 25),"10384800770");
		System.out.println("Yeni Müþteri : "+customer1.getFirstName());
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer1);
		
		
		

	}

}
