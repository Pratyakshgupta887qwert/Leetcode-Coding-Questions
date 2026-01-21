import java.util.*;
 
public class B {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int t = sc1.nextInt();
        while (t-- > 0) {
            int n = sc1.nextInt();
            char ch[] = sc1.next().toCharArray();
            int q = 0;
 
            for (int i = 0; i < n; i++) {
                if (ch[i] == 'Q')
                    q++;
                else
                    q = Math.max(0, q - 1);
            }
 
            if (q == 0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        sc1.close(); // optional but good practice
    }
}