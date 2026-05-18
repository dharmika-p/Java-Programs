import java.util.*;
public class bt {
    static TreeNode buildTree(String arr[]){
        if(arr.length==0 || arr[0].equals(anObject:"N")) return null;
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> q = new TreeNode();
        q.add(root);
        int i = 1;
        while(!q.isEmpty()&&i<arr.length){
            TreeNode cn = q.poll();
            String cv = arr[i];
            if(!cv.equals(anObject:"N")){
                cn.left = new TreeNode(Integer.parseInt(cv));
                q.add(cn.left);
            }
            i++;
            if(i>=arr.length) break;
            cv = arr[i];
            if(!cv.equals(anObject:"N")){
                cn.right = new TreeNode(Integer.parseInt(cv));
                q.add(cn.right);
            }
            i++;
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s[] = sc.nextLine().split(regex:" ");
        TreeNode root = buildTree(s);
        preorder()
    }
}
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int d){
        data = d;
        left = right = null;
    }
}
