package com.strategy.strategyspringexample.patron.strategy;

import com.strategy.strategyspringexample.patron.DiscountStrategy;
import org.springframework.stereotype.Component;

@Component
public class NoDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount;
    }
}
