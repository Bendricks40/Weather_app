package com.example.benhendricks.stormy.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.benhendricks.stormy.weather.Day;

public class DayApapter extends BaseAdapter {

    private Context mContext;
    private Day[] mDays;

    public DayApapter(Context context, Day[] days) {
        mDays = days;
        mContext= context;

    }

    @Override
    public int getCount() {
        return mDays.length;
    }

    @Override
    public Object getItem(int position) {
        return mDays[position];
    }


    @Override   //we don't need this one.
    public long getItemId(int i) {
        return 0;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
