package com.acme.a3csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DetailViewActivity extends Activity {

    private EditText bNumField, nameField, addrField, pBusnField, locField;
    Contact receivedPersonInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_view);
        receivedPersonInfo = (Contact)getIntent().getSerializableExtra("Contact");

        bNumField = (EditText) findViewById(R.id.bNum);
        nameField = (EditText) findViewById(R.id.name);
        addrField = (EditText) findViewById(R.id.addr);
        pBusnField = (EditText) findViewById(R.id.pBusn);
        locField = (EditText) findViewById(R.id.loc);

        if(receivedPersonInfo != null){
            bNumField.setText(receivedPersonInfo.businessNumber);
            nameField.setText(receivedPersonInfo.name);
            addrField.setText(receivedPersonInfo.address);
            pBusnField.setText(receivedPersonInfo.primaryBusiness);
            locField.setText(receivedPersonInfo.location);
        }
    }

    public void updateContact(View v){
        //TODO: Update contact funcionality
    }

    public void eraseContact(View v)
    {
        //TODO: Erase contact functionality
    }
}
