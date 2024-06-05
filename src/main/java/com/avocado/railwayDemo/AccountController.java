package com.avocado.railwayDemo;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Account> createAccount(@RequestBody Account account){
        return ResponseEntity.ok(accountRepo.save(account));
    }
}
