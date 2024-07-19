package org.servlet.core;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSide {
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream out = null;

    public ClientSide(String address, int port){
        try{
            socket = new Socket(address,port);
            System.out.println("connected");
            input = new DataInputStream(System.in);
            out = new DataOutputStream(socket.getOutputStream());
        } catch ( IOException io){
            System.out.println(io.getLocalizedMessage());
        }
        String line="";
        while(!line.equals("Over")){
            try{
                line=input.readLine();
                out.writeUTF(line);
            }catch (IOException io){
                System.out.println(io.getLocalizedMessage());
            }
        }
        try{
            input.close();
            out.close();
            socket.close();
        } catch (IOException io){
            System.out.println(io.getLocalizedMessage());
        }
    }

    public static void main(String[] args) {
        ClientSide clientSide = new ClientSide("127.0.0.1",5000);
    }
}
