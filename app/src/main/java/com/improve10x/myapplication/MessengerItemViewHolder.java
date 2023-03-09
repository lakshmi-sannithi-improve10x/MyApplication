package com.improve10x.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MessengerItemViewHolder {
    public TextView nameTxt;
    public ImageView imageIv;
    public TextView descriptionTxt;

    public MessengerItemViewHolder(View convertView){
        nameTxt = convertView.findViewById(R.id.name_txt);
        imageIv = convertView.findViewById(R.id.image_iv);
        descriptionTxt = convertView.findViewById(R.id.description_txt);
    }
}
