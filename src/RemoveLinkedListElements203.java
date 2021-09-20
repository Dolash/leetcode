public class RemoveLinkedListElements203 {
    public ListNode203 removeElements(ListNode203 head, int val) {
        if (head == null)
        {
            return null;
        }
        while (head.val == val)
        {
            head = head.next;
            if (head == null)
            {
                return null;
            }
        }
        ListNode203 original = head;
        while (head != null)
        {
            ListNode203 current = head.next;
            if (current == null)
            {
                break;
            }
            while (current.val == val)
            {
                current = current.next;
                if (current == null)
                {
                    break;
                }
            }
            head.next = current;
            head = head.next;
        }
        return original;
    }
}
