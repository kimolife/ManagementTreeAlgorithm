package com.kiwiplan.model;

import java.util.List;

public class Employee {
    public Integer Id;
    public String Name;
    public Integer ManagerId;
    List<Employee> subordinates;

    public Employee(Integer id, String name, Integer managerId) {
        Id = id;
        Name = name;
        ManagerId = managerId;

    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getManagerId() {
        return ManagerId;
    }

    public void setManagerId(Integer managerId) {
        ManagerId = managerId;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<Employee> subordinates) {
        this.subordinates = subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", ManagerId=" + ManagerId +
                '}';
    }
}
