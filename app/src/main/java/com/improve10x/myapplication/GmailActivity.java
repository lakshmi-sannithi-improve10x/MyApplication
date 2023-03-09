package com.improve10x.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class GmailActivity extends AppCompatActivity {
    public GmailItems[]  gmailItems;
    public GmailItemAdapter adapter;
    ListView gmailItemsLv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmail);
        initViews();
        createGmailData();
        setupAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        gmailItemsLv.setAdapter(adapter);
    }

    private void setupAdapter() {
        adapter = new GmailItemAdapter(gmailItems);
    }

    private void initViews() {
      gmailItemsLv = findViewById(R.id.gmailitems_lv);
    }

    private void createGmailData() {
        gmailItems = new GmailItems[6];

        gmailItems[0] = new GmailItems();
        gmailItems[0].imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";
        gmailItems[0].name = "Lisa Paik";
        gmailItems[0].description = "Volunteering at the Lakestone student art.." +
                "Hi Julia! Thank you for your interest in Volun...";
        gmailItems[0].time = "3.43 PM";

        gmailItems[1] = new GmailItems();
        gmailItems[1].imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";
        gmailItems[1].name = "Elena Casarosa";
        gmailItems[1].description = "Portrait special" +
                "wed like to announce a holiday portrait spe...";
        gmailItems[1].time = "11.24 AM";

        gmailItems[2] = new GmailItems();
        gmailItems[2].imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";
        gmailItems[2].name = "Medium Daily Digest";
        gmailItems[2].description = "7 Drawings to make you feel better.publi" +
                "Medium Daily Digest Get Medium for iOS or...";
        gmailItems[2].time = "6.30 AM";

        gmailItems[3] = new GmailItems();
        gmailItems[3].imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";
        gmailItems[3].name = "Grace Ellington";
        gmailItems[3].description = "Volunteer opportunity" +
                "I would like to inform you of a volunteer op...";
        gmailItems[3].time = "Nov 19";

        gmailItems[4] = new GmailItems();
        gmailItems[4].imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";
        gmailItems[4].name = "Henri Rousseau";
        gmailItems[4].description = "Niagra falls pictures" +
                "Julia,Here are the pictures of Niagra Fails y...";
        gmailItems[4].time = "Nov 19";

        gmailItems[5] = new GmailItems();
        gmailItems[5].imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";
        gmailItems[5].name = "Olenna Mason";
        gmailItems[5].description = "Lakestone student art exhibition " +
                "you're invited to Lakestone's annual studen...";
        gmailItems[5].time = "Nov 19";

    }
}