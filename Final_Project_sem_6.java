/**
Учитывая двоичного дерева, верните порядок обхода значений его узлов.
пример
Input: root = [1,null,2,3]
Output: [1,2,3]
public class TreeNode {
int val;
TreeNode left;
TreeNode right;
TreeNode() {}
TreeNode(int val) { this.val = val; }
TreeNode(int val, TreeNode left, TreeNode right) {
this.val = val;
this.left = left;
this.right = right;
}
}
public List<Integer> preorderTraversal(TreeNode root) {
}*/


import java.util.ArrayList;
import java.util.Stack;

public class Final_Project_sem_6 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[J");

        TreeNode nodeOne = new TreeNode(1, new TreeNode(null), new TreeNode(2, new TreeNode(), new TreeNode(3)));
        System.out.println("\u001B[32m"+TreeNode.preorderTraversal(nodeOne));
        TreeNode nodeTwo = new TreeNode(3, new TreeNode(1, new TreeNode(0), new TreeNode()), new TreeNode(5, new TreeNode(4), new TreeNode(6)));
        System.out.println("\u001B[34m"+TreeNode.preorderTraversal(nodeTwo));
    }
}

class TreeNode {
    Integer val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(Integer val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static ArrayList<Integer> preorderTraversal(TreeNode root) {

        ArrayList<Integer> result = new ArrayList<>();

        if (root == null) return result;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.val != null) result.add(node.val);
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
        return result;
    }

}