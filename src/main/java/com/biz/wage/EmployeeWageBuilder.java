package com.biz.wage;

public class EmployeeWageBuilder {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static  int MAX_WORKING_DAYS=20;
    public static final int Max_WORKING_HRS = 100;

    public static void main( String[] args ) {
        // Variables
        int empHrs = 0;
        int empWage = 0;
        int totalWage = 0;
        int totalWorkingHrs = 0;
        int totalWorkingDays = 0;
        while (totalWorkingHrs <= Max_WORKING_HRS && totalWorkingHrs < MAX_WORKING_DAYS) {
            totalWorkingDays++;

            //computation
            double empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;

            }
            totalWorkingHrs += empHrs;

            empWage = empHrs * EMP_RATE_PER_HOUR;
            System.out.println("Employee Wage :" + empWage);
            totalWage += empWage;

            System.out.println("Total Working Hours: " + totalWorkingHrs);
            System.out.println("Total Employee Wage for 20 days:" + totalWage);
        }
    }
}

