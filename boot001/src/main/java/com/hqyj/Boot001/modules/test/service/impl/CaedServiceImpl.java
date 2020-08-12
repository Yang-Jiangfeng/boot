package com.hqyj.Boot001.modules.test.service.impl;

import com.hqyj.Boot001.modules.common.vo.Result;
import com.hqyj.Boot001.modules.test.entity.Card;
import com.hqyj.Boot001.modules.test.repository.CardRepository;
import com.hqyj.Boot001.modules.test.service.CaedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CaedServiceImpl implements CaedService {
    @Autowired
    private CardRepository cardRepository;
    @Override
    @Transactional
    public Result<Card> insertCard(Card card) {
        cardRepository.saveAndFlush(card);
        return new Result<Card>(
                Result.ResultStatus.SUCCESS.status,
                "Insert success",card
        );
    }
}
