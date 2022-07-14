package recursion;

import java.util.ArrayList;
import java.util.List;

public class minimumNumberOfCoines {
    public static void main(String[] args) {
        minimumNumberOfCoines x=new minimumNumberOfCoines();
        int arr[]={1,2,5,10,20,50};
        System.out.println(x.finding(arr,47));

    }
    public int finding(int arr[],int amount){
        if(amount==0){
            return 0;
        }
        else{
            int max=99999;
            for(int i=0;i<arr.length-1;i++){
                if(amount>=arr[i]){
                int val=1+finding(arr,amount-arr[i]);
                if(max>val){
                    max=val;
                }}

            }
            return max;
        }

    }
}
