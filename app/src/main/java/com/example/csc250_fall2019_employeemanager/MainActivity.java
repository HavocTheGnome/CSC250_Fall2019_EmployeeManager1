package com.example.csc250_fall2019_employeemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Core Employees = new Core();
        setContentView(R.layout.activity_main);
    }

    public void onAddEmployeeClick(View v)
    {
        Intent i = new Intent(this, EmployeeEntryActivity.class);
        this.startActivity(i);
    }

    public void onEmployeeListClick(View v)
    {
        Intent i = new Intent(this, EmployeeListActivity.class);
        this.startActivity(i);
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        if(Core.lastEmployeeAdded != null)
        {
            Toast.makeText(this, "Received: " + Core.lastEmployeeAdded.getFname() + " " + Core.lastEmployeeAdded.getLname() + " which is at position: " + Core.myValue, Toast.LENGTH_LONG).show();
        }
    }
}
