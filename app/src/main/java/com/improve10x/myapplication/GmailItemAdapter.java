package com.improve10x.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class GmailItemAdapter extends BaseAdapter {
    public GmailItems[] items;

    public GmailItemAdapter(GmailItems[] gmailItems) {
        items = gmailItems;
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
        GmailItemViewHolder viewHolder;
        if(convertView == null){

            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            convertView = inflater.inflate(R.layout.activity_gmail_items, parent, false);
            viewHolder = new GmailItemViewHolder(convertView);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (GmailItemViewHolder) convertView.getTag();
        }
        GmailItems item = (GmailItems) getItem(position);
       viewHolder. nameTxt.setText(item.name);
       viewHolder. descriptionTxt.setText(item.description);
       viewHolder. time.setText(item.time);
        Picasso.get().load(item.imageUrl).into(viewHolder.imageIv);
        return convertView;
    }
}


