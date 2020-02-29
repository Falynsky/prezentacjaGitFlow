package fal.employee;

import fal.contract.Contract;

import java.util.List;
import java.util.Objects;

public class Employee {

    private String name;
    private String surename;
    private int age;
    private List<Contract> contracts;

    public Employee(String name, String surename, int age, List<Contract> contracts) {
        this.name = name;
        this.surename = surename;
        this.age = age;
        this.contracts = contracts;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                ", age=" + age +
                ", contracts=" + contracts +
                '}';
    }
}
