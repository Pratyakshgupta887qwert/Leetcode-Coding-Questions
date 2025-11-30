import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++) {
            String s= sc.next();
            if(s.equals("cab") || s.equals("bca")) {
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}