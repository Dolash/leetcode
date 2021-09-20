
public class LinkedListCycle141 {
    public boolean hasCycle(ListNode head) {
    boolean result = false;
    ListNode fast = head;
    ListNode slow = head;
    while (fast != null && slow != null)
    {
        if (fast.next == null)
        {
            return false;
        }
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast)
        {
            return true;
        }
    }

    return result;
    }
}
