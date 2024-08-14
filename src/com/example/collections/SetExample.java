package com.example.collections;

import java.util.*;

class Department implements Comparable<Department> {
    int department_Id;
    String department_Name;
    int department_Number;

    public Department(int department_Id, String department_Name, int department_Number) {
        this.department_Id = department_Id;
        this.department_Name = department_Name;
        this.department_Number = department_Number;
    }
    public int getDepartment_Id() {
        return department_Id;
    }
    public void setDepartment_Id(int department_Id) {
        this.department_Id = department_Id;
    }
    public String getDepartment_Name() {
        return department_Name;
    }
    public void setDepartment_Name(String department_Name) {
        this.department_Name = department_Name;
    }
    public int getDepartment_Number() {
        return department_Number;
    }
    public void setDepartment_Number(int department_Number) {
        this.department_Number = department_Number;
    }

    @Override
    public int compareTo(Department o) {
        return department_Number - o.getDepartment_Number();
    }
    @Override
    public String toString() {
        return "Department [department_Id=" + department_Id +
                ", department_Name="+department_Name+", department_Number="+department_Number+"]";
    }
}
public class SetExample {
    public static void main(String[] args) {
        Set<Department> departmentSet = new TreeSet<>();
        departmentSet.add(new Department(1,"QA",205));
        departmentSet.add(new Department(2,"SE",305));

      List<Department> departmentList = Arrays.asList(
              new Department(2,"Lead",605),
              new Department(5,"Manager",305)
      );

        for (Department department : departmentSet) {
            System.out.println(department);
        }

        Comparator<Department> departmentComparator = Comparator.comparing(Department::getDepartment_Number);
        Collections.sort(departmentList, departmentComparator);
        System.out.println("Department List: ");
        for (Department department : departmentList) {
            System.out.println(department);
        }
    }
}
