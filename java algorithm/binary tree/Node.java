package algorithm.binary_tree;

/**
 * @author yanjing
 * @desc
 */
public class Node {

    private Integer data;

    private Node leftChild;

    private Node rightChild;

    public Node(Integer data, Node leftChild, Node rightChild) {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}