package com.example.benhendricks.stormy.ui;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.benhendricks.stormy.R;
import com.example.benhendricks.stormy.adapters.DayApapter;
import com.example.benhendricks.stormy.weather.Day;

import java.util.Arrays;

public class Daily_forecast_activity extends ListActivity {

    private Day[] mDays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast_activity);

        Intent intent = getIntent();
        Parcelable[] parcelables = intent.getParcelableArrayExtra(MainActivity.DAILY_FORECAST);
        mDays = Arrays.copyOf(parcelables, parcelables.length, Day[].class);

        DayApapter adapter = new DayApapter(this, mDays);
        setListAdapter(adapter);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        String message;
        String dayOfWeek = mDays[position].getDayOfTheWeek();
        String condition = mDays[position].getSummary();
        String highTemp = mDays[position].getTemperatureMax()+"";

        message = String.format("The high on %s will be %s and it will be %s",
                dayOfWeek,
                highTemp,
                condition);

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
