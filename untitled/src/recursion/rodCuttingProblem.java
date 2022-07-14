package recursion;

public class rodCuttingProblem {
    public static void main(String[] args) {
        int arr[]={2,4,6,7,8,17,7,8};
        int rod=8;
        rodCuttingProblem x=new rodCuttingProblem();
        System.out.println(x.findMax(arr,rod));

    }
    public int findMax(int arr[],int rod_size){
        if(rod_size==0) {
            return 0;
        }
        else {int max=0;
            for (int i = 1; i <= rod_size; i++) {
                if(rod_size>=i){
                int res =arr[i-1]+findMax(arr,rod_size-i);
                if(max<res){
                    max=res;
                }
                }
            }
            return max;
        }
    }
}
