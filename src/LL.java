import java.util.Arrays;

public class LL {

    static Node head = null;
    static Node currentNode = null;

    static class Node {
        Object val;
        Node next;

        Node(Object val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        LL l = new LL();
        l.add(1);
        l.add(3);
        l.add(8);
        l.add(4);
        l.add("d");

        System.out.println(l);
        System.out.println(l.size());


    }


    void add(Object val) {
        if (head == null) {
            head = new Node(val);
        } else {
            Node node = new Node(val);
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = node;
        }
    }

    @Override
    public String toString() {
        int count = 0;
        for(currentNode = head; currentNode!=null; currentNode = currentNode.next){
            count++;
        }
        int i = 0;
        Object[] arr = new Object[count];
        for(currentNode = head; currentNode!=null; currentNode = currentNode.next){
            arr[i++] = currentNode.val;
        }
        return Arrays.toString(arr);
    }
    private int size(){
        int count = 0;
        for(currentNode = head; currentNode!=null; currentNode = currentNode.next){
            count++;
        }
        return count;
    }
}

