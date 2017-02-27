package com.example.olivia.myapplication.controller;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//import com.example.olivia.myapplication.R;
import com.example.olivia.myapplication.model.PurityReport;

public class ShowReportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_report);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //PurityReport report2 = (PurityReport) getIntent().getExtras().getParcelable("selectedReport");
        PurityReport report2 = new PurityReport("Feb 14", "8:00", 39393, "Joe", "GA", "Aight", 400);

        TextView time = (TextView) findViewById(R.id.time);
        TextView reportNumber = (TextView) findViewById(R.id.report_number);
        TextView worker = (TextView) findViewById(R.id.worker);
        TextView location = (TextView) findViewById(R.id.location);
        TextView condition = (TextView) findViewById(R.id.condition);
        TextView ppm = (TextView) findViewById(R.id.PPM);

//        time.setText(report2.getTime());
//        reportNumber.setText(report2.getReportNumber());
//        worker.setText(report2.getWorkerName());
//        location.setText(report2.getLocation());
//        condition.setText(report2.getCondition());
//        ppm.setText(report2.getVirusPPM());
    }



}
