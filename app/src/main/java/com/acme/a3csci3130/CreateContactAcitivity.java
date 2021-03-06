package com.acme.a3csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateContactAcitivity extends Activity {

    private Button submitButton;
    private EditText businessNumber, name, address, primaryBusiness, location;
    private MyApplicationData appState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_contact_acitivity);
        //Get the app wide shared variables
        appState = ((MyApplicationData) getApplicationContext());

        submitButton = (Button) findViewById(R.id.submitButton);
        businessNumber = (EditText) findViewById(R.id.bNum);
        name = (EditText) findViewById(R.id.name);
        address = (EditText) findViewById(R.id.addr);
        primaryBusiness = (EditText) findViewById(R.id.pBusn);
        location = (EditText) findViewById(R.id.loc);
    }

    public void submitInfoButton(View v) {
        //each entry needs a unique ID
        String personID = appState.firebaseReference.push().getKey();
        String bN = businessNumber.getText().toString(); //businessNumber
        String n = name.getText().toString(); //name
        String a = address.getText().toString(); //address
        String pB = primaryBusiness.getText().toString(); //primaryBusiness
        String l = location.getText().toString(); //location

        Contact person = new Contact(personID, bN, n, a, pB, l);

        appState.firebaseReference.child(personID).setValue(person);

        finish();

    }
}
