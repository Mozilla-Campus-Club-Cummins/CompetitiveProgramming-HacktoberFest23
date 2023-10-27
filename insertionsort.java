class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class InsertionSortLinkedList {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode sortedList = null;

        while (head != null) {
            ListNode current = head;
            head = head.next;

            if (sortedList == null || current.val < sortedList.val) {
                current.next = sortedList;
                sortedList = current;
            } else {
                ListNode search = sortedList;
                while (search.next != null && current.val >= search.next.val) {
                    search = search.next;
                }
                current.next = search.next;
                search.next = current;
            }
        }

        return sortedList;
    }

    // Helper function to print a linked list
    public void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InsertionSortLinkedList sorter = new InsertionSortLinkedList();

        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original linked list:");
        sorter.printLinkedList(head);

        ListNode sortedHead = sorter.insertionSortList(head);

        System.out.println("Sorted linked list:");
        sorter.printLinkedList(sortedHead);
    }
}
