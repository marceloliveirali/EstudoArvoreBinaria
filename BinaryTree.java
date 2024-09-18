public class BinaryTree {
    
    BDoubleNo root;

    private BDoubleNo insert(BDoubleNo tree, double newNode) {

        if (tree == null) {
            return new BDoubleNo(newNode);
        } else {
            if (newNode < tree.value) {
                tree.left = insert(tree.left, newNode);
            } else {
                tree.right = insert(tree.right, newNode);
            }
        }

        return tree;
    }

    public void insertNode(double newValue) {

        root = insert(root, newValue);
    }

    private void showLeft(BDoubleNo arbor) {

        if (arbor != null) {
            showLeft(arbor.left);
            System.out.println(arbor.value);
        }
    }

    private void showNodeLeft() {

        showLeft(root);
    }

    private void showRight(BDoubleNo arbor) {

        if (arbor != null) {
            showLeft(arbor.right);
            System.out.println(arbor.value);
        }
    }

    private void showNodeRight() {

        showRight(root);
    }

    public void showRoot() {

        System.out.println("Raiz: " + root.value);
    }

    public void showNode() {

        showNodeLeft();
        showRoot();
        showNodeRight();
    }
}
