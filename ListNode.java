class ListNode {
    int value;
    private ListNode next;

    private ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    public ListNode next() {
        return this.next;
    }

    private static ListNode TheNNodeFromEnd(ListNode head, int number_from_end) {
        int size = 0;
        ListNode node = head;
        while (node != null) {
            size++;
            node = node.next;
        }
        node = head;
        for (int i = 0; i < size - number_from_end; i++) {
            node = node.next;
        }
        return node;
    }

    public static void main(String[] args) {
        int number_from_end = 7;
        ListNode NodeN;
        ListNode node20 = new ListNode(20, null);
        ListNode node19 = new ListNode(19, node20);
        ListNode node18 = new ListNode(18, node19);
        ListNode node17 = new ListNode(17, node18);
        ListNode node16 = new ListNode(16, node17);
        ListNode node15 = new ListNode(15, node16);
        ListNode node14 = new ListNode(14, node15);
        ListNode node13 = new ListNode(13, node14);
        ListNode node12 = new ListNode(12, node13);
        ListNode node11 = new ListNode(11, node12);
        ListNode node10 = new ListNode(10, node11);
        ListNode node9 = new ListNode(9, node10);
        ListNode node8 = new ListNode(8, node9);
        ListNode node7 = new ListNode(7, node8);
        ListNode node6 = new ListNode(6, node7);
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        NodeN = TheNNodeFromEnd(node1, number_from_end);
        System.out.println("For the number from end= " + number_from_end);
        System.out.println("Value= " + NodeN.value);
    }
}

