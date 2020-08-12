package com.hqyj.Boot001.modules.test.service;

import com.hqyj.Boot001.modules.common.vo.Result;
import com.hqyj.Boot001.modules.test.entity.Card;

public interface CaedService {
    Result<Card> insertCard(Card card);
}
