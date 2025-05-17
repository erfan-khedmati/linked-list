public class Main {
    public static void main(String[] args) {
        linkedList list = new linkedList();

        Node node3 = new Node(3);
        Node node2 = new Node(2);
        Node node1 = new Node(1);

        list.insertAfter(1, node1);
        list.insertAfter(1, node2);


//        list.remove(1);
//
//        list.insertAfter(1, node2);

        list.insertBefore(2, node3);

        list.display();
    }
}
