package com.sample.rate.impl;

import com.sample.rate.api.QuoteManager;
import com.sample.rate.spi.ExchangeRateProvider;

public class DefaultFinanceExchangeRateProvider implements ExchangeRateProvider {
    @Override
    public QuoteManager create() {
        return new DefaultFinanceExchangeRateProviderImpl();
    }
}
