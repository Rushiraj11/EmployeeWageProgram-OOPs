package com.biz.wage;

public class EmployeeWageBuilder {
    static final int IS_FULL_TIME = 1;


    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation");
        empAttendence();
    }

      public static void empAttendence(){
        double empCheck = Math.floor(Math.random() * 10) % 2;
            if (empCheck == IS_FULL_TIME)
                System.out.println("Employee is present");
            else
                System.out.println("Employee is Absent");
        }
    }

