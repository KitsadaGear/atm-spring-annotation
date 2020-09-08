package se_lab5_2.atm;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

public class DataSourceWebAPI implements DataSource {

    @Override
    public Map<Integer, Customer> readCustomers() {
        Map<Integer, Customer> customers = new HashMap<>();

        customers.put(1, new Customer(1, "หนึ่ง", 1234, 1000));
        customers.put(2, new Customer(1, "สอง", 2345, 5000));
        customers.put(3, new Customer(1, "สาม", 3456, 3000));

        return customers;
    }
}
