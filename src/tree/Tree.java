package tree;

import java.util.Scanner;

public class Tree {

    static Scanner sc = null;

    static class Node{
        Node left;
        Node right;
        int data;

        Node(int data){
            this.left = null;
            this.right = null;
            this.data = data;
        }
    }
    static class BT{
        static public Node createTree(){
            Node root;

            System.out.println("Enter data");
            int data = sc.nextInt();

            if(data == -1){
                return null;
            }

            root = new Node(data);
            System.out.println("Enter left " + data);
            root.left = createTree();

            System.out.println("Enter Right " + data);
            root.right = createTree();

            return root;

        }

        static void inOrder(Node root){
            if(root == null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
        static void preOrder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            inOrder(root.left);
            inOrder(root.right);
        }
        static void postOrder(Node root){
            if(root == null){
                return;
            }
            inOrder(root.left);
            inOrder(root.right);
            System.out.print(root.data + " ");
        }
    }


    public static void main(String[] args) {
        sc = new Scanner(System.in);

        Node root = BT.createTree();

        BT.inOrder(root);
        System.out.println();
        BT.preOrder(root);
        System.out.println();
        BT.postOrder(root);
    }
}