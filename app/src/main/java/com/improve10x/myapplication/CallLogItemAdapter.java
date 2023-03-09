package com.improve10x.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class CallLogItemAdapter extends BaseAdapter {
    public CallLogItems[] items;
   public CallLogItemAdapter(CallLogItems[] callLogItems){
       items = callLogItems;
   }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       CallLogItemViewHolder viewHolder;
       if (convertView == null){
           LayoutInflater inflater = LayoutInflater.from(parent.getContext());
           convertView = inflater.inflate(R.layout.calllog_items,parent,false);
           viewHolder = new CallLogItemViewHolder(convertView);
           convertView.setTag(viewHolder);
       }else {
           viewHolder = (CallLogItemViewHolder) convertView.getTag();
       }
        CallLogItems item = (CallLogItems) getItem(position);
       viewHolder. contact.setText(item.number);
       viewHolder. country.setText(item.timeAndCountry);
        Picasso.get().load(item.imageUrl).into(viewHolder.image);
        return convertView;
    }
}
