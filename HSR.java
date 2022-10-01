import java.util.*;
class ticketClass implements Runnable{
    
    static int ticket = 10000;
    int selledTicket;
    Thread sell;
    
    ticketClass(String name){
        selledTicket = 0;
        sell = new Thread(this,name);
        sell.start();
       
        
    }
    
    public void run(){
        
        while(ticket != 0){
            int i = sellTicket();
            if(i > 0){
            selledTicket += i ;
            System.out.println(sell.getName()+"賣出"+i+"張票");
            }
        }
        System.out.println(sell.getName()+"總共賣出"+selledTicket+"張票");
        
    }
    
        synchronized private static int sellTicket(){
            Random random = new Random();
            int n = random.nextInt(4) + 1;
            if (ticket >= n ){
                ticket = ticket - n;
                return n;
            }else{
                return 0;
            }
        }
       
    
}







public class HSR {
    public static void main(String[] args) {
   
    ticketClass sA = new ticketClass("售票機A");
    ticketClass sB = new ticketClass("售票機B");
    ticketClass sC = new ticketClass("售票機C");
    ticketClass sD = new ticketClass("售票機D");
    
    }
}
