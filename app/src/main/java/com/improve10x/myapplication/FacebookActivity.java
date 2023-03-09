package com.improve10x.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class FacebookActivity extends AppCompatActivity {
      public FacebookItems[] facebookItems;
      public FacebookItemAdapter adapter;
      ListView facebookItemLv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);
        initViews();
        createFacebookData();
        setupAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        facebookItemLv.setAdapter(adapter);
    }

    private void setupAdapter() {
        adapter = new FacebookItemAdapter(facebookItems);
    }

    private void initViews() {
        facebookItemLv = findViewById(R.id.facebookitem_lv);
    }

    private void createFacebookData() {
        facebookItems = new FacebookItems[7];
        facebookItems[0] = new FacebookItems();
        facebookItems[0].imageUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        facebookItems[0].contactName = "Angela Jaemi Favourito Huit reacted" +
                "to your story";
        facebookItems[0].time = "1 hour ago";

        facebookItems[1] = new FacebookItems();
        facebookItems[1].imageUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        facebookItems[1].contactName = "Kimwana Michael,Linh An and" +
                "Channell Boxley asked to join I Love" +
                "Still Life Painting!.";
        facebookItems[1].time = "1 hour ago";

        facebookItems[2] = new FacebookItems();
        facebookItems[2].imageUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        facebookItems[2].contactName = "Lloyd Cafe Cadena is live now:" +
                "LAPIT NA MAG END OF" +
                "SEASON!!!.";
        facebookItems[2].time = "5 minutes ago";

        facebookItems[3] = new FacebookItems();
        facebookItems[3].imageUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        facebookItems[3].contactName = "Sia Ellise Mejorada commented on" +
                "a post in Hachi's Buy and Sell" +
                "Group.";
        facebookItems[3].time = "1 hour ago";

        facebookItems[4] = new FacebookItems();
        facebookItems[4].imageUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        facebookItems[4].contactName = "Marveen Anne Romero and others" +
                "added to their stroies.";
        facebookItems[4].time = "2 hour ago";

        facebookItems[5] = new FacebookItems();
        facebookItems[5].imageUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        facebookItems[5].contactName = "Sosy Sophie,Rampage" +
                "TravelandTours and LetsircEcarg" +
                "Nodner Nillilllam listed in CAMSUR...";
        facebookItems[5].time = "2 hour ago";

        facebookItems[6] = new FacebookItems();
        facebookItems[6].imageUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        facebookItems[6].contactName = "Bobby Alvarz and others added to" +
                "their stories";
        facebookItems[6].time = "2 hour ago";


    }
}