import java.util.*;
public class Solution {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in); 
        int a = sc.nextInt(); 
        int b = sc.nextInt();
        int c = sc.nextInt();
        int dc = Math.abs(a-c) + Math.abs(b-c);
        int ac = Math.abs(a-c) + Math.abs(b-a);
        int ab = Math.abs(a-b) + Math.abs(b-c);
        System.out.println(Math.min(dc, Math.min(ac, ab)));
    }
}
