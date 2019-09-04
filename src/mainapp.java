import com.kiwiplan.model.Employee;
import com.kiwiplan.utils.EmployeeUtils;

import java.util.ArrayList;
import java.util.List;

public class mainapp {

    public static void main(String[] args) {

        runCase1();
        runCase2();

    }

    private static void runCase1(){
        EmployeeUtils utils = new EmployeeUtils();
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(10, "Tom", 0));
        employees.add(new Employee(3, "Jerry", 10));
        employees.add(new Employee(2, "Mickey", 10));
        employees.add(new Employee(7, "John", 2));
        employees.add(new Employee(5, "Sarah", 10));

        System.out.println("**** Management Tree For Case1 *****");
        utils.displayManagementTree(employees);
        System.out.println("");
    }


    private static void runCase2(){
        EmployeeUtils utils = new EmployeeUtils();
        List<Employee> employees2 = new ArrayList<>();
        employees2.add(new Employee(1, "Jerry", 0));
        employees2.add(new Employee(2, "Philip", 1));
        employees2.add(new Employee(3, "David", 2));
        employees2.add(new Employee(4, "Alice", 3));
        employees2.add(new Employee(5, "John", 4));
        employees2.add(new Employee(6, "Mike", 3));
        employees2.add(new Employee(7, "Ken", 2));
        employees2.add(new Employee(8, "Peter", 7));
        employees2.add(new Employee(9, "Tom", 2));
        employees2.add(new Employee(10, "Stacie", 1));

        System.out.println("**** Management Tree For Case2 *****");
        utils.displayManagementTree(employees2);

    }


}
