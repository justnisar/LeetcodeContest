package contest105;
import java.util.LinkedList;
import java.util.Queue;
import java.util.LinkedHashMap;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }

public class CBTInserter {


    private TreeNode root;
    private int count;

    public void getCount(TreeNode root){
        if(root == null){
            return;
        }
        getCount(root.left);
        count++;
        getCount(root.right);
    }

    public TreeNode getParent(TreeNode root, int number){

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int i = 0;
        while(!queue.isEmpty()){
            TreeNode currentNode = queue.poll();
            i++;
            if(i == number){
                return currentNode;
            }
            if(root.left != null){
                queue.add(root.left);
            }
            if(root.right != null){
                queue.add(root.right);
            }
        }
        return null;
    }

    public CBTInserter(TreeNode root) {

        getCount(root);
        this.root = root;
    }

    public int insert(int v) {

        TreeNode currentRoot = getParent();
        count++;
        if(count % 2 == 1){
            currentRoot.right = new TreeNode(v);
        }
        else{
            currentRoot.left = new TreeNode(v);
        }
        return currentRoot.val;
    }

    public TreeNode get_root() {
        return root;
    }
}
