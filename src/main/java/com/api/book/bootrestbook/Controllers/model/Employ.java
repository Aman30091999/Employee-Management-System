package com.api.book.bootrestbook.Controllers.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employs")
public class Employ {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Employ_Id")
    private int employ_id;
    @Column(name = "Employ_name")
    private String employ_name;
    @Column(name = "Employ_department")
    private String employ_department;
    @Column(name = "Employ_experience")
    private String experience;
    @Column(name = "Department")
    private String department;
    @Column(name = "Salary")
    private int salary;
    @Column(name = "Working_day")
    private int working_day;
    @Column(name = "Employ_holiday")
    private int holiday;
    @Column(name = "Employ_Leave")
    private int leave;
    @Column(name = "Employ_complete_task")
    private int task_total;
    @Column(name = "Employ_Project_role")
    private String project_role;
    @Column(name = "Employ_Qualification")
    private String qualification;
    @Column(name = "Employ_Address")
    private String address;
    @Column(name = "Employ_Shift")
    private String shift;
   
    public Employ() {
    }
    public Employ(int employ_id, String employ_name, String employ_department, String experience, String department,
            int salary, int working_day, int holiday, int leave, int task_total, String project_role,
            String qualification, String address, String shift) {
        this.employ_id = employ_id;
        this.employ_name = employ_name;
        this.employ_department = employ_department;
        this.experience = experience;
        this.department = department;
        this.salary = salary;
        this.working_day = working_day;
        this.holiday = holiday;
        this.leave = leave;
        this.task_total = task_total;
        this.project_role = project_role;
        this.qualification = qualification;
        this.address = address;
        this.shift = shift;
    }
    public int getEmploy_id() {
        return employ_id;
    }
    public void setEmploy_id(int employ_id) {
        this.employ_id = employ_id;
    }
    public String getEmploy_name() {
        return employ_name;
    }
    public void setEmploy_name(String employ_name) {
        this.employ_name = employ_name;
    }
    public String getEmploy_department() {
        return employ_department;
    }
    public void setEmploy_department(String employ_department) {
        this.employ_department = employ_department;
    }
    public String getExperience() {
        return experience;
    }
    public void setExperience(String experience) {
        this.experience = experience;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getWorking_day() {
        return working_day;
    }
    public void setWorking_day(int working_day) {
        this.working_day = working_day;
    }
    public int getHoliday() {
        return holiday;
    }
    public void setHoliday(int holiday) {
        this.holiday = holiday;
    }
    public int getLeave() {
        return leave;
    }
    public void setLeave(int leave) {
        this.leave = leave;
    }
    public int getTask_total() {
        return task_total;
    }
    public void setTask_total(int task_total) {
        this.task_total = task_total;
    }
    public String getProject_role() {
        return project_role;
    }
    public void setProject_role(String project_role) {
        this.project_role = project_role;
    }
    public String getQualification() {
        return qualification;
    }
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getShift() {
        return shift;
    }
    public void setShift(String shift) {
        this.shift = shift;
    }
    @Override
    public String toString() {
        return "Employ [address=" + address + ", department=" + department + ", employ_department=" + employ_department
                + ", employ_id=" + employ_id + ", employ_name=" + employ_name + ", experience=" + experience
                + ", holiday=" + holiday + ", leave=" + leave + ", project_role=" + project_role + ", qualification="
                + qualification + ", salary=" + salary + ", shift=" + shift + ", task_total=" + task_total
                + ", working_day=" + working_day + "]";
    }
    
   
}
