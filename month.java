import java.util.*;
import java.util.Scanner;
public class month {
    public static void main(String[] args) {
        HashMap<Integer,String> month =new HashMap<Integer,String>();
        month.put(1,"January");
        month.put(2,"February");
        month.put(3,"March");
        month.put(4,"April");
        month.put(5,"May");
        month.put(6,"June");
        month.put(7,"July");
        month.put(8,"August");
        month.put(9,"September");
        month.put(10,"October");
        month.put(11,"November");
        month.put(12,"December");
        
        Scanner input = new Scanner(System.in);
        System.out.printf("請輸入 1~12 ? ");
        int number = input.nextInt();
        while(number > 12 || number < 1){
            System.out.println("範圍錯誤 !"); 
            System.out.printf("請輸入 1~12 ? ");
            number = input.nextInt();
        }
        
        
        if(number == 1){
            System.out.println("第 1 月的英文單字為 "+month.get(1));
        }
        else if(number == 2){
            System.out.println("第 2 月的英文單字為 "+month.get(2));
        }
        else if(number == 3){
            System.out.println("第 3 月的英文單字為 "+month.get(3));
        }
        else if(number == 4){
            System.out.println("第 4 月的英文單字為 "+month.get(4));
        }
        else if(number == 5){
            System.out.println("第 5 月的英文單字為 "+month.get(5));
        }
        else if(number == 6){
            System.out.println("第 6 月的英文單字為 "+month.get(6));
        }
        else if(number == 7){
            System.out.println("第 7 月的英文單字為 "+month.get(7));
        }
        else if(number == 8){
            System.out.println("第 8 月的英文單字為 "+month.get(8));
        }
        else if(number == 9){
            System.out.println("第 9 月的英文單字為 "+month.get(9));
        }
        else if(number == 10){
            System.out.println("第 10 月的英文單字為 "+month.get(10));
        }
        else if(number == 11){
            System.out.println("第 11 月的英文單字為 "+month.get(11));
        }
        else if(number == 12){
            System.out.println("第 12 月的英文單字為 "+month.get(12));
        }
        
    }
}
