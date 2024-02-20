package Day11;

public class Double {
    
    public static Node constructDLL(int []arr) {
        // Write your code here
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i=1;i<arr.length;i++){
        Node newNode = new Node(arr[i]);
        temp.next = newNode;
        newNode.back = temp;
        temp = newNode;
    }   
    return head;
}
 public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private static Node deleteHead(Node head) {
        if (head == null || head.next == null) {
            return null; // Return null if the list is empty or contains only one element
        }
        
        Node prev = head;
        head = head.next;
        
        head.back = null; // Set 'back' pointer of the new head to null
        prev.next = null; // Set 'next' pointer of 'prev' to null
        
        return head;
    }

    private static Node deleteTail(Node head) {
        if (head == null || head.next == null) {
            return null; // Return null if the list is empty or contains only one element
        }
        
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        
        Node newtail = tail.back;
        
        newtail.next = null;
        tail.back = null;
        
        return head;
    }

    private static Node removeKthElement(Node head, int k) {
        if (head == null) {
            return null;
        }
        int count = 0;
        Node kNode = head;
        while (kNode != null) {
            count++;
            if (count == k) {
                break;
            }
            kNode = kNode.next;
        }
        Node prev = kNode.back;
        Node front = kNode.next;

        if (prev == null && front == null) {
            return null;
        } else if (prev == null) {
            return deleteHead(head);
        } else if (front == null) {
            return deleteTail(head);
        }

        prev.next = front;
        front.back = prev;

        kNode.next = null;
        kNode.back = null;

        return head;
    }


}

