public class Traversal {
  public static void main(String[] args) {
    TreeNode<Integer> rooot = new TreeNode<>(10, null, null);

    rooot.left = new TreeNode<>(9, null, null);
    rooot.right = new TreeNode<>(15, null, null);

    rooot.left.left = new TreeNode<>(5, null, null);
    rooot.left.right = new TreeNode<>(2, null, null);

    rooot.right.left = new TreeNode<>(-3, null, null);
    rooot.right.right = new TreeNode<>(5, null, null);

    rooot.right.right.right = new TreeNode<>(22, null, null);

    TreeNode<String> stringRoot = new TreeNode<String>("hello", null, null);
    stringRoot.left = new TreeNode<String>("how", null, null);
    stringRoot.right = new TreeNode<String>("are", null, null);

    stringRoot.left.left = new TreeNode<String>("you", null, null);
    stringRoot.left.right = new TreeNode<String>("I", null, null);

    stringRoot.right.left = new TreeNode<String>("am", null, null);
    stringRoot.right.right = new TreeNode<String>("so", null, null);

    stringRoot.right.right.right = new TreeNode<String>("good", null, null);

    // preorder(rooot);
    //postorder(rooot);
    // inorder(stringRoot);

    //allows it to fail at compile time rather than runtime
    printGreater(rooot, 100);
    
  }

  public static int countNodes(TreeNode<?> node){
    if (node == null) return 0;
    // int leftCount = countNodes(node.left);
    // int rightCount = countNodes(node.right);
    // int overallCount = leftCount + rightCount + 1;
    // return overallCount;

    return countNodes(node.left) + countNodes(node.right) + 1;
  }


  public static void printGreater(TreeNode<Integer> node, int threshold){
    if (node == null) return;
    if (node.value > threshold) System.out.println(node.value);
    printGreater(node.left, threshold);
    printGreater(node.right, threshold);
  }

  public static <T> void postorder(TreeNode<T> node){
    if (node == null) return;
    postorder(node.left);
    postorder(node.right);
    System.out.println(node.value);
  }

  public static <E> void preorder(TreeNode<E> current1){

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

  public static <T> void inorder(TreeNode<T> node){
    if (node == null) return;
    inorder(node.left);
    System.out.println(node.value);
    inorder(node.right);
  }
}
