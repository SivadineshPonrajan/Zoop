package com.example.zoop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void escape(View v){
        Client clientEscape = new Client("escape");
        clientEscape.execute();
    }

    public void ok(View v){
        Client clientOk = new Client("ok");
        clientOk.execute();
    }

    public void right(View v){
        Client clientRight = new Client("right");
        clientRight.execute();
    }

    public void left(View v){
        Client clientLeft = new Client("left");
        clientLeft.execute();
    }
    public void power(View v){
        Client clientPower = new Client("power");
        clientPower.execute();
    }
}
