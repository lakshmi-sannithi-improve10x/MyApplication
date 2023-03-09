package com.improve10x.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class GmailItemViewHolder {
    public TextView nameTxt;
    public TextView descriptionTxt;
    public ImageView imageIv;
    public TextView time;

    public GmailItemViewHolder(View convertView){
        nameTxt = convertView.findViewById(R.id.name_txt);
        descriptionTxt = convertView.findViewById(R.id.description_txt);
        imageIv = convertView.findViewById(R.id.image_iv);
        time = convertView.findViewById(R.id.time_txt);

    }
}
