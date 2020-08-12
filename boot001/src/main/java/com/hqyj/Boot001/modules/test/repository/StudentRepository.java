package com.hqyj.Boot001.modules.test.repository;

import com.hqyj.Boot001.modules.test.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
