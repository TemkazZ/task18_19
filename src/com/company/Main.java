package com.company;
import java.net.*;
import java.io.*;
//Программа 1
//public class Main {
//    public static void main(String[] args){
//        InetAddress myIP = null;
//        try {
//            myIP = InetAddress.getLocalHost();}
//        catch (UnknownHostException e) {}
//        System.out.println(myIP);
//    }
//}


//Программа 2
//public class Main {
//    public static void main(String[] args){
//        InetAddress bsu = null;
//        try {
//            bsu = InetAddress.getByName("www.sutkt.ru"); }
//        catch (UnknownHostException e){ }
//        System.out.println(bsu);
//    }
//}


//Программа 3
//public class Main {
//    public static void main(String[] args) throws Exception {
//        URL aURL = new URL("http://java.sun.com:80/docs/books/tutorial"
//                + "/index.html?name=networking#DOWNLOADING");
//        System.out.println("protocol = " + aURL.getProtocol());
//        System.out.println("authority = " + aURL.getAuthority());
//        System.out.println("host = " + aURL.getHost());
//        System.out.println("port = " + aURL.getPort());
//        System.out.println("path = " + aURL.getPath());
//        System.out.println("query = " + aURL.getQuery());
//        System.out.println("filename = " + aURL.getFile());
//        System.out.println("ref = " + aURL.getRef());
//    }
//}


//Программа 4
//public class Main {
//    public static void main(String args[]) {
//        Socket s = null;
//        try {//посылка строки клиенту
//            ServerSocket server = new ServerSocket(3456);
//            s = server.accept();
//            PrintStream ps = new PrintStream(s.getOutputStream());
//            ps.println("привет!");
//            ps.flush();
//            s.close(); // разрыв соединения
//        }catch (IOException e){System.out.println("ошибка: " + e); }
//    }
//}

//Программа 5
//public class Main {
//    public static void main(String[] args) {
//        Socket socket = null;
//        try {//получение строки клиентом
//            socket = new Socket("localhost", 3456);
//            BufferedReader dis = new BufferedReader(new
//                    InputStreamReader(socket.getInputStream()));
//            String msg = dis.readLine();
//            System.out.println(msg);
//        } catch (IOException e) {System.out.println("ошибка: " + e); }
//    }
//}

public class Main {
    public static void main(String args[]) {
        Socket s = null;
        try {//посылка строки клиенту
            ServerSocket server = new ServerSocket(3456);
            s = server.accept();
            PrintStream ps = new PrintStream(s.getOutputStream());
            ps.println("привет!");
            ps.flush();
            s.close(); // разрыв соединения
        }catch (IOException e){System.out.println("ошибка: " + e); }
    }
}

