import java.lang.*;
import java.io.*;
import java.util.*;

 class Table{
     void prTa(int n){
        for(int i=1;i<=5;i++){
            System.out.println(i*n);
        }
        try{
            Thread.sleep(1000);

        }
        catch(InterruptedException interruptedException){
            System.out.println("hi");
        }
    }
}
class MyTh1 extends Thread{
    Table t;
    MyTh1(Table t){
        this.t=t;
    }
    public void run(){
        synchronized(t){
            t.prTa(5);
        }
        
    }
}
class MyTh2 extends Thread{
    Table t;
    MyTh2(Table t){
        this.t=t;
    }
    public void run(){
        synchronized(t){
            t.prTa(5);
        }
    }
}




public class SyncThreadH {
    public static void main(String[] args) {
        Table obj =new Table();
        MyTh1 t1=new MyTh1(obj);
        MyTh2 t2=new MyTh2(obj);
        t1.start();
        t2.start();
    }
}
