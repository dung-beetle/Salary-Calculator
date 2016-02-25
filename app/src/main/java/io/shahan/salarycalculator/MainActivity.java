package io.shahan.salarycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText basicAmountET;
    EditText medicalET;
    EditText houseRentET;

    TextView totalAmountTV;

    SalaryCalculator salaryCalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        basicAmountET =(EditText)findViewById(R.id.basicAmount);
        medicalET  =(EditText)findViewById(R.id.medical);
        houseRentET =(EditText)findViewById(R.id.houseRent);

        totalAmountTV=(TextView)findViewById(R.id.totalAmount);
        salaryCalculator=new SalaryCalculator();
    }

    public  void calculate(View view){


        salaryCalculator.basicAmount=Double.parseDouble(basicAmountET.getText().toString());
        salaryCalculator.medical=Double.parseDouble(medicalET.getText().toString());
        salaryCalculator.houseRent=Double.parseDouble(houseRentET.getText().toString());

        double totalAmount = salaryCalculator.calculateSalary();

        totalAmountTV.setText(String.valueOf(totalAmount));


    }
}
