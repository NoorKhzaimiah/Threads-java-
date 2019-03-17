/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass2networkprog;

 
public class Ass2NetworkProg extends Thread {
 String name;
    Ass2NetworkProg(String name){
        this.name=name;
    }
    
    public void run(){
         for (int i=0;i<1000;i++)
        System.out.println(name+" : "+i);
    }
    
    public static void main(String[] args) {
         Ass2NetworkProg t1,t2;
        t1 = new Ass2NetworkProg("XXXXXXXXXXXXXXXXXXXXXXXXXXX");
        t2 = new Ass2NetworkProg("---------------------------");
        t1.start();
        t2.start();
      
     }
    
}
