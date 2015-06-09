/* DList1.java */

/**
 *  A DList1 is a mutable doubly-linked list.  (No sentinel, not
 *  circularly linked.)
 */

public class DList1 {

  /**
   *  head references the first node.
   *  tail references the last node.
   *
   *  DO NOT CHANGE THE FOLLOWING FIELD DECLARATIONS.
   */
  protected DListNode1 head;
  protected DListNode1 tail;  
  protected long size;

  /* DList1 invariants:
   *  1)  head.prev == null.
   *  2)  tail.next == null.
   *  3)  For any DListNode1 x in a DList, if x.next == y and x.next != null,
   *      then y.prev == x.
   *  4)  For any DListNode1 x in a DList, if x.prev == y and x.prev != null,
   *      then y.next == x.
   *  5)  The tail can be accessed from the head by a sequence of "next"
   *      references.
   *  6)  size is the number of DListNode1s that can be accessed from the
   *      head by a sequence of "next" references.
   */

  /**
   *  DList1() constructor for an empty DList1.
   */
  public DList1() {
    head = null;
    tail = null;
    size = 0;
  }

  /**
   *  DList1() constructor for a one-node DList1.
   */
  public DList1(int r, int g, int b, int rep) {
    head = new DListNode1(r, g, b, rep);
    tail = head;
    size = 1;
  }

  /**
   *  insertBack() inserts an item at the back of a DList1.
   */
  public void insertBack(int r, int g, int b, int rep) {
      if (size == 0) {
        head = new DListNode1(r, g, b, rep);
        tail = head;
        size = 1;
      } else {
        DListNode1 newend = new DListNode1(r,g,b,rep);
        tail.next = newend;
        newend.prev = tail;
        tail = newend;
        size += 1;
      }
    }

  }