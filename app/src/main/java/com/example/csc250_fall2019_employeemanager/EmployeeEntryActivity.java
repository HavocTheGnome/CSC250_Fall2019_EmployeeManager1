package com.example.csc250_fall2019_employeemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EmployeeEntryActivity extends AppCompatActivity
{
    private EditText fnameET, lnameET, height_feetET, height_inchesET, weightET, ageET;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_entry);

        this.fnameET = this.findViewById(R.id.fnameET);
        this.lnameET = this.findViewById(R.id.lnameET);
        this.weightET = this.findViewById(R.id.weightET);
        this.ageET = this.findViewById(R.id.ageET);
        this.height_feetET = this.findViewById(R.id.height_feetET);
        this.height_inchesET = this.findViewById(R.id.height_inchesET);
    }

    public void onCreateEmployeeButtonClicked(View v)
    {
        if(Core.theEmployee == null) //this is a new employee
        {
            String fname = this.fnameET.getText().toString();
            String lname = this.lnameET.getText().toString();
            double weight = Double.parseDouble(this.weightET.getText().toString());
            int age = Integer.parseInt(this.ageET.getText().toString());
            int height_feet = Integer.parseInt(this.height_feetET.getText().toString());
            int height_inches = Integer.parseInt(this.height_inchesET.getText().toString());
            Core.theEmployee = new Employee(fname, lname, height_feet, height_inches, age, weight);
        }
        else
        {
            String fname = this.fnameET.getText().toString();
            String lname = this.lnameET.getText().toString();
            double weight = Double.parseDouble(this.weightET.getText().toString());
            int age = Integer.parseInt(this.ageET.getText().toString());
            int height_feet = Integer.parseInt(this.height_feetET.getText().toString());
            int height_inches = Integer.parseInt(this.height_inchesET.getText().toString());
            Core.theEmployee.changeWeight(age);
            Core.theEmployee.changeHeight_feet(height_feet);
            Core.theEmployee.changeHeight_inches(height_inches);
            Core.theEmployee.changeLname(lname);
            Core.theEmployee.changeFname(lname);
        }

    }
    public void onNewButtonClicked(View v)
    {
        if(Core.theEmployee != null)
        {
            Core.theEmployees.add(Core.theEmployee);
            Core.lastEmployeeAdded = Core.theEmployee;
            Core.myValue = Core.myValue + 1;
            Core.theEmployee = null;
        }
    }
    public void onReturnButtonClicked(View v)
    {
        Intent i = new Intent(this, MainActivity.class);
        this.startActivity(i);
    }
}
