package com.mock.mockresponse.application.usecases;

import com.mock.mockresponse.domain.stockprices.MockedStockPrice;
import com.mock.mockresponse.domain.stockprices.PriceResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class StockPricesUseCase<V> {
    private final MockedStockPrice<V> mockedStockPrice;

    public Mono<PriceResponse> getStockPricesFromService(V request){
        return mockedStockPrice.getStockPrices(request);
    }
}
