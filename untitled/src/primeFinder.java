import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class primeFinder {
    public static void main(String arg[]){
        Scanner keyBoard=new Scanner(System.in);
        List<Integer> list=new ArrayList();
        int value=keyBoard.nextInt();
        primeFinder y=new primeFinder();
        for(int i=2;i<=value;i++){
            if(y.primeOrNot(i)){
                list.add(i);
            }
        }
        System.out.println(list);
    }
    public boolean primeOrNot(int value){
        if(value<=1){
            return false;
        }
        else{
            for(int i = 2;i<=(int)value/2;i++){
                if(value%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}
