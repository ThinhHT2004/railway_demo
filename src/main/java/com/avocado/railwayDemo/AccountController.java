package com.avocado.railwayDemo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/account")
@AllArgsConstructor
public class AccountController {

    private AccountRepo accountRepo;

    @GetMapping
    public List<Account> getAccounts(){
        return accountRepo.findAll();
    }
}
