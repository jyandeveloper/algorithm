package algorithm.binary_tree;

/**
 * @author yanjing
 * @desc
 */
public class BinaryTree {

    // 初始化二叉树
    public Node init() {
        Node J = new Node(8, null, null);
        Node H = new Node(4, null, null);
        Node G = new Node(2, null, null);
        Node F = new Node(7, null, J);
        Node E = new Node(5, H, null);
        Node D = new Node(1, null, G);
        Node C = new Node(9, F, null);
        Node B = new Node(3, D, E);
        Node A = new Node(6, B, C);
        return A;
    }

    // 输出二叉树结点
    public void printNode(Node n) {
        System.out.println(n.getData());
    }

    // 线序遍历
    public void preOrderTravel(Node node) {
        if (node == null) {
            return;
        }

        printNode(node);
        if (node.getLeftChild() != null) {
            preOrderTravel(node.getLeftChild());
        }
        if (node.getRightChild() != null) {
            preOrderTravel(node.getRightChild());
        }
    }

    // 中序遍历
    public void InOrderTravel(Node node) {
        if (node == null) {
            return;
        }

        if (node.getLeftChild() != null) {
            InOrderTravel(node.getLeftChild());
        }
        printNode(node);
        if (node.getRightChild() != null) {
            InOrderTravel(node.getRightChild());
        }
    }

    // 后续遍历
    public void postOrderTravel(Node node) {
        if (node == null) {
            return;
        }

        if (node.getLeftChild() != null) {
            postOrderTravel(node.getLeftChild());
        }
        if (node.getRightChild() != null) {
            postOrderTravel(node.getRightChild());
        }
        printNode(node);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node root = tree.init();
        tree.postOrderTravel(root);
    }
}
