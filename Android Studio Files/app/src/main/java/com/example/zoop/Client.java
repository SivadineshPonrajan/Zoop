package com.example.zoop;

import android.os.AsyncTask;
import static java.nio.charset.StandardCharsets.*;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client extends AsyncTask<Void, Void, Void> {

    String type = "";
    String ip = "192.168.43.77";
    Client(String t){
        type = t;
    }

    @Override
    protected Void doInBackground(Void... arg0) {
        if (type == "escape")
        {
            try {
                Socket con = new Socket(ip, 9999);
                OutputStream toServer = con.getOutputStream();
                DataOutputStream out = new DataOutputStream(toServer);
                byte arr[] = "escape".getBytes(ISO_8859_1);
                out.write(arr);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        else if (type == "ok")
        {
            try {
                Socket con = new Socket(ip, 9999);
                OutputStream toServer = con.getOutputStream();
                DataOutputStream out = new DataOutputStream(toServer);
                byte arr[] = "ok".getBytes(ISO_8859_1);
                out.write(arr);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        else if (type == "right")
        {
            try {
                Socket con = new Socket(ip, 9999);
                OutputStream toServer = con.getOutputStream();
                DataOutputStream out = new DataOutputStream(toServer);
                byte arr[] = "right".getBytes(ISO_8859_1);
                out.write(arr);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        else if (type == "left")
        {
            try {
                Socket con = new Socket(ip, 9999);
                OutputStream toServer = con.getOutputStream();
                DataOutputStream out = new DataOutputStream(toServer);
                byte arr[] = "left".getBytes(ISO_8859_1);
                out.write(arr);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        else if (type == "power")
        {
            try {
                Socket con = new Socket(ip, 9999);
                OutputStream toServer = con.getOutputStream();
                DataOutputStream out = new DataOutputStream(toServer);
                byte arr[] = "power".getBytes(ISO_8859_1);
                out.write(arr);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return null;
    }
}
