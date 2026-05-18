/*import java.io.*;
class bpalin {
    public static void main(String[] args)
    {
        int x=9;
  String s = Integer.toBinaryString(x);
        boolean ans = false;
        String s1="";
        for (int i = s.length() - 1; i >= 0; i--) {
            s1 = s1 + s.charAt(i);
        }
if (s.equals(s1)) {
            System.out.println("True");
        }
        else
        System.out.println("False");
    }
}*/
import java.io.*;
import java.util.*;
public class bplain{
    static boolean palindrome(int n){
        String s = Integer.toBinaryString(n);
        int i=0, j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
    }
    return true;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        palindrome(n);
        if(palindrome(n)){
            System.out.println(n+"is binary palindrome");
        }else{
            System.out.println(n+"is not a binary palindrome");
        }
    }
}
