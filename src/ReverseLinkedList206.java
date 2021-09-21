public class ReverseLinkedList206 {
    public ListNode206 reverseList(ListNode206 head) {
        ListNode206 previous = null;
        while (head != null)
        {
            ListNode206 nextNode = head.next;
            head.next = previous;
            previous = head;
            head = nextNode;
        }
        return previous;
    }
}
