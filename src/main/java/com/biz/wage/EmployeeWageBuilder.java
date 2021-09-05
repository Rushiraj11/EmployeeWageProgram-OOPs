package com.biz.wage;

public class EmployeeWageBuilder {
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    static int empHrs = 0;
    static int empWage = 0;
    static int totalEmpWage = 0;

    public static void main(String[] args) {

        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        //computation
        for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 4;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;

            }

            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalEmpWage = totalEmpWage + empWage;
            System.out.println("Emp Wage: " + empWage);
        }
        System.out.println("Total Emp Wage for 20 days:" + totalEmpWage);
    }
}

