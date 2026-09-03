import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a < -100000 || b < -100000 || a > 100000 || b > 100000) {
            System.out.println("a와 b의 범위는 -100,000 ~ 100,000까지 입니다.");
        } else {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
        
        
        
    }
}