package algorithm.binary_tree;

import java.util.Stack;

/**
 * @author yanjing
 * @desc
 */
public class BinaryTree1 {

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

    public void printNode(Node node) {
        System.out.println(node.getData());
    }

    public void preOrderTravel(Node node) {
        Stack<Node> stack = new Stack<>();
        Node root = node;

        while (root != null || stack.size() > 0) {
            if (root != null) {
                printNode(root);
                stack.push(root);
                root = root.getLeftChild();
            } else {
                root = stack.pop();
                root = root.getRightChild();
            }
        }
    }

    public void inOrderTravel(Node node) {
        Stack<Node> stack = new Stack<>();
        Node root = node;

        while (root != null || stack.size() > 0) {
            if (root != null) {
                stack.push(root);
                root = root.getLeftChild();
            } else {
                root = stack.pop();
                printNode(root);
                root = root.getRightChild();
            }
        }
    }

    public void postOrderTravel(Node node) {
        Stack<Node> stack = new Stack<>();
        Stack<Node> outputStack = new Stack<>();
        Node root = node;

        while (root != null || stack.size() > 0) {
            if (root != null) {
                stack.push(root);
                outputStack.push(root);
                root = root.getRightChild();
            } else {
                root = stack.pop();
                root = root.getLeftChild();
            }
        }

        while (outputStack.size() > 0) {
            printNode(outputStack.pop());
        }
    }

    public static void main(String[] args) {
        BinaryTree1 tree = new BinaryTree1();
        Node node = tree.init();
        tree.postOrderTravel(node);
    }
}

