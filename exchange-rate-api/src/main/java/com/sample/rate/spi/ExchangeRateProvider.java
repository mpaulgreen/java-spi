package com.sample.rate.spi;

import com.sample.rate.api.QuoteManager;

public interface ExchangeRateProvider {
    QuoteManager create();
}
