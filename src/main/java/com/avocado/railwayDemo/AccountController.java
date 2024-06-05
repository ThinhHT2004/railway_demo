package com.avocado.railwayDemo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/create")
    public void createAccount(@RequestBody Account account){
        accountRepo.save(account);
    }
}
