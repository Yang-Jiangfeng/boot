package com.hqyj.Boot001.modules.test.controller;

import com.hqyj.Boot001.modules.common.vo.Result;
import com.hqyj.Boot001.modules.test.entity.Card;
import com.hqyj.Boot001.modules.test.service.CaedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CardController {

    @Autowired
    private CaedService caedService;

    /**
     * 127.0.0.1/api/card ---- post
     * {"cardNo":"cdascdas687dsa78"}
     */
    @PostMapping(value = "/card", consumes = "application/json")
    private Result<Card> insertCard(@RequestBody Card card) {
        return caedService.insertCard(card);
    }
}
