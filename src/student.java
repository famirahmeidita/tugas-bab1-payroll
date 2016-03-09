/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainstudent;

/**
 *
 * @author Meidita
 */
import java.util.Calendar;
public class student {
private String name;
private String NIK,masuk,keluar;
private int gaji;
private int Tunjangan;
private int denda ;
private int bonus;
private int totalgaji;
public student(){
name = "";
NIK = "";
gaji = 0;
}


public student(String n, String a, int g){
name = n;
NIK = a;
gaji = g;
}
public void setName(String n){
    name = n;
}
public void setNIK(String a){
NIK = a;
}
public void setmasuk (String m){
    masuk= m;
    
}
public void setkeluar(String p){
    keluar = p;
}
public void setgaji(int g){
gaji = g;
}
public void setTunjangan(int T){
Tunjangan = T;
}
public void setDenda(int D){
denda = D;
}
public void setBonus(int b){
bonus = b;
}
 private double totalgaji(){
double result = 0;
result = (gaji+Tunjangan+bonus)-denda;
return result;
}

public void setHari (){
    String [] hari = {"","Minggu","Senin","selasa","Rabu","kamis","Jumat","Sabtu"};
        Calendar sekarang = Calendar.getInstance();
        System.out.println("Hari ini : "+hari[sekarang.get(Calendar.DAY_OF_WEEK)]);
        
}
public void setCalendar (){
     Calendar now= Calendar.getInstance ();
        System.out.println("now :"+now.get(Calendar.YEAR)+"-"+(now.get(Calendar.MONTH)+1)+"-"
        +now.get(Calendar.DAY_OF_WEEK*2
        )+"-"+now.get(Calendar.HOUR
        )+"-"+now.get(Calendar.MINUTE));
}
public void displayMessage(){
System.out.println(NIK+","+name+","+gaji+","+Tunjangan+","+bonus+","+denda);

}
public void displayMessage2(){
    Calendar now= Calendar.getInstance ();
        System.out.println(NIK+","+now.get(Calendar.YEAR)+"-"+(now.get(Calendar.MONTH)+1)+masuk+","+keluar);
        

}

}        

