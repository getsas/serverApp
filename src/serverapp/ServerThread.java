package serverapp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;

public class ServerThread extends Thread{

    ServerForm sf; //create variables of server form
    
    ObjectInputStream oin; //variables to read and write messages
    ObjectOutputStream out;
  
    ServerSocket serverSocket; //server socket object to create server
   
    Socket socket; //socket object to create socket connection
    
    //will pass parameter ServerForm object
    public ServerThread(ServerForm sf) {
        this.sf = sf;
        try {
            serverSocket = new ServerSocket(Settings.port);    //create server object with specific port number   
            JOptionPane.showMessageDialog(sf, "Server OK");
            start();          
        } catch(Exception e) {
           //e.printStackTrace(); //by getsa
        }
    }
    
    //create a method to send message
    public void sendMessage(String message) {
        try {
            out.writeObject(message.toString());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void run(){
        while (true) {
            try {
                socket = serverSocket.accept();     //accepting incoming connections to the server using thread
                openReader();                       // calling method to create input output objects
            } catch (Exception e) { 
                e.printStackTrace();
            }
        }
    }
    
    private void openReader() {
        try {
            oin = new ObjectInputStream(socket.getInputStream());
            out = new ObjectOutputStream(socket.getOutputStream());
            MsgRecThread mrt = new MsgRecThread(sf, oin, out);           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //===================================================================================================================================
    public class MsgRecThread extends Thread {
        ServerForm sf;
        ObjectInputStream oin;
        ObjectOutputStream out;
        
        public MsgRecThread(ServerForm sf, ObjectInputStream oin, ObjectOutputStream out) {
            this.sf  = sf;
            this.oin = oin;
            this.out = out;
            start();
        }
        
        public void run() {
            //to recieve message continuously
            while (true) {
                try {
                    //here in serverthread also it shoud be append
                    sf.jtaRec.append(oin.readObject().toString() + "\n");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //===================================================================================================================================
}
