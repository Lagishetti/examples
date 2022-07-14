public class binarySearch {
    public static void main(String[] args) {
    binarySearch x=new binarySearch();
    int[] value={1,4,6,7,8,22,44,66,88,77};
    int k=66;
        System.out.println(x.BinarySearch(value,k));
    }

    public int BinarySearch(int[] value,int k){
        int i=0;
        int j=value.length-1;
        while(i<j){
           int mid=(i+j)/2;
           if(value[mid]==k){
               return 1;
           }
           else{
               if(value[mid]>k){
                   j=mid-1;
               }
               else{
                   i=mid+1;
               }
           }
        }
        return 0;
    }
}
