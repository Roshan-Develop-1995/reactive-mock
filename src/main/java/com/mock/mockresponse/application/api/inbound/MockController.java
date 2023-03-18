package com.mock.mockresponse.application.api.inbound;

import com.mock.mockresponse.application.usecases.StockPricesUseCase;
import com.mock.mockresponse.domain.stockprices.PriceResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@Validated
@RequiredArgsConstructor
public class MockController<V> {

    private static final String STOCKPRICE_URL = "/stock/price/v1/enquiry";
    private final StockPricesUseCase<V> stockPricesUseCase;

    @PostMapping(value = STOCKPRICE_URL,
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public Mono<PriceResponse> getStockPrices(@RequestBody V request){
        return stockPricesUseCase.getStockPricesFromService(request);
    }
}
