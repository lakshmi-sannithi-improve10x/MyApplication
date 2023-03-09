package com.improve10x.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CallLogItemViewHolder {
    public TextView contact;
    public TextView country;
    public ImageView image;

    public  CallLogItemViewHolder(View convertView){
        contact = convertView.findViewById(R.id.contact_txt);
        country = convertView.findViewById(R.id.country_txt);
        image = convertView.findViewById(R.id.image_iv);
    }
}
