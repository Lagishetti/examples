package dailyCodingProblem;
//day1
import java.util.*;

public class byUsingTwoPointers {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(5);
        list.add(8);
        list.add(9);
        int k=45;
        Collections.sort(list);
        int i=0;
        int ptr=0;
        int ptr2=list.size()-1;
        while(i<list.size()-2){
            int sum=list.get(ptr)+list.get(ptr2);
            if(ptr>=ptr2){
                System.out.println("no");
                break;}
            if(sum>k){
                ptr2-=1;
            }
            else if(sum<k){
                ptr+=1;
            }
            else{
                System.out.println("yes");
                break;
            }
        }
    }
}
