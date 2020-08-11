package com.hqyj.Boot001.modules.test.controller;

import com.hqyj.Boot001.modules.test.entity.Country;
import com.hqyj.Boot001.modules.test.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CountryController {
    @Autowired
    private CountryService countryService;

    /**
     * 127.0.0.1/api/country/522 ---- get
     *
     * @param countryId
     * @return
     */
    @GetMapping("/country/{countryId}")
    public Country getCountryByCountryId(@PathVariable int countryId) {
        return countryService.getCountryByCountryId(countryId);
    }

    /**
     *  127.0.0.1/api/country?countryName=China ---- get
     * @param countryName
     * @return
     */
    @GetMapping("/country")
    public Country getCountryByCountryName(@RequestParam String countryName) {
        System.err.println(countryName);
        return countryService.getCountryByCountryName(countryName);
    }
}
