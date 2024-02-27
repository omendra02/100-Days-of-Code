package Day18;
//using stack

    import java.util.Stack;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLL {
    Node head;

    // Method to push a new node to the beginning of the linked list
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to reverse the linked list using a stack
    public void reverseUsingStack() {
        if (head == null || head.next == null)
            return;

        Stack<Node> stack = new Stack<>();
        Node current = head;

        // Push all nodes onto the stack
        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        // Pop nodes from the stack and re-link them to form the reversed list
        head = stack.pop();
        current = head;
        while (!stack.isEmpty()) {
            current.next = stack.pop();
            current = current.next;
        }
        current.next = null;
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Example usage
    public static void main(String[] args) {
        ReverseLL list = new ReverseLL();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);

        System.out.println("Original Linked List:");
        list.display();

        System.out.println("Reversed Linked List:");
        list.reverseUsingStack();
        list.display();
    }
}


