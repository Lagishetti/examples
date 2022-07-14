package recursion;

public class demo2 {
    public void fun(int a){
        if(a==0){
            return;
        }

        fun(a-1);
        fun(a-1);
        System.out.println(a+  "<=before");

    }
    public static void main(String[] args) {
        demo2 c=new demo2();
        c.fun(3);
    }
}
