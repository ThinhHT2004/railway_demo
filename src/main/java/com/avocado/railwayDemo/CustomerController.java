package com.avocado.railwayDemo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/customer")
@AllArgsConstructor
public class CustomerController {
    private final static List<Customer> list = List.of(new Customer("Tan Thinh", 20),
                                                        new Customer("Avocaodo", 20));

    @GetMapping("/customers")
    public List<Customer> getCustomers(){
        return list;
    }
}
