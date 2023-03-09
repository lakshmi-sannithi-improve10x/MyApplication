package com.improve10x.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FacebookItemViewHolder {
    public TextView contact;
    public TextView time;
    public ImageView image;

    public FacebookItemViewHolder(View convertView){
        contact = convertView.findViewById(R.id.contactname_txt);
        time = convertView.findViewById(R.id.time_txt);
        image = convertView.findViewById(R.id.image_iv);
    }
}
