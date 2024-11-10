package com.example.springsecuritymaster12102022;

import com.example.springsecuritymaster12102022.dao.CustomerDao;
import com.example.springsecuritymaster12102022.ds.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class SpringSecurityMaster12102022Application {

    @Autowired
    private CustomerDao customerDao;

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityMaster12102022Application.class, args);
    }

    @Bean
    @Transactional
    @Profile("dev")
    public ApplicationRunner runner() {
        return runner -> {
            Customer c1 = new Customer(
                    "AB",
                    "John",
                    "Doe",
                    "Saint Mountain Belly Bridge"
            );
            Customer c2 = new Customer(
                    "BC",
                    "Barkaley",
                    "Clara",
                    "Dream Land"
            );
            Customer c3 = new Customer(
                    "DE",
                    "Ashaley",
                    "Asans",
                    "Dark Buffalo Bridge Road"
            );
            Customer c4 = new Customer(
                    "TH",
                    "Thomas",
                    "Hardy",
                    "Green Grass Wexssex"
            );
            Customer c5 = new Customer(
                    "TM",
                    "Thomas",
                    "Mann",
                    "Park Avenue"
            );
            customerDao.save(c1);
            customerDao.save(c2);
            customerDao.save(c3);
            customerDao.save(c4);
            customerDao.save(c5);

        };
    }

}
