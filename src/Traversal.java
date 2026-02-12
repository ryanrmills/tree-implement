public class Traversal {
  public static void main(String[] args) {
    TreeNode rooot = new TreeNode(10);

    System.out.println(rooot.value);

    rooot.left = new TreeNode(9);
    rooot.right = new TreeNode(15);

    rooot.left.left = new TreeNode(5);
    rooot.left.right = new TreeNode(2);

    rooot.right.left = new TreeNode(-3);
    rooot.right.right = new TreeNode(5);

    rooot.right.right.right = new TreeNode(22);

    preorder(rooot);
  }

  public static void preorder(TreeNode current1){

    if (current1 == null){
      return;
    }

    System.out.println(current1.value);

    if (current1.left != null){
      preorder(current1.left);
    }

    if (current1.right != null){
      preorder(current1.right);
    }

  }
}
