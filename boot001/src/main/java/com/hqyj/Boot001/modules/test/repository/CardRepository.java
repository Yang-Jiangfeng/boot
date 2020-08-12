package com.hqyj.Boot001.modules.test.repository;

import com.hqyj.Boot001.modules.test.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card,Integer> {
}
