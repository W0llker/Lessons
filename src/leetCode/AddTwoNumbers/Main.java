package leetCode.AddTwoNumbers;


import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        ListNode l = new ListNode(3);
        ListNode l1 = new ListNode(4, l);
        ListNode l2 = new ListNode(2, l1);

        ListNode z = new ListNode(4);
        ListNode z1 = new ListNode(6, z);
        ListNode z2 = new ListNode(5, z1);

        l = new Main().addTwoNumbers(l2, z2);
        System.out.println(l.val);
        l = l.next;
        System.out.println(l.val);
        l = l.next;
        System.out.println(l.val);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String l1Nubm = "";
        while (l1.next != null) {
            l1Nubm += l1.val;
            l1 = l1.next;
        }
        l1Nubm += l1.val;
        l1Nubm = String.valueOf(new StringBuilder(l1Nubm).reverse());

        String l2Nubm = "";
        while (l2.next != null) {
            l2Nubm += l2.val;
            l2 = l2.next;
        }
        l2Nubm += l2.val;
        l2Nubm = String.valueOf(new StringBuilder(l2Nubm).reverse());

        String z = (new BigInteger(l1Nubm).add(new BigInteger(l2Nubm))).toString();
        System.out.println(z);
        ListNode result = new ListNode(Integer.parseInt(String.valueOf(z.charAt(0))));
        for (int i = 1; i < z.length(); i++) {
            result = new ListNode(Integer.parseInt(String.valueOf(z.charAt(i))), result);
        }
        return result;
    }
}
