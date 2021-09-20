public class MergeTwoLists21 {
    public ListNode21 mergeTwoLists(ListNode21 l1, ListNode21 l2) {
        ListNode21 newHead;
        ListNode21 current;
        if (l1 == null && l2 == null)
        {
            return null;
        }
        else if (l1 == null)
        {
            return l2;
        }
        else if (l2 == null)
        {
            return l1;
        }

        if (l1.val < l2.val)
        {
            newHead = l1;
            current = l1;
            l1 = l1.next;
        }
        else
        {
            newHead = l2;
            current = l2;
            l2 = l2.next;
        }

        while (l1 != null || l2 != null)
        {
            if (l1 != null && l2 != null)
            {
                if (l1.val < l2.val)
                {
                    current.next = l1;
                    current = l1;
                    l1 = l1.next;
                }
                else
                {
                    current.next = l2;
                    current = l2;
                    l2 = l2.next;
                }
            }
            else
            {
                if (l1 == null)
                {
                    current.next = l2;
                    current = l2;
                    l2 = l2.next;
                }
                else
                {
                    current.next = l1;
                    current = l1;
                    l1 = l1.next;
                }
            }
        }
        return newHead;
    }
}
