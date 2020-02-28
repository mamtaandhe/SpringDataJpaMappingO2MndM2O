package com.neo.spring.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.neo.spring.api.entity.Customer;
import com.neo.spring.api.entity.Product;
import com.neo.spring.api.repository.CustomerRepository;
import com.neo.spring.api.repository.ProductRepository;

@SpringBootApplication
public class SpringBootDataJpaMappinsApplication2 implements ApplicationRunner {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaMappinsApplication2.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
//			 Customer c1 = new Customer(29,"mamta", "mamta@gmail.com", "f");
//			 Product p1 = new Product(56, "p1", 2, 9900); 
//			 Product p2 = new Product(27,"p2", 10, 500);
//			 p1.setCustomer(c1); p2.setCustomer(c1); 
//			 List<Product> products = new ArrayList<>(); 
//			 products.add(p1); products.add(p2);
//			 c1.setProducts(products);
//			 customerRepository.save(c1);
//			 

		
//		   Customer c2 = new Customer(24,"mamta1", "mamta1@gmail.com", "f1"); 
//		   Product p11 = new Product(65 ,"p11",2, 990); 
//	 	   p11.setCustomer(c2); 
//		   
//		   Product p12 = new Product(83, "p12", 10, 500);
//		   p12.setCustomer(c2); 
//		 
//		   productRepository.save(p11);
//		   productRepository.save(p12);
		
//		  List<Customer> customers = customerRepository.findAll(); 
//		  	for(Customer c:customers) { 
//		  		System.out.println(c); 
//		  }
		
//		List<Product> products = productRepository.findAll();
//		 for(Product product:products) {
//			 System.out.println(product);
//		 }

		//productRepository.deleteById(56);
		//customerRepository.deleteById(24); 
	}

}
