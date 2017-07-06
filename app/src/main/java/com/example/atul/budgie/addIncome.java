package com.example.atul.budgie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.NumberPicker;

public class addIncome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_income);
        NumberPicker date = (NumberPicker)findViewById(R.id.Date);
        NumberPicker month = (NumberPicker)findViewById(R.id.month);
        NumberPicker year = (NumberPicker)findViewById(R.id.year);
        final String[] values= {"January","February", "March", "April", "May" , "June" ,"July" , "August" , "September" , "October", "November" , "December" };
        date.setMinValue(1);
        date.setMaxValue(31);
        date.setWrapSelectorWheel(true);
        month.setMinValue(0);
        month.setMaxValue(values.length-1);
        month.setDisplayedValues(values);
        month.setWrapSelectorWheel(true);
        year.setMinValue(2000);
        year.setMaxValue(2200);
        year.setWrapSelectorWheel(true);
    }
}
