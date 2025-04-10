import java.util.*;
public class Solution {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();
        int ans = Math.min(c*d/n , Math.min(k*l/(nl*n) , p/(n * np)));
        System.out.println(ans);
    }
}
