
class Add_two {
  public Node addTwoNumbers(Node l1, Node l2) {
    Node temp = new Node(0);
    Node p = l1, q = l2, curr = temp;
    int carry = 0;
    while (p != null || q != null) {
        int x = (p != null) ? p.val : 0;
        int y = (q != null) ? q.val : 0;
        int sum = carry + x + y;
        carry = sum / 10;
        curr.next = new Node(sum % 10);
        curr = curr.next;
        if (p != null) p = p.next;
        if (q != null) q = q.next;
    }
    if (carry > 0) {
        curr.next = new Node(carry);
    }
    return temp.next;
}
}