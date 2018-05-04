package com.example.benhendricks.stormy.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.benhendricks.stormy.R;
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
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder;

        if(view ==null) {
            //brand new
            view = LayoutInflater.from(mContext).inflate(R.layout.daily_list_item, null);
            holder = new ViewHolder();
            holder.iconImageView = view.findViewById(R.id.iconImageView);
            holder.temperatureLabel = view.findViewById(R.id.tempTextView);
            holder.dayLabel = view.findViewById(R.id.dayNameLabel);

            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        Day day = mDays[position];
        holder.iconImageView.setImageResource(day.getIconID());
        holder.temperatureLabel.setText(day.getTemperatureMax()+"");

        if (position ==0) {
         holder.dayLabel.setText("Today");
        } else {
            holder.dayLabel.setText(day.getDayOfTheWeek());
        }
        return view;
    }

    private static class ViewHolder {
        ImageView iconImageView; //public by default
        TextView temperatureLabel;
        TextView dayLabel;
    }


}
