package com.strategy.strategyspringexample.services;


import com.strategy.strategyspringexample.patron.strategy.NoDiscountStrategy;
import com.strategy.strategyspringexample.patron.strategy.TenPercentDiscountStrategy;
import com.strategy.strategyspringexample.patron.strategy.TwentyPercentDiscountStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseService {
    private final NoDiscountStrategy noDiscountStrategy;
    private final TenPercentDiscountStrategy tenPercentDiscountStrategy;
    private final TwentyPercentDiscountStrategy twentyPercentDiscountStrategy;

    @Autowired
    public PurchaseService(NoDiscountStrategy noDiscountStrategy,
                           TenPercentDiscountStrategy tenPercentDiscountStrategy,
                           TwentyPercentDiscountStrategy twentyPercentDiscountStrategy) {
        this.noDiscountStrategy = noDiscountStrategy;
        this.tenPercentDiscountStrategy = tenPercentDiscountStrategy;
        this.twentyPercentDiscountStrategy = twentyPercentDiscountStrategy;
    }

    public double getTotalWithDiscount(double totalAmount) {
        if (totalAmount > 2000) {
            return twentyPercentDiscountStrategy.applyDiscount(totalAmount);
        } else if (totalAmount > 1000) {
            return tenPercentDiscountStrategy.applyDiscount(totalAmount);
        } else {
            return noDiscountStrategy.applyDiscount(totalAmount);
        }
    }
}