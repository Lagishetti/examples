package dailyCodingProblem;

import org.w3c.dom.ls.LSOutput;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class mulWithoutDiv {
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
            v*=array.get(size-i);
            arrayR.add(v);
            k*=array.get(i);
            arrayL.add(k);
        }
        Collections.reverse(arrayR);
        System.out.println(arrayL);
        System.out.println(arrayR);
        arrayR.set(0,arrayR.get(1));
        for(int i=1;i<=size-1;i++){
            arrayR.set(i,arrayL.get(i-1)*arrayR.get(i+1));
        }
        arrayR.set(size,arrayL.get(size-1));
        System.out.println(array);
        System.out.println(arrayR);
    }

    public static void main(String[] args) {
        mulWithoutDiv x=new mulWithoutDiv();
        x.res();
    }

}
