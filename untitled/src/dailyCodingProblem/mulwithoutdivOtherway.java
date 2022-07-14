package dailyCodingProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mulwithoutdivOtherway {
    public void res(){
        List<Integer> array=new ArrayList<>();
        List<Integer> arrayL=new ArrayList<>();
        List<Integer> arrayR=new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        int k=1;
        int v=1;
        int size=array.size()-1;
        for(int i=0;i<=size;i++){
            arrayL.add(k);
            k*=array.get(i);
        }
        for(int i=0;i<=size-1;i++){
            v*=array.get(size-i);
            arrayL.set(size-1-i,v*arrayL.get(size-i-1));
        }
        System.out.println(arrayL);
    }

    public static void main(String[] args) {
        mulwithoutdivOtherway x=new mulwithoutdivOtherway();
        x.res();
    }

}
