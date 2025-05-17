public class Stack extends linkedList {
    public void pop() {
        // if its empty
        if(isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        int index = 0;
        while(current != null) {
            current = current.next;
            index++;
        }

        remove(index);
    }

    public void push(Node node) {
        if(isEmpty()) {
            head = node;
            return;
        }

        int index = 0;
        Node current = head;
        while(current != null) {
            index++;
            current = current.next;
        }

        insertAfter(index, node);
    }
}