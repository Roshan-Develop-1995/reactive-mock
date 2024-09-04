package com.mock.mockresponse.domain.cities;

import reactor.core.publisher.Mono;

public interface CityDetails<T, V> {
    Mono<T> getListOfCities(V request);
}
