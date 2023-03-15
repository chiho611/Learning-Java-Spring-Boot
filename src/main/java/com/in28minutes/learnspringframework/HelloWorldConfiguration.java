package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {
}

record Address(String firstLine, String city) {
}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Ranga";
    }

    @Bean
    public int age() {
        return 15;
    }

    @Bean
    public Person person() {
        var person = new Person("Ravi", 20, new Address("Main Street", "Utrecht"));
        return person;
    }

    @Bean
    public Person person2MethodCall() {
        var person = new Person(name(), age(), address()); //name // age
        return person;
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3) {
        var person = new Person(name, age, address3);
        return person;
    }

    @Bean(name = "address2")
    public Address address() {
        var address = new Address("Baker Street", "London");
        return address;
    }

    @Bean(name = "address3")
    public Address address3() {
        var address = new Address("Motinagar", "Hyderabad");
        return address;
    }

}
