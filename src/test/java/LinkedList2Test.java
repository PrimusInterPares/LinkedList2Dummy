import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LinkedList2DummyTest {

    @Disabled
    @Test
    void print() {
        LinkedList2Dummy List = new LinkedList2Dummy();
        Node node1 = new Node(1);
        List.addInTail(node1);
        Node node2 = new Node(2);
        List.addInTail(node2);
        Node node3 = new Node(3);
        List.addInTail(node3);
        Node node4 = new Node(4);
        List.addInTail(node4);

        List.print(List.dummyHead, List.dummyTail);
    }

    @Test
    void addInTail1() {
        LinkedList2Dummy List = new LinkedList2Dummy();
        Node node1 = new Node(1);
        List.addInTail(node1);

        assertEquals(1, List.dummyTail.prev.value);
    }

    @Test
    void find1() {
        LinkedList2Dummy List = new LinkedList2Dummy();
        Node node1 = new Node(1);
        List.addInTail(node1);
        Node node2 = new Node(2);
        List.addInTail(node2);
        Node node3 = new Node(3);
        List.addInTail(node3);
        Node node4 = new Node(4);
        List.addInTail(node4);

        assertNull(List.find(5));
    }

    @Test
    void find2() {
        LinkedList2Dummy List = new LinkedList2Dummy();
        Node node1 = new Node(1);
        List.addInTail(node1);
        Node node2 = new Node(2);
        List.addInTail(node2);
        Node node3 = new Node(3);
        List.addInTail(node3);
        Node node4 = new Node(4);
        List.addInTail(node4);

        assertEquals(node3, List.find(3));
    }

    @Test
    void findAll1() {
        LinkedList2Dummy List = new LinkedList2Dummy();
        Node node1 = new Node(1);
        List.addInTail(node1);
        Node node2 = new Node(4);
        List.addInTail(node2);
        Node node3 = new Node(3);
        List.addInTail(node3);
        Node node4 = new Node(4);
        List.addInTail(node4);
        Node node5 = new Node(5);
        List.addInTail(node5);
        Node node6 = new Node(4);
        List.addInTail(node6);
        Node node7 = new Node(7);
        List.addInTail(node7);
        Node node8 = new Node(4);
        List.addInTail(node8);

        ArrayList<Node> nodes = new ArrayList<>();
        nodes.add(node2);
        nodes.add(node4);
        nodes.add(node6);
        nodes.add(node8);

        assertEquals(nodes, List.findAll(4));
    }

    @Test
    void findAll2() {
        LinkedList2Dummy List = new LinkedList2Dummy();

        ArrayList<Node> nodes = new ArrayList<>();

        assertEquals(nodes, List.findAll(4));
    }

    @Test
    void findAll3() {
        LinkedList2Dummy List = new LinkedList2Dummy();
        Node node1 = new Node(1);
        List.addInTail(node1);
        Node node2 = new Node(4);
        List.addInTail(node2);
        Node node3 = new Node(3);
        List.addInTail(node3);
        Node node4 = new Node(4);
        List.addInTail(node4);
        Node node5 = new Node(5);
        List.addInTail(node5);
        Node node6 = new Node(4);
        List.addInTail(node6);
        Node node7 = new Node(7);
        List.addInTail(node7);
        Node node8 = new Node(4);
        List.addInTail(node8);

        ArrayList<Node> nodes = new ArrayList<>();

        assertEquals(nodes, List.findAll(100));
    }

    @Test
    void remove1() {
        LinkedList2Dummy List = new LinkedList2Dummy();
        Node node1 = new Node(1);
        List.addInTail(node1);
        Node node2 = new Node(2);
        List.addInTail(node2);
        Node node3 = new Node(3);
        List.addInTail(node3);
        Node node4 = new Node(4);
        List.addInTail(node4);

        /*Node node = List.dummyHead;
        System.out.println("head:" + node);
        while (node != null) {
            System.out.println("Node:" + node+ " value:" + node.value + " next:" + node.next);
            node = node.next;
        }
        System.out.println("tail:" + List.dummyTail);*/

        assertTrue(List.remove(3));
        assertEquals(3, List.count());
    }

    @Test
    void remove2() {
        LinkedList2Dummy List = new LinkedList2Dummy();
        Node node1 = new Node(1);
        List.addInTail(node1);
        Node node2 = new Node(2);
        List.addInTail(node2);

        assertFalse(List.remove(3));
        assertEquals(2, List.count());
    }

    @Test
    void remove3() {
        LinkedList2Dummy List = new LinkedList2Dummy();
        Node node1 = new Node(3);
        List.addInTail(node1);

        assertTrue(List.remove(3));
        assertEquals(0, List.count());
    }

    @Test
    void remove4() {
        LinkedList2Dummy List = new LinkedList2Dummy();

        assertFalse(List.remove(3));
        assertEquals(0, List.count());
    }

    @Test
    void removeAll1() {
        LinkedList2Dummy List = new LinkedList2Dummy();
        Node node1 = new Node(1);
        List.addInTail(node1);
        Node node2 = new Node(4);
        List.addInTail(node2);
        Node node3 = new Node(4);
        List.addInTail(node3);
        Node node4 = new Node(4);
        List.addInTail(node4);
        Node node5 = new Node(4);
        List.addInTail(node5);
        Node node6 = new Node(4);
        List.addInTail(node6);
        Node node7 = new Node(4);
        List.addInTail(node7);
        Node node8 = new Node(4);
        List.addInTail(node8);

        List.removeAll(4);

        assertEquals(1, List.count());
    }

    @Test
    void removeAll2() {
        LinkedList2Dummy List = new LinkedList2Dummy();
        Node node1 = new Node(1);
        List.addInTail(node1);
        Node node2 = new Node(2);
        List.addInTail(node2);
        Node node3 = new Node(3);
        List.addInTail(node3);
        Node node4 = new Node(4);
        List.addInTail(node4);
        Node node5 = new Node(4);
        List.addInTail(node5);
        Node node6 = new Node(5);
        List.addInTail(node6);
        Node node7 = new Node(6);
        List.addInTail(node7);
        Node node8 = new Node(4);
        List.addInTail(node8);

        List.removeAll(4);

        assertEquals(5, List.count());
    }

    @Test
    void removeAll3() {
        LinkedList2Dummy List = new LinkedList2Dummy();
        Node node1 = new Node(1);
        List.addInTail(node1);
        Node node2 = new Node(2);
        List.addInTail(node2);
        Node node3 = new Node(3);
        List.addInTail(node3);
        Node node4 = new Node(4);
        List.addInTail(node4);
        Node node5 = new Node(4);
        List.addInTail(node5);
        Node node6 = new Node(5);
        List.addInTail(node6);
        Node node7 = new Node(6);
        List.addInTail(node7);
        Node node8 = new Node(7);
        List.addInTail(node8);

        List.removeAll(4);

        assertEquals(6, List.count());
    }

    @Test
    void removeAll4() {
        LinkedList2Dummy List = new LinkedList2Dummy();
        Node node1 = new Node(4);
        List.addInTail(node1);
        Node node2 = new Node(4);
        List.addInTail(node2);

        List.removeAll(4);

        assertEquals(0, List.count());
    }

    @Test
    void removeAll5() {
        LinkedList2Dummy List = new LinkedList2Dummy();
        Node node1 = new Node(1);
        List.addInTail(node1);
        Node node2 = new Node(2);
        List.addInTail(node2);

        List.removeAll(4);

        assertEquals(2, List.count());
    }

    @Test
    void removeAll6() {
        LinkedList2Dummy List = new LinkedList2Dummy();
        Node node1 = new Node(1);
        List.addInTail(node1);

        List.removeAll(4);

        assertEquals(1, List.count());
    }

    @Test
    void removeAll7() {
        LinkedList2Dummy List = new LinkedList2Dummy();
        Node node1 = new Node(4);
        List.addInTail(node1);

        List.removeAll(4);

        assertEquals(0, List.count());
    }

    @Test
    void removeAll8() {
        LinkedList2Dummy List = new LinkedList2Dummy();

        List.removeAll(4);

        assertEquals(0, List.count());
    }

    @Test
    void clear() {
        LinkedList2Dummy List = new LinkedList2Dummy();
        Node node1 = new Node(1);
        List.addInTail(node1);
        Node node2 = new Node(4);
        List.addInTail(node2);
        Node node3 = new Node(3);
        List.addInTail(node3);
        Node node4 = new Node(4);
        List.addInTail(node4);
        Node node5 = new Node(5);
        List.addInTail(node5);
        Node node6 = new Node(4);
        List.addInTail(node6);
        Node node7 = new Node(7);
        List.addInTail(node7);
        Node node8 = new Node(4);
        List.addInTail(node8);
        assertEquals(8, List.count());

        List.clear();
        assertEquals(0, List.count());
    }

    @Test
    void count() {
        LinkedList2Dummy List = new LinkedList2Dummy();
        Node node1 = new Node(1);
        List.addInTail(node1);
        Node node2 = new Node(4);
        List.addInTail(node2);
        Node node3 = new Node(3);
        List.addInTail(node3);
        Node node4 = new Node(4);
        List.addInTail(node4);
        Node node5 = new Node(5);
        List.addInTail(node5);
        Node node6 = new Node(4);
        List.addInTail(node6);
        Node node7 = new Node(7);
        List.addInTail(node7);
        Node node8 = new Node(4);
        List.addInTail(node8);

        assertEquals(8, List.count());
    }

    @Test
    void countEmpty() {
        LinkedList2Dummy List = new LinkedList2Dummy();

        assertEquals(0, List.count());
    }

    @Test
    void insertAfterEmptyList() {
        LinkedList2Dummy List = new LinkedList2Dummy();
        assertEquals(0, List.count());

        /*Node node = List.dummyHead;
        System.out.println("head:" + node);
        while (node != null) {
            System.out.println("Node:" + node+ " value:" + node.value + " next:" + node.next);
            node = node.next;
        }
        System.out.println("tail:" + List.dummyTail);*/

        Node _nodeToInsert = new Node(10);
        List.insertAfter(null, _nodeToInsert);

        /*node = List.dummyHead;
        System.out.println("head:" + node);
        while (node != null) {
            System.out.println("Node:" + node+ " value:" + node.value + " next:" + node.next);
            node = node.next;
        }
        System.out.println("tail:" + List.dummyTail);*/

        assertEquals(1, List.count());
    }

    @Test
    void insertAfterToHead() {
        LinkedList2Dummy List = new LinkedList2Dummy();
        Node node1 = new Node(1);
        List.addInTail(node1);
        Node node2 = new Node(2);
        List.addInTail(node2);
        Node node3 = new Node(3);
        List.addInTail(node3);
        Node node4 = new Node(4);
        List.addInTail(node4);
        assertEquals(4, List.count());

        /*Node node = List.dummyHead;
        System.out.println("head:" + node);
        while (node != null) {
            System.out.println("Node:" + node+ " value:" + node.value + " next:" + node.next);
            node = node.next;
        }
        System.out.println("tail:" + List.dummyTail);*/

        Node _nodeToInsert = new Node(10);
        List.insertAfter(null, _nodeToInsert);

        /*node = List.dummyHead;
        System.out.println("head:" + node);
        while (node != null) {
            System.out.println("Node:" + node+ " value:" + node.value + " next:" + node.next);
            node = node.next;
        }
        System.out.println("tail:" + List.dummyTail);*/

        assertEquals(5, List.count());
    }

    @Test
    void insertAfterTail() {
        LinkedList2Dummy List = new LinkedList2Dummy();
        Node node1 = new Node(1);
        List.addInTail(node1);
        Node node2 = new Node(2);
        List.addInTail(node2);
        Node node3 = new Node(3);
        List.addInTail(node3);
        Node node4 = new Node(4);
        List.addInTail(node4);
        assertEquals(4, List.count());

        /*Node node = List.dummyHead;
        System.out.println("head:" + node);
        while (node != null) {
            System.out.println("Node:" + node+ " value:" + node.value + " next:" + node.next);
            node = node.next;
        }
        System.out.println("tail:" + List.dummyTail);*/

        Node _nodeToInsert = new Node(10);
        List.insertAfter(node4, _nodeToInsert);

        /*node = List.dummyHead;
        System.out.println("head:" + node);
        while (node != null) {
            System.out.println("Node:" + node+ " value:" + node.value + " next:" + node.next);
            node = node.next;
        }
        System.out.println("tail:" + List.dummyTail);*/

        assertEquals(5, List.count());
    }

    @Test
    void insertAfter() {
        LinkedList2Dummy List = new LinkedList2Dummy();
        Node node1 = new Node(1);
        List.addInTail(node1);
        Node node2 = new Node(2);
        List.addInTail(node2);
        Node node3 = new Node(3);
        List.addInTail(node3);
        Node node4 = new Node(4);
        List.addInTail(node4);
        assertEquals(4, List.count());

        /*Node node = List.dummyHead;
        System.out.println("head:" + node);
        while (node != null) {
            System.out.println("Node:" + node+ " value:" + node.value + " next:" + node.next);
            node = node.next;
        }
        System.out.println("tail:" + List.dummyTail);*/

        Node _nodeToInsert = new Node(10);
        List.insertAfter(node2, _nodeToInsert);

        /*node = List.dummyHead;
        System.out.println("head:" + node);
        while (node != null) {
            System.out.println("Node:" + node+ " value:" + node.value + " next:" + node.next);
            node = node.next;
        }
        System.out.println("tail:" + List.dummyTail);*/

        assertEquals(5, List.count());
    }
}