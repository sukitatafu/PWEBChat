package com.splash.billy.pwebchat;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Billy on 19/12/2017.
 */

public class Chat {
    private String pesan;
    private User sender;
    private long tanggal;


    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public long getTanggal() {
        return tanggal;
    }

    public void setTanggal(long tanggal) {
        this.tanggal = tanggal;
    }

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference chatRef = database.getReference("chats");

    public void send(){
        chatRef.push().setValue(this);
    }
}
