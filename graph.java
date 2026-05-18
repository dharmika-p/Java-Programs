import java.util.*;
public class graph {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        adj_ver = new LinkedList[v];
        for(int i=0; i < v; i++){
            adj_ver[i] = new LinkedList<>();
        }
        int e = sc.nextInt();
        for(int i = 0; i< e; i++){
            int s = sc.nextInt();
            int d = sc.nextInt();
            adj_ver[s].add(d);
            adj_ver[d].add(s);
        }
        int src = sc.nextInt();
        boolean vis[] = new boolean[v];
        DFS(src,vis);
    }
    static void DFS(int src, int v){
        vis[src] = true;
        System.out.print(src+ " ");
        for(int nei:adj_ver[src]){
            if(!vis[nei]){
                DFS(nei, vis);
            }
        }
    }
}
