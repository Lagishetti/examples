//day1
package dailyCodingProblem;
import java.util.*;
public class findingSumOfTwoNumberIsK {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int[] arr=new int[30];
        int k=14;
        System.out.println("Enter the size of array : ");
        int size=keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("enter the values of array :");
        for(int i=0;i<size;i++){
            arr[i]=keyboard.nextInt();
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<size;i++){
            if(map.get(arr[i])==null){
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        for(int i=0;i<size;i++){
            int x=k-arr[i];
            map.put(arr[i],map.get(arr[i])-1);
            if(map.containsKey(x) && map.get(x)>0){
                System.out.println("yes");
                break;
            }
            map.put(arr[i],map.get(arr[i])+1);
        }
    }
}
