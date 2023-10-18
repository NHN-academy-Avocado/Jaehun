//class ListNode {
//    String info;
//    ListNode next;
//
//    public static int length(ListNode lis) {
//        int result = 0;
//        while (lis != null) {
//            result++;
//            lis = lis.next;
//        }
//        return result;
//    }
//
//    public static ListNode insertAfter(ListNode lis, String s, String given) {
//        ListNode tmp = lis;
//        while (tmp != null) {
//            if (tmp.info.equals(given)) {
//                ListNode p = new ListNode();
//                p.info = s;
//                p.next = tmp.next;
//                tmp.next = p;
//                break;
//            }
//            tmp = tmp.next;
//        }
//        return lis;
//    }
//
//    public static ListNode modify(ListNode lis, String old, String ne) {
//        ListNode tmp = lis;
//        while (tmp != null) {
//            if (tmp.info.equals(old)) {
//                tmp.info = ne;
//                break;
//            }
//            tmp = tmp.next;
//        }
//        return lis;
//    }
//
//    public static ListNode modifyAll(ListNode lis, String old, String ne) {
//        ListNode tmp = lis;
//        while (tmp != null) {
//            if (tmp.info.equals(old)) {
//                tmp.info = ne;
//            }
//            tmp = tmp.next;
//        }
//        return lis;
//    }
//
//    public static ListNode insertBefore(ListNode lis, String s, String given) {
//        ListNode p = new ListNode();
//        p.next = lis;
//        lis = p;
//
//        while (p.next != null) {
//            if (p.next.info.equals(given)) {
//                ListNode n = new ListNode();
//                n.info = s;
//                n.next = p.next;
//                p.next = n;
//                break;
//            }
//            p = p.next;
//        }
//        return lis.next;
//    }
//
//    public static ListNode copy(ListNode lis) {
//        ListNode head = null;
//
//        while (lis != null) {
//            ListNode newNode = new ListNode();
//            newNode.info = lis.info;
//            if (head == null) {
//                head = newNode;
//            } else {
//                ListNode tmp = head;
//                while (tmp.next != null) {
//                    tmp = tmp.next;
//                }
//                tmp.next = newNode;
//
//            }
//            lis = lis.next;
//        }
//        return head;
//    }
//
//    public static ListNode invert(ListNode lis) {
//        ListNode head = lis;
//        ListNode reverse = null;
//        ListNode tmp;
//
//        while (head != null) {
//            tmp = head.next;
//            head.next = reverse;
//            reverse = head;
//            head = tmp;
//        }
//        return reverse;
//    }
//
//    public static ListNode deleteDoubles(ListNode lis) {
//        ListNode node1 = lis;
//        while (node1 != null) {
//            ListNode node2 = node1;
//            while (node2.next != null) {
//                if (node1.info.equals(node2.next.info)) {
//                    node2.next = node2.next.next;
//                } else {
//                    node2 = node2.next;
//                }
//            }
//            node1 = node1.next;
//        }
//        return lis; //요소 옮기면서 체크
//    }
//
//    public static boolean searchSequence(ListNode lis1, ListNode lis2) {
//        ListNode tmp1 = lis1;
//        ListNode tmp2 = lis2;
//        boolean check = false;
//        while (tmp1 != null) {
//            if (tmp1.info.equals(tmp2.info)) {
//                check = true;
//            } else {
//                check = false;
//            }
//            if (check && (tmp2.next == null)) {
//                return true;
//            }
//            tmp1 = tmp1.next;
//            tmp2 = (!check) ? lis2 : tmp2.next;
//        }
//        return false;
//    }
//    public static void print(ListNode lis){
//        while(lis!=null){
//            System.out.println(lis.info);
//            lis = lis.next;
//        }
//    }
//}
//
//
//public class Exercise1 {
//    public static void main(String[] args) {
//        ListNode n1 = new ListNode();
//        ListNode n2 = new ListNode();
//        ListNode n3 = new ListNode();
//        ListNode n4 = new ListNode();
//        n1.info = "a";
//        n2.info = "a";
//        n3.info = "b";
//        n4.info = "a";
//        n1.next = n2;
//        n2.next = n3;
//        n3.next = n4;
//        ListNode.modify(n1, "a", "e");
//        ListNode.print(n1);
//    }
//}