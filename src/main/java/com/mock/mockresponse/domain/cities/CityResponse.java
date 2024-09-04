package com.mock.mockresponse.domain.cities;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CityResponse {
    private int id;
    private String cityName;
}
