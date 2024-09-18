import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args) {
        
        BinaryTree binaryBranch = new BinaryTree();

        for(int i = 0; i < 5; i++) {
            binaryBranch.insertNode(Double.parseDouble(JOptionPane.showInputDialog("Digite um número real:")));
        }

        binaryBranch.showNode();
    }
}
