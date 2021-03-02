package com.example.webapp.webapplication;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Repository;

@Repository
public class DAO {
    private static Students list 
        = new Students(); 
  
    // This static block is executed  before executing the main block 
    static
    { 
  
        list.getStudentList().add(new Student(1, "17CS02001", "K.V Balaji","Computer Science"));
        list.getStudentList().add(new Student(2, "17CS02002", "Sai Prasath","Computer Science"));
        list.getStudentList().add(new Student(3, "17CS02003", "P Rahul Bharadwaj","Computer Science"));
        list.getStudentList().add(new Student(4, "17CS02005", "Gaurav Gupta","Computer Science"));
    }

    public Students getAllStudents() 
    {  
        return list; 
    } 
  
    public void addStudent(Student student) 
    { 
        list.getStudentList().add(student); 
            
    } 

    public String getStudentsList(){
        JSONArray array = new JSONArray();
        for(Student s : list.getStudentList()){
            JSONObject obj = new JSONObject();
            obj.put("Id",s.getID());
            obj.put("Roll Number",s.getRollId());
            obj.put("Name",s.getName());
            obj.put("Department", s.getDepartment());
            array.put(obj);
        }
        return array.toString();
    }

}