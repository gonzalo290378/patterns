package com.strategy.strategyspringexample.controller;

import com.strategy.strategyspringexample.services.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchaseController {
    private final PurchaseService purchaseService;

    @Autowired
    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @GetMapping("/calculate-discount")
    public double calculateDiscount(@RequestParam double totalAmount) {
        return purchaseService.getTotalWithDiscount(totalAmount);
    }
}