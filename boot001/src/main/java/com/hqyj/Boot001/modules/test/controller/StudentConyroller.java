package com.hqyj.Boot001.modules.test.controller;

import com.hqyj.Boot001.modules.common.vo.Result;
import com.hqyj.Boot001.modules.test.entity.Student;
import com.hqyj.Boot001.modules.test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentConyroller {

    @Autowired
    private StudentService studentService;

    /**
     * 127.0.0.1/api/student ---- post
     * {"studentName":"hujiang1","studentCard":{"cardId":"1"}}
     */
@PostMapping(value = "student",consumes = "application/json")
    public Result<Student> insertStudent(@RequestBody Student student){
return studentService.insertStudent(student);
    }
}
