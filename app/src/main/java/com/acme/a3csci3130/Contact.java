package com.acme.a3csci3130;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Class that defines how the data will be stored in the
 * Firebase databse. This is converted to a JSON format
 */

public class Contact implements Serializable {

    public  String uid;
    public  String businessNumber;
    public  String name;
    public  String address;
    public  String primaryBusiness;
    public  String location;

    public Contact() {
        // Default constructor required for calls to DataSnapshot.getValue
    }

    public Contact(String uid, String businessNumber, String name, String address,
                   String primaryBusiness, String location){
        this.uid = uid;
        this.businessNumber = businessNumber;
        this.name = name;
        this.address = address;
        this.primaryBusiness = primaryBusiness;
        this.location = location;
    }


    @Exclude
    public Map<String, Object> toMap(){
        HashMap<String, Object> result = new HashMap<>();
        result.put("uid", uid);
        result.put("businessNumber", businessNumber);
        result.put("name", name);
        result.put("address", address);
        result.put("primaryBusiness", primaryBusiness);
        result.put("location", location);

        return result;
    }
}
