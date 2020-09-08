package se_lab5_2.atm;

import java.util.Map;

public interface DataSource {
    Map<Integer,Customer> readCustomers();
}
