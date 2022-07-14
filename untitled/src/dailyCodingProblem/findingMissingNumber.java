package dailyCodingProblem;

public class findingMissingNumber {
    public static void main(String[] args) {
        int arr[]={1,3,6,8,6,-5,4,8,4,5,3,4,5,3,2,-2
        };
        int size=arr.length;
        for(int i=0;i<size;i++){
            if(arr[i]==i || arr[i]<0){
                continue;
            }
           else{
                int temp=arr[i];
                arr[i]=arr[temp];
                arr[temp]=temp;
            }
        }
        for(int i=1;i<size;i++){
            if(arr[i]!=i){
            System.out.println(i);
            break;
            }
        }
    }
}
