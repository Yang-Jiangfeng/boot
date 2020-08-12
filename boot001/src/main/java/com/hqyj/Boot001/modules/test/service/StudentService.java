package com.hqyj.Boot001.modules.test.service;

import com.hqyj.Boot001.modules.common.vo.Result;
import com.hqyj.Boot001.modules.test.entity.Student;

public interface StudentService {
    Result<Student> insertStudent(Student student);
}
