import java.util.*;
public class celebrity {
    public static int findCelebrity(int[][] matrix, int n){
        int candidate = 0;
        for(int i = 1; i < n; i++){
            if(matrix[candidate][i]==1){
                candidate = i;
            }
        }
        for(int i=0;i<n;i++){
            if(i!=candidate &&(matrix[candidate][i]==1 || matrix[i][candidate]==0)){ // dont compare cebelb with himself compare with rest of all
                return -1;
            }
        }return candidate;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int celebrity = findCelebrity(matrix, n);
        if(celebrity == -1){
            System.out.println("No celebrity found");
        }else{
            System.out.println(celebrity);
        }
    }
}
