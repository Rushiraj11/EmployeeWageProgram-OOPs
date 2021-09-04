package com.biz.wage;

public class EmployeeWageBuilder {
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    static final int EMP_RATE_PER_HOUR = 20;
    static int empHrs = 0;
    static int empWage = 0;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation");
        empAttendence();
        empDailyWage();
    }

    public static void empAttendence() {
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck) {
            case IS_FULL_TIME:
                System.out.println("Employee working FullTime");
                empHrs = 8;
                break;
            case IS_PART_TIME:
                System.out.println("Employee working PartTime");
                empHrs = 4;
                break;
            default:
                System.out.println("Employee is Absent");
                empHrs = 0;

        }
    }

        public static void empDailyWage() {
            empWage = empHrs * EMP_RATE_PER_HOUR;
            System.out.println("Emp Wage: " + empWage);
        }


    }
