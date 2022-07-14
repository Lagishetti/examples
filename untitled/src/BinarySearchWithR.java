public class BinarySearchWithR {
    public static void main(String[] args) {
        BinarySearchWithR x=new BinarySearchWithR();
        int[] value={1,66};
        int k=66;
        System.out.println(x.BinarySearch(value,k,0,value.length-1));
    }
    public int BinarySearch(int[] value, int k,int i,int j){
        int mid=(i+j)/2;
        if(value[mid]==k){
            return 1;
        }
        else if(i<j)
        {   int x;
            if(value[mid]<k){
            x=BinarySearch(value,k,mid+1,j);}
            else {
                x=BinarySearch(value,k,i,mid-1);
            }
            return x;
        }
        return 0;


    }
}
