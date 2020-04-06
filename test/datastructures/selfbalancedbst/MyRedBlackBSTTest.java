package datastructures.selfbalancedbst;

import static org.junit.Assert.assertEquals;

import datastructures.selfbalancedbst.MyColorNode.Color;
import org.junit.Test;

public class MyRedBlackBSTTest {

    @Test
    public void testAdd() {
        MyRedBlackBST myTree = new MyRedBlackBST();
        myTree.add(8);
        myTree.add(10);
        myTree.add(6);
        myTree.add(2);
        myTree.add(5);
        myTree.add(7);
        myTree.add(9);
        myTree.add(3);

        assertEquals(8, myTree.getSize());
    }

    @Test
    public void testToString() {
        MyRedBlackBST myTree = new MyRedBlackBST();

        myTree.add(8);
        myTree.add(6);
        myTree.add(10);
        myTree.add(9);
        myTree.add(3);
        myTree.add(7);
        myTree.add(2);
        myTree.add(4);

        assertEquals("[234678910]", myTree.toString());
    }

    @Test
    public void numberOfBlackNodes() {
        MyRedBlackBST myTree = new MyRedBlackBST();
        myTree.add(8);
        myTree.add(6);
        myTree.add(10);
        myTree.add(9);
        myTree.add(3);
        myTree.add(7);
        myTree.add(2);
        myTree.add(4);
        myTree.add(11);
        myTree.add(20);
        myTree.add(15);
        myTree.add(30);
        myTree.add(1);
        myTree.add(25);
        myTree.add(27);
        myTree.add(31);
        myTree.add(32);
        myTree.add(33);
        myTree.add(34);
        myTree.add(35);
        myTree.add(36);
        myTree.add(37);
        myTree.add(38);
        myTree.add(39);

        MyColorNode root = myTree.getRoot();

        int leftCount = 1;
        MyColorNode aux = root;
        while (aux.getLeft() != null) {
            if (aux.getColor().equals(Color.BLACK)) {
                leftCount++;
            }
            aux = aux.getLeft();
        }

        int rightCount = 1;
        aux = root;
        while (aux.getRight() != null) {
            if (aux.getColor().equals(Color.BLACK)) {
                rightCount++;
            }
            aux = aux.getRight();
        }

        assertEquals(leftCount, rightCount);
    }
}
