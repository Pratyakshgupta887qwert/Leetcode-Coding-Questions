import java.util.*;
public class A{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(), r=0;
        while(n-->0)
        r+=s.next().contains("+")?1:-1;
        System.out.print(r);
    }
}