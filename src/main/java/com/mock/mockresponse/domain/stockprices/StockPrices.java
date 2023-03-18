package com.mock.mockresponse.domain.stockprices;

import reactor.core.publisher.Mono;

public interface StockPrices<T, V> {
    Mono<T> getStockPrices(V request);
}
