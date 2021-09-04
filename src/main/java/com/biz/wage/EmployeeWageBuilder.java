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
          double empCheck = Math.floor(Math.random() * 10) % 3;
          if (empCheck == IS_FULL_TIME) {
              System.out.println("Employee is Working FullTime");
              empHrs = 8;
          } else if (empCheck== IS_PART_TIME) {
              empHrs = 4;
              System.out.println("Employee is Working PartTime");
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