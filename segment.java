import java.io.*;
import java.util.*;
public class segment {
static void simpleSieve(int limits, List<Integer> primes){
    boolean[] bool = new boolean[limits+1];
    Arrays.fill(bool,true);
    for(int i=2; i<=Math.sqrt(limits);i++){
        if(bool[i]){
            for(int j=(i*i);j<=limits;j=j+i){
                bool[j]=false;
            }
        }
    }
    for(int i=2;i<=limits;i++){
        if(bool[i]=true){
            primes.add(i);
        }
    }
}
static void segmentedSieve(int low, int high){
    int limits = (int) Math.sqrt(high)+1;
    List<Integer> primes = new ArrayList<>();
    simpleSieve(limits,primes);
    boolean[] bool = new boolean[high-low+1];
    Arrays.fill(bool,true);
    for(int prime: primes){
        int start = Math.max(prime*prime,(low+prime-1)/prime*prime);
        for(int j=start; j<=high;j=j+prime){
            bool[j-low] = false;
        }
    }
    for(int i=low;i<=high;i++){
        if(i>1 && bool[i-low]){
            System.out.println(i+" ");
        }
    }
}
public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int low = in.nextInt();
    int high = in.nextInt();
    segmentedSieve(low,high);
}
    
}
