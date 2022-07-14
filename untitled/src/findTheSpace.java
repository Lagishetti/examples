public class findTheSpace {
    public static void main(String[] args) {
        int arry[]={1,2,3,4,5,6,7,8,9};
        int arr[]=new int[30];
        int count=0;
        String inf="rahul rahul gfbbf ewfwnefjnw eincwaeifhuw iefnwrufywcrdfnca idwendnwendcn fcwedfnwrdfcs rwjdfncwrds";
        for(char a : inf.toCharArray()){
            if(a == 32){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
