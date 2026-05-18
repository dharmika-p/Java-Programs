import java.util.*;
public class towerH {
    public static void solveHanoi(int n, char source, char target, char auxillary){
        if(n==1){
            System.out.println("Move disk 1 from" +source+"to"+target);
            return;
        }
        solveHanoi(n-1, source,auxillary,target);
        System.out.println("Move disk "+n+" from "+source+" to "+target);
        solveHanoi(n-1,auxillary,target,source);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solveHanoi(n,'A','C','B');
    }
}
