package com.kiwiplan.utils;

import com.kiwiplan.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtils {

    public void displayManagementTree(List<Employee> employees){
        Employee rootEmployee = employees.stream().filter( id -> id.ManagerId == 0).findFirst().get(); //get the rootEmployee of the tree
        buildHierarchyTree(rootEmployee, employees);
        printHierarchyTree(rootEmployee, 0);
    }


    //get a list of subordinates for an employee

    private List<Employee> getSubordinatesById(int employeeId, List<Employee> employees) {
        List<Employee> subordinates = new ArrayList<>();
        employees.forEach(employee -> {
            if (employee.getManagerId() == employeeId) {
                subordinates.add(employee);
            }
        });
        return subordinates;
    }

    //build tree recursively
    private void buildHierarchyTree(Employee rootEmployee, List<Employee> employees) {
        Employee employee = rootEmployee;
        List<Employee> subordinates = getSubordinatesById(rootEmployee.getId(), employees);
        employee.setSubordinates(subordinates);
        if (subordinates.size() == 0) {
            return;
        }

        subordinates.forEach( subordinate -> buildHierarchyTree(subordinate, employees));
    }

    //print tree recursively
    private void printHierarchyTree(Employee employeeRoot, int level) {
        if(level == 0) {
            System.out.print("->");
        }

        for (int i = 0; i < level; i++) {
            System.out.print("->");
        }
        System.out.println(employeeRoot.getName());

        List<Employee> subordinates = employeeRoot.getSubordinates();
        subordinates.forEach( subs -> {
                    System.out.print("->");
                    printHierarchyTree(subs, level + 1);
                }
        );
    }
}
