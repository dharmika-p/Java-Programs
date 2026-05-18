import java.util.*;
public class stackPermutation {
    public static boolean isStackPermutation(int[] input, int[] output){
        int n = input.length;
        Stack<Integer> stack = new Stack<>();
        int j=0;
        for(int i=0;i<n;i++){
            stack.push(input[i]);
            while(!stack.isEmpty() && stack.peek() == output[j]){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        for(int i=0;i<n;i++){
            input[i] = sc.nextInt();
        }
        int[] output = new int[n];
        for(int i=0;i<n;i++){
            output[i] = sc.nextInt();
        }
        boolean valid = isStackPermutation(input, output);
        if(valid){
            System.out.println("Valid");
        }else{
            System.out.println("Npt Valid");
        }
    }
}
