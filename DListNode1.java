/* DListNode1.java */

/**
 *  A DListNode1 is a node in a DList1 (doubly-linked list).
 */

public class DListNode1 {
  public int red;
  public int green;
  public int blue;
  public int repeats;
  public DListNode1 prev;
  public DListNode1 next;

  /**
   *  DListNode1() constructor.
   */
  DListNode1() {
    red = 0;
    green = 0;
    blue = 0;
    repeats = 1;
    prev = null;
    next = null;
  }

    DListNode1(int r,int g, int b, int rep) {
    red = r;
    green = g;
    blue = b;
    repeats = rep;
    prev = null;
    next = null;
  }
}
