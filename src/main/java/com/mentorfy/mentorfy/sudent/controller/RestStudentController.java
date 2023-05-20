package com.mentorfy.mentorfy.sudent.controller;

import com.mentorfy.mentorfy.sudent.entity.Student;
import com.mentorfy.mentorfy.sudent.service.StudentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class RestStudentController {


    private final StudentService studentService;
    private final RestTemplate restTemplate;
    @Autowired
    public RestStudentController(StudentService studentService, RestTemplate restTemplate) {
        this.studentService = studentService;
        this.restTemplate = restTemplate;
    }

    @ApiOperation(value="Получение списка студентов", notes = "Получение списка всех студентов", response = Student.class)
    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents(){
        return  ResponseEntity.ok().body(studentService.getAll());
    }
    @ApiOperation(value = "Добавление нового студента", notes = "Добавление нового стундента", response = Student.class)
    @PostMapping("/students")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.create(student));
    }
    @ApiOperation(value = "Редактирование студента", notes = "Редактирование стундента", response = Student.class)
    @PutMapping("/students")
    public ResponseEntity<Student> editStudent(@RequestBody Student student){
        return ResponseEntity.status(HttpStatus.OK).body(studentService.update(student));
    }
    @ApiOperation(value = "Удаление студента", notes = "Удаление студента")
    @DeleteMapping("/students")
    public ResponseEntity<Student> deleteStudent(@RequestBody Student student){
        return ResponseEntity.noContent().build();
    }

}
