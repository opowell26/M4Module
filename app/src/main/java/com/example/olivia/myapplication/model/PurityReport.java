package com.example.olivia.myapplication.model;

import android.icu.util.Calendar;

import static android.R.attr.name;

/**
 * Created by Julian on 2/26/2017.
 */

public class PurityReport {
    private String date;
    private String time;
    private int reportNumber;
    private String workerName;
    private String location;
    private String condition;
    private int virusPPM;
    //private String contamination;


    public PurityReport(String _date, String _time, int _reportNumber,
                        String _workerName, String _location,
                        String _condition, int _virusPPM) {

        date = _date;
        time = _time;
        reportNumber = _reportNumber;
        workerName = _workerName;
        location = _location;
        condition = _condition;
        virusPPM = _virusPPM;
    }

    public String getWorkerName() {
        return workerName;
    }
    public int getVirusPPM() {
        return virusPPM;
    }
    public int getReportNumber() {
        return reportNumber;
    }
    public String getTime() {
        return time;
    }
    public String getDate() {
        return date;
    }
    public String getLocation() {
        return location;
    }
    public String getCondition() {
        return condition;
    }
    public String toString() {
        return date + " " + time;
    }

}
