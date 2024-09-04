package com.mock.mockresponse.controller;

import com.mock.mockresponse.application.usecases.CityUseCase;
import com.mock.mockresponse.domain.cities.CityResponse;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CityController<V> {
    private final CityUseCase<V> cityUseCase;

    @GetMapping("/cities")
    public ResponseEntity<Mono<List<CityResponse>>> getCities(V request) {
        val response = cityUseCase.getListOfCities(request);
        return ResponseEntity.ok(response);
    }
}
