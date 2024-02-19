package Day10;

public class DeletionList {

    
        // Method to remove the head of the linked list
        private static Node removesHead(Node head) {
            // Check if the linked list is empty
            if (head == null)
                return null;
            // Move the head to the next node
            head = head.next;
            // Return the updated head of the linked list
            return head;
            // There’s no need to delete the earlier head since it gets automatically deleted.
        }

        private static Node deleteTail(Node head) {
            // Check if the linked list is empty or has only one node
            if (head == null || head.next == null)
                return null;
            // Create a temporary pointer for traversal
            Node temp = head;
            // Traverse the list until the second-to-last node
            while (temp.next.next != null) {
                temp = temp.next;
            }
            // Nullify the connection from the second-to-last node to delete the last node
            temp.next = null;
            // Return the updated head of the linked list
            return head;
        }


        static Node deleteK(Node head, int k) {
            // Check if the list is empty
            if (head == null)
                return head;
    
            // If k is 1, delete the first node
            if (k == 1) {
                Node temp = head;
                head = head.next;
                temp = null;
                return head;
            }
    
            // Traverse the list to find the k-th node
            Node temp = head;
            Node prev = null;
            int cnt = 0;
    
            while (temp != null) {
                cnt++;
                // If the k-th node is found
                if (cnt == k) {
                    // Adjust the pointers to skip the k-th node
                    prev.next = prev.next.next;
                    // Delete the k-th node
                    temp = null;
                    break;
                }
                // Move to the next node
                prev = temp;
                temp = temp.next;
            }
    
            return head;
        }

}
