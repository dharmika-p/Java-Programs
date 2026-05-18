import java.util.*;
public class longestvp {
    public static int longestValidParenthesis(String s){
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int maxLen = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                st.push(i);
            } else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                } else{
                    maxLen = Math.max(maxLen, i-st.peek());
                }
            }
        }
        return maxLen;
    }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine().trim();
            System.out.println(longestValidParenthesis(s));
            sc.close();

    }
}
