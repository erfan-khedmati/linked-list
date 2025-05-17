import java.util.ArrayList;

public class linkedList {
//    static ArrayList<Node> list= new ArrayList<>();
    static Node head;

    // Functions-----------------------------------

    // Is empty *****************
    public static boolean isEmpty() {
//        return list.isEmpty();
        return head == null;
    }

    // Display list *****************
    public static void display() {
        // If list is empty
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        // Display each node
        // make current to head
        Node current = head;

        while (true) {
            System.out.print(current.data + " -> ");
            if(current.next == null) {
                System.out.println("NULL");
                break;
            }
            current = current.next;
        }
    }

    // Remove item *****************
    public void remove(int index) {
        // User friendly inde
        index--;

        // if is empty
        if(isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        // move current to the index
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }


        if(current.prev == null) { // if it's first node
            current.next.prev = null;
            head = current.next;
            current.next = null;
        } else if(current.next == null) { // if its last node
            current.prev.next = null;
        }
        else { // if its between the nodes
            current = current.prev; // select prev node
            Node nextIndex = current.next.next;
            current.next = current.next.next;
            nextIndex.prev = current;
        }
    }

    // Insert After *****************
    public void insertAfter(int index, Node newNode) {
        // User friendly index
        index--;

        // if is empty
        if(isEmpty()){
            head = newNode;
            return;
        }

        // if it's not
        // make current to head
        Node current = head;

        // increase the current index to the index goal
        for(int i = 0; i < index; i++) {
            current = current.next;
        }

        // switch and push the new node between the index and next index
        newNode.prev = current;
        newNode.next = current.next;
        if(current.next != null) {
            Node nextIndex = current.next;
            nextIndex.prev = newNode;
        }
        current.next = newNode;
    }

    // Insert Before *****************
    public void insertBefore(int index, Node newNode) {
        // User friendly index
        index--;


        // if is empty
        if (isEmpty()) {
            head = newNode;
            return;
        }

        // if it's not
        // make current to head
        Node current = head;

        // increase the current index to the index goal
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        // switch and push the new node between the index and prev index
        newNode.next = current;
        newNode.prev = current.prev;

        if (current.prev == null) {// if its first node
            head = newNode;
            newNode.next = current;
            current.prev = newNode;
        } else { // if its last node
            current.prev.next = newNode;
            newNode.next = current;
            newNode.prev = current.prev;
            current.prev = newNode;
        }
    }
}