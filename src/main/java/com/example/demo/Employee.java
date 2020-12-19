package com.example.demo;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table
//@Getter
//@Setter
@Data
public class Employee {

    //employee table entities
    @Id
//    @GeneratedValue
//    @NotNull
    @NotNull
//    @Column(name="employeeId")
    private int empId;
    @NotBlank(message = "Employee Name is Mandatory")
//    @Column(name="EmployeeName")
    private String empName;
    @NotNull
//    @Column(name="DepartmentId")
    private int deptId;
    @NotBlank(message = "Department Name is Mandatory")
//    @Column(name="DepartmentName")
    private String deptName;
    @Email(message = "Email is mandatory")
//    @Column(name="EmployeeEmail")
    private String empEmail;

    public Employee() {
    } //No-arg Constructor

    public Employee(@NotNull int empId, @NotBlank(message = "Employee Name is Mandatory") String empName, @NotNull int deptId, @NotBlank(message = "Department Name is Mandatory") String deptName, @Email(message = "Email is mandatory") String empEmail) {
        this.empId = empId;
        this.empName = empName;
        this.deptId = deptId;
        this.deptName = deptName;
        this.empEmail = empEmail;
    }
    //    public Employee(int i, String alen, int i1, String it, String s) {
//    }

//    public Employee(int i, String beth, int i1, String marketing, String s) {
//    }


//    public void setEmpId(int empId) {
//        this.empId = empId;
//    }
//    public int getEmpId() {
//        return empId;
//    }
//
//    public void setEmpName(String empName) {
//        this.empName = empName;
//    }
//
//    public String getEmpName() {
//        return empName;
//    }
//
//
//    public void setDeptId(int deptId) {
//        this.deptId = deptId;
//    }
//
//    public int getDeptId(){
//        return deptId;
//    }
//
//    public void setDeptName(String deptName) {
//        this.deptName = deptName;
//    }
//
//    public String getDeptName() {
//        return deptName;
//    }
//
//    public void setEmpEmail(String empEmail) {
//        this.empEmail = empEmail;
//    }
//
//    public String getEmpEmail() {
//        return empEmail;
//    }
//
//
//
//    public Employee(int empId, String empName, int deptId, String deptName, String empEmail) {
//        this.empId = empId;
//        this.empName = empName;
//        this.deptId=deptId;
//        this.deptName = deptName;
//        this.empEmail = empEmail;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "empId=" + empId +
//                ", empName='" + empName + '\'' +
//                ", deptId=" + deptId +
//                ", deptName='" + deptName + '\'' +
//                ", empEmail='" + empEmail + '\'' +
//                '}';
//    }
//

}
