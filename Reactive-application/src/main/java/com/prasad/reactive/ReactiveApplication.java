package com.prasad.reactive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.prasad.reacive.repository.AccountRepository;
import com.prasad.reactive.model.Account;

import reactor.core.publisher.Flux;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.prasad.reactive")
public class ReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveApplication.class, args);
		
	}
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Bean
	public CommandLineRunner initData(AccountRepository accountRepository) {
		
		return args->
		{
			Flux<Account> accounts=Flux.just(
					new Account(1L,680,9L),
					new Account(2L,755,7L),
					new Account(3L,958,8L),
					new Account(4L,345,3L),
					new Account(5L,567,2L),
					new Account(6L,256,6L),
					new Account(7L,768,7L),
					new Account(8L,887,8L),
					new Account(9L,678,1L)
					);
			accounts.subscribe(account->accountRepository.save(account));
		};
	}
}
