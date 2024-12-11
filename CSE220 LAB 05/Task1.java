// Complete the convertMirror method
public class Task1 {

    //======================TASK#1======================
    // This method takes only 1 parameter which is root
    // You'll need to create a new Mirrored Tree and return the new root
    public static BTNode convertMirror( BTNode root ){
        if ( root == null ){
            return null;
        }
        BTNode newRoot = new BTNode(root.elem);
        newRoot.left = convertMirror( root.right );
        newRoot.right = convertMirror( root.left );
        return newRoot; //remove this line
    }
    //==================================================

}
