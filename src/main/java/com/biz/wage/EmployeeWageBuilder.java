package com.biz.wage;

public class EmployeeWageBuilder {
    static final int IS_FULL_TIME = 1;
    static final int EMP_RATE_PER_HOUR = 20;
   static int empHrs = 0;
   static int empWage = 0;



    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation");
        empAttendence();
        empDailyWage();
    }

      public static void empAttendence() {
          double empCheck = Math.floor(Math.random() * 10) % 2;
          if (empCheck == IS_FULL_TIME) {
              System.out.println("Employee is present");
              empHrs = 8;
          } else {
              System.out.println("Employee is Absent");
              empHrs = 0;
          }
      }

          public static void empDailyWage() {
              empWage = empHrs * EMP_RATE_PER_HOUR;
              System.out.println("Emp Wage: " + empWage);
          }




}






