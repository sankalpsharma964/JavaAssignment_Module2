public class Q2_ReverseLinkedList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int v) { val = v; }
    }

    static ListNode reverse(ListNode head) {
        ListNode prev = null, cur = head;
        while (cur != null) {
            ListNode nxt = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nxt;
        }
        return prev;
    }

    static ListNode build(int... a) {
        ListNode dummy = new ListNode(0), t = dummy;
        for (int x : a) { t.next = new ListNode(x); t = t.next; }
        return dummy.next;
    }
    static void print(ListNode h) {
        for (ListNode p = h; p != null; p = p.next)
            System.out.print(p.val + (p.next != null ? " -> " : ""));
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = build(1,2,3,4,4,3,2,1);
        System.out.print("Original: "); print(head);
        head = reverse(head);
        System.out.print("Reversed: "); print(head);
    }
}
