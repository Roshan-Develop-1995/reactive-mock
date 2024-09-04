package com.mock.mockresponse.application.usecases;

import com.mock.mockresponse.domain.cities.CityDetails;
import com.mock.mockresponse.domain.cities.CityResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CityUseCase<V> {
    private final CityDetails<List<CityResponse>, V> cityDetails;

    public Mono<List<CityResponse>> getListOfCities(V request){
        return cityDetails.getListOfCities(request);
    }
}
