import java.util.*;
public class number {
    public static void main(String[] args) {
        TreeSet<Integer> randomCollection = new TreeSet<Integer>();
        ArrayList<Integer> array = new ArrayList<Integer>();
        System.out.println("電腦從 1~100 的整數中，亂數取出 10 個不重複的號碼....");
        
        while(array.size() <= 10 ){ 
            Random random = new Random();
            int randomNumber = random.nextInt(100) + 1;
            if(array.contains(randomNumber)){
                continue;
            }
            else{
                array.add(randomNumber);   
            }
        }
        for(int j = 0 ; j <= 9 ; j++){
            System.out.printf("第 %d 個號碼 : %d\n",j+1,array.get(j));
            randomCollection.add(array.get(j));
        }
            System.out.println("物件內元素個數為 : " + randomCollection.size());
            System.out.println("物件內元素的內容 : "+randomCollection);
            System.out.println("第一個元素內容為 : "+randomCollection.first());
            System.out.println("最後一個元素內容為 : "+randomCollection.last());
            System.out.println("內容介於 30~70 者 : "+randomCollection.subSet(30,70));
    

        
    
    }
}
