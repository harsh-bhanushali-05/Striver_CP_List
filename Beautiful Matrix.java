import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int x = 0;
        int y = 0;
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j++){
                if(sc.nextInt() == 1){
                    x = i;
                    y = j;
                }
            }
        }
        int ans = Math.abs(2 - x) + Math.abs(2 - y);
        System.out.println(ans);
    }
}