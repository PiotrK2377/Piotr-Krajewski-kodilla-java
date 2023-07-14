package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.BuyPredictor;

public final class BalancedPredictor implements BuyPredictor {

    @Override
    public String predictWhatToBuy() {
        return "[Balanced predictor] Buy shared units of Fund XYZ";
    }
}
