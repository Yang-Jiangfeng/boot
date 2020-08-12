package com.hqyj.Boot001.modules.test.service;

import com.github.pagehelper.PageInfo;
import com.hqyj.Boot001.modules.common.vo.Result;
import com.hqyj.Boot001.modules.common.vo.SearchVo;
import com.hqyj.Boot001.modules.test.entity.City;

import java.util.List;

public interface CityService {
    List<City> getCitiesByCountryId(int countryId);

    PageInfo<City> getCitiesBySearchVo(int countryId, SearchVo searchVo);

    PageInfo<City> getCitierBySearchVo(SearchVo searchVo);

    Result<City> insertCity(City city);

    Result<City> updateCity(City city);

    Result<Object> deleteCity(int cityId);
}
