package com.improve10x.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MessengerItemAdapter extends BaseAdapter {
    public MessengerItems[] items;
    public MessengerItemAdapter(MessengerItems[] messengerItems){
        items = messengerItems;
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
        MessengerItemViewHolder viewHolder;
        if(convertView ==null){
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            convertView  = inflater.inflate(R.layout.messenger_items,parent,false);
             viewHolder = new MessengerItemViewHolder(convertView);
             convertView.setTag(viewHolder);
        }else {
            viewHolder = (MessengerItemViewHolder) convertView.getTag();
        }
        MessengerItems item = (MessengerItems) getItem(position);
        viewHolder. nameTxt.setText(item.messengerName);
        viewHolder.descriptionTxt.setText(item.description);
        Picasso.get().load(item.imageUrl).into(viewHolder.imageIv);
        return convertView;
    }
}
