package io.shahan.salarycalculator;

public class SalaryCalculator {
    double basicAmount;
    double medical;
    double houseRent;

        public  double calculateSalary(){

        return (basicAmount + (basicAmount*(medical/100)) + (basicAmount*(houseRent/100)));

    }
}