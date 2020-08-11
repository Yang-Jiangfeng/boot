package com.hqyj.Boot001.modules.test.service;

import com.hqyj.Boot001.modules.test.entity.Country;

public interface CountryService {
    Country getCountryByCountryId(int countryId);

    Country getCountryByCountryName(String countryName);
}
