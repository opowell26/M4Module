package com.example.olivia.myapplication.controller;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.olivia.myapplication.model.PurityReport;

//import com.example.olivia.myapplication.R;

public class ReportActivity extends AppCompatActivity {
    private Button createButton;
    private PurityReport[] reports;
    private PurityReport report1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report_layout);

        //This is a sample report
        PurityReport report1 = new PurityReport("Feb17", "8:00", 1234, "John Smith", "GA", "BAD", 300);
        PurityReport[] reports = {report1};

        ListAdapter adapter = new ArrayAdapter<PurityReport>(this, android.R.layout.simple_list_item_1, reports);
        ListView reportList = (ListView) findViewById(R.id.report_list);
        createButton = (Button) findViewById(R.id.button);
        reportList.setAdapter(adapter);
        reportList.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String food = String.valueOf(parent.getItemAtPosition(position));

                    }
                }
        );

    }

}
