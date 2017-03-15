package com.example.login_registernew;

/**
 * Created by Alvin on 14/03/2017.
 */

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;


public class EventAdapter extends BaseAdapter {

    private Context mcontext;
    private List<Event> mlist;

    public EventAdapter(List<Event> mlist, Context mcontext) {
        this.mcontext = mcontext;
        this.mlist = mlist;
    }

    @Override
    public int getCount() {
        return mlist.size();
    }

    @Override
    public Object getItem(int position) {
        return mlist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mcontext,R.layout.event_list,null);
        TextView tvTitle = (TextView)v.findViewById(R.id.tvEventTitle);
        TextView tvDate = (TextView)v.findViewById(R.id.tvEventDate);
        TextView tvTime = (TextView)v.findViewById(R.id.tvEventTime);

        tvTitle.setText(mlist.get(position).getTitle());
        tvDate.setText(mlist.get(position).getDate());
        tvTime.setText(mlist.get(position).getTime());


        return v;
    }
}
