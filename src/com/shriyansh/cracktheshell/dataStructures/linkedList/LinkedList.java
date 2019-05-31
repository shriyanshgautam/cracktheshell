package com.shriyansh.cracktheshell.dataStructures.linkedList;

public class LinkedList {
    private LinkedListNode head;

    public void addNode(int data) {
        if (head == null) {
            head = new LinkedListNode(data);
        } else {
            LinkedListNode last = getLastNode(head);
            last.setNext(new LinkedListNode(data));
        }
    }

    public void deleteNode(int data) {
        if (head == null) return;
        /*
         * Explicitly updated head if it has the data.
         */
        if (head.getData() == data) {
            head = head.getNext();
            return;
        }
        LinkedListNode before = getNodeBefore(head, data);
        LinkedListNode after = getNodeAfter(head, data);
        before.setNext(after);
    }

    public void print() {
        if (head == null) return;
        LinkedListNode current = head;
        while(current.getNext() != null) {
            System.out.println(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println(current.getData() + " ");
    }

    public int size() {
        if (head == null) return 0;
        LinkedListNode current = head;
        int size = 1;
        while(current.getNext() != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

    private LinkedListNode getLastNode(LinkedListNode head) {
        LinkedListNode current = head;
        /*
         * Do not check for current != null as after loop end will have current as null.
         * Stop before it becomes null i.e. current.next == null. So check current.next != null
         */
        while(current.getNext() != null) {
            current = current.getNext();
        }
        return current;
    }

    private LinkedListNode getNodeBefore(LinkedListNode head, int data) {
        LinkedListNode current = head;
        while(current.getNext() != null) {
            if (current.getNext().getData() == data) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    private LinkedListNode getNodeAfter(LinkedListNode head, int data) {
        LinkedListNode current = head;
        while(current != null) {
            if (current.getData() == data) {
                return current.getNext();
            }
            current = current.getNext();
        }
        return null;
    }

    public LinkedListNode getNthNode(int index) {
        if (head == null) return null;
        LinkedListNode current = head;
        int position = 1;
        while (current.getNext() != null) {
            if (position < index) {
                position++;
                current = current.getNext();
            } else {
                return current;
            }
        }
        return null;
    }

    public LinkedListNode getNodeWithData(int data) {
        if (head == null) return null;
        LinkedListNode current = head;
        while(current.getNext() != null) {
            if (current.getData() == data) return current;
            current = current.getNext();
        }
        return null;
    }

    public LinkedListNode getNthFromLast(int index) {
        LinkedListNode prev = head;
        LinkedListNode current = head;
        int offset = 0;
        while (current.getNext() != null){
            if (offset < index) {
                offset++;
            } else {
                prev = prev.getNext();
            }
            current = current.getNext();
        }
        return prev;
    }

    public LinkedListNode getMiddle() {
        LinkedListNode slow = head;
        LinkedListNode fast = head;
        while (fast.getNext() != null && fast.getNext().getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return slow;
    }

    public void createCycleAt(int data) {
        LinkedListNode last = getLastNode(head);
        LinkedListNode current = getNodeWithData(data);
        last.setNext(current);
    }

    public boolean detectCycle() {
        LinkedListNode prev = head;
        LinkedListNode current = head;
        if (current.getNext() != null) {
            current = current.getNext();
        } else {
            return false;
        }
        while (current.getNext() != null && current.getNext().getNext() !=null) {
            if (current == prev) {
                System.out.println(current.getData());
                return true;
            }
            current = current.getNext().getNext();
            prev = prev.getNext();
        }
        return false;
    }
}
