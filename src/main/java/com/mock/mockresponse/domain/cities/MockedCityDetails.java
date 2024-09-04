package com.mock.mockresponse.domain.cities;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@Slf4j
public class MockedCityDetails<V> implements CityDetails<List<CityResponse>, V> {

    @Override
    public Mono<List<CityResponse>> getListOfCities(Object request) {
        return Mono.just(
                List.of(
                        CityResponse.builder().id(1).cityName("Kolkata").build(),
                        CityResponse.builder().id(2).cityName("Jaipur").build(),
                        CityResponse.builder().id(3).cityName("Manali").build(),
                        CityResponse.builder().id(4).cityName("Kasol").build(),
                        CityResponse.builder().id(5).cityName("Rishikesh").build(),
                        CityResponse.builder().id(6).cityName("Amritsar").build(),
                        CityResponse.builder().id(7).cityName("Dawrka").build(),
                        CityResponse.builder().id(8).cityName("Mathura").build(),
                        CityResponse.builder().id(9).cityName("Vrindavan").build(),
                        CityResponse.builder().id(10).cityName("Gokul").build()
                        )
        )
                .doOnNext(response -> log.info("[Mocked Stock Price] Response: " + response))
                .doOnError(error -> log.error("[Mocked Stock Price] Error encountered: " + error));
    }
}
