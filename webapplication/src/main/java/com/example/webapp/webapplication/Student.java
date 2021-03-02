package com.example.webapp.webapplication;

public class Student {
    private Integer ID;
    private String rollId, Name, Department;
    

    public Integer getID() {
        return ID;
    }

    public void setID(Integer iD) {
        ID = iD;
    }

    public String getRollId() {
        return rollId;
    }

    public void setRollId(String rollId) {
        this.rollId = rollId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public Student(Integer iD, String rollId, String name, String department) {
        ID = iD;
        this.rollId = rollId;
        Name = name;
        Department = department;
    }
    

    
}
