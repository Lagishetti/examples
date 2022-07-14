public class finding2ndOr3rdGreater {
    public static void main(String[] args) {
        int a;
        int b;
        int c[]=new int[30];
        int d;
        c[0]=-1;
        c[2]=-3;
        c[3]=-55;
        c[8]=4;
        c[9]=5;

        a=c[4];
        b=a;
        d=b;
        for(int i=0;i<29;i++){
            if(c[i]<a){
                d=b;
                b=a;
                a=c[i];
            }
            else if(c[i]<b && c[i]!=a){
                d=b;
                b=c[i];
            }
            else if(c[i]<d && c[i]!=a && c[i]!=b){

            }

        }

       System.out.println(d);
    }
}
