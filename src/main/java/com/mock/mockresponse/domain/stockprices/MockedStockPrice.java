package com.mock.mockresponse.domain.stockprices;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class MockedStockPrice<V> implements StockPrices<PriceResponse, V> {

    @Override
    public Mono<PriceResponse> getStockPrices(V request) {
        return Mono.just(
                        PriceResponse.builder()
                                .price(String.valueOf(Math.random()))
                                .build()
                )
                .doOnNext(response -> log.info("[Mocked Stock Price] Response: " + response))
                .doOnError(error -> log.error("[Mocked Stock Price] Error encountered: " + error));
    }
}
