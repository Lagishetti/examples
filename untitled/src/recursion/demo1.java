package recursion;

public class demo1 {
    public void fun(int a){
        if(a==0){
            return;
        }
        System.out.println(a+  "ddd");
       fun(a-1);
        System.out.println(a);
    }

    public static void main(String[] args) {
        demo1 c=new demo1();
        c.fun(5);
    }
}
