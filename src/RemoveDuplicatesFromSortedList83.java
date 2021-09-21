public class RemoveDuplicatesFromSortedList83 {
    public ListNode83 deleteDuplicates(ListNode83 head) {
        if (head == null)
        {
            return null;
        }
        ListNode83 original = head;
        while (original.next != null)
        {
            while (original.val == original.next.val)
            {
                original.next = original.next.next;
                if (original.next == null)
                {
                    break;
                }

            }
            original = original.next;
            if (original == null)
            {
                break;
            }
        }
        return head;
    }
}
