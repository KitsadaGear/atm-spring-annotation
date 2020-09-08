package se_lab5_2.atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");



        Bank bank = context.getBean(Bank.class);
        System.out.println(bank.getName());
    }
}
