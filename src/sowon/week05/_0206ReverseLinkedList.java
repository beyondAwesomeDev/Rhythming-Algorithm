package sowon.week05;

public class _0206ReverseLinkedList {
  public static ListNode reverseList(ListNode head) {
    // https://www.youtube.com/watch?v=jXArj8RBq0Q&feature=emb_logo
    if (head == null || head.next == null) {
      return head;
    }
    ListNode cur = head.next;
    head.next = null;
    while(cur != null){
      ListNode next = cur.next;
      cur.next = head;
      head = cur;
      cur = next;
    }
    return head;
  }
}
class ListNode {
  int val;
  ListNode next;
  ListNode() {
      //공백을 나타내기 위해서 -1로 정의
      this.val = -1;
  }
  ListNode(int val) {
      this.val = val;
  }
  ListNode(int val, ListNode next) {
      this.val = val; this.next = next;
  }
  @Override
  public String toString() {
      //return "ListNode{" + "val=" + val +", next=" + next + '}';
      if(next == null) return val +"";
      return val +","+ next;
  }
}
