package com.shoppinghp;

import com.shoppinghp.entity.Account;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication
public class ShoppinghpApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppinghpApplication.class, args);
	}

	@EventListener(ShoppinghpApplication.class)
	public void afterStartup() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ecommerce");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();

		String email = "khanhhuy215@gmail.com";
		Account account = entityManager.find(Account.class, email);

		System.out.println(account.getFullName());

		entityManager.getTransaction().commit();
		entityManager.close();
		factory.close();
	}
}
