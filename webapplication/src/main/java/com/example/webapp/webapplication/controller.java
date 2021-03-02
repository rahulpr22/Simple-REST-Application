package com.example.webapp.webapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@RequestMapping(path = "/students")
public class controller {
    @Autowired
    private DAO studentsDao;

    @GetMapping(path = "/",produces = "application/json")
    public String getStudents(){
        return studentsDao.getStudentsList();
    }

    @RequestMapping(value="/addstudent/{rollid}/{name}/{dept}", method=RequestMethod.GET, produces = "application/json")
    public String addStudentToList(@PathVariable String rollid , @PathVariable String name,@PathVariable String dept) {
        Integer id = studentsDao.getAllStudents().getStudentList().size() +1;
        Student student = new Student(id, rollid, name, dept);
        studentsDao.addStudent(student);
        return studentsDao.getStudentsList();
    }
    
}
