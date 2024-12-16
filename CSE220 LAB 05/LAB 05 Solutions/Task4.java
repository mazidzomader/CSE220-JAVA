// Complete the swapChild method
public class Task4 {

    //===================================TASK#4===================================
    // This method takes only 3 parameters
    // 1st one is root of the given tree
    // 2nd one is there to help you count the levels
    // 3rd one is the level TILL which you need to swap childs
    // All the changes will happen in-place
    // This method doesn't return anything
    // You can use extra helper private static methods as per need
    public static BTNode swapChild( BTNode root, int lvl, int M ){
        //TO DO
        if (root == null || lvl == M) {
            return null;
        }
        BTNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        swapChild(root.left, lvl+1, M);
        swapChild(root.right, lvl+1, M);
        return root;
    }
    //============================================================================
}