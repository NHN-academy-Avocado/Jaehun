class ListNode {
    String info;
    ListNode next;

    public static int length(ListNode lis) {
        if (lis == null) {
            return 0;
        } else {
            return 1 + length(lis.next);
        }
    }

    public static void print(ListNode lis) {
        while (lis != null) {
            System.out.println(lis.info);
            lis = lis.next;
        }
    }

    public static ListNode insertAfter(ListNode lis, String s, String given) {
        if (lis == null) {
            return null;
        } else if (lis.info.equals(given)) {
            ListNode p = new ListNode();
            p.info = s;
            p.next = lis.next;
            lis.next = p;
        } else {
            lis.next = insertAfter(lis.next, s, given);
        }
        return lis;
    }

    public static ListNode modify(ListNode lis, String old, String ne) {
        if (lis == null) {
            return null;
        } else if (lis.info.equals(old)) {
            lis.info = ne;
        } else {
            lis.next = modify(lis.next, old, ne);
        }
        return lis;
    }

    public static ListNode modifyAll(ListNode lis, String old, String ne) {
        if (lis == null) {
            return null;
        } else if (lis.info.equals(old)) {
            lis.info = ne;
        }
        lis.next = modifyAll(lis.next, old, ne);
        return lis;
    }

    public static ListNode insertBefore(ListNode lis, String s, String given) {
        if (lis == null) {
            return null;
        } else if (lis.info.equals(given)) {
            ListNode n = new ListNode();
            n.info = s;
            n.next = lis.next;
            return n;
        } else {
            lis.next = insertBefore(lis.next, s, given);
        }
        return lis;
    }

    public static ListNode copy(ListNode lis) {
        if (lis == null) {
            return null;
        } else {
            ListNode n = new ListNode();
            n.info = lis.info;
            n.next = copy(lis.next);
            return n;
        }
    }

    public static ListNode invert(ListNode lis) {
        if (lis == null || lis.next == null) {
            return lis;
        }
        ListNode reverse = invert(lis.next);

        lis.next.next = lis;
        lis.next = null;
        return reverse;
    }

    //    public static ListNode deleteDoubles(ListNode lis) {
//        if (lis == null || lis.next == null) {
//            return null;
//        }
//        ListNode tmp = lis;
//        while (tmp != null) {
//            if (lis.info.equals(tmp.next.info)) {
//                tmp.next = tmp.next.next;
//            }
//            tmp = tmp.next;
//        }
//        deleteDoubles(lis.next);
//        return lis;
//    }
    public static ListNode deleteDoubles(ListNode lis) {
        if (lis == null || lis.next == null) {
            return null;
        } else {
            deleteDoubles(lis, lis.info);
            deleteDoubles(lis.next);
        }
        return lis;
    }

    public static ListNode deleteDoubles(ListNode lis, String s) {
        if (lis == null || lis.next == null) {
            return null;
        } else {
            if (lis.next.info.equals(s)) {
                lis.next = lis.next.next;
            }
            return deleteDoubles(lis.next, s);
        }
    }


    public static boolean searchSequence(ListNode lis1, ListNode lis2) {
        if (lis2 == null) {
            return false;
        } else if (lis1.info.equals(lis2.info)) {
            if (lis2.next == null) {
                return true;
            } else {
                return searchSequence(lis1.next, lis2.next);
            }
        }
        return searchSequence(lis1.next, lis2);
    }
}


public class Exercise2 {
    public static void main(String[] args) {
        ListNode n1 = new ListNode();
        ListNode n2 = new ListNode();
        ListNode n3 = new ListNode();
        ListNode n4 = new ListNode();
        ListNode n5 = new ListNode();
        ListNode n6 = new ListNode();
        n1.info = "a";
        n2.info = "b";
        n3.info = "c";
        n4.info = "d";

        n5.info = "b";
        n6.info = "c";

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n5.next = n6;

        System.out.println(ListNode.searchSequence(n1, n5));
    }
}