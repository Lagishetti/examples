
import java.util.Scanner;

public class findingNumbersNumber {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
         int value=keyboard.nextInt();
         StringBuilder temp=new StringBuilder();
         int i=1;
         while(temp.length()<value){
             temp.append(i);
             i+=1;
         }
         System.out.println(temp.charAt(value-1));
    }
}
