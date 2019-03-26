package edu.citadel.csci202.archive._01_29_2018;

public class IntNode {

    private int dataVal;         // Node data
    private IntNode nextNodePtr; // Reference to the next node

    public IntNode() {
        dataVal = 0;
        nextNodePtr = null;
    }

    // Constructor
    public IntNode(int dataInit) {
        this.dataVal = dataInit;
        this.nextNodePtr = null;
    }

    // Constructor
    public IntNode(int dataInit, IntNode nextLoc) {
        this.dataVal = dataInit;
        this.nextNodePtr = nextLoc;
    }

    /* Insert node after this node.
     Before: this -- next
     After:  this -- node -- next
     */
    public void insertAfter(IntNode nodeLoc) {
        IntNode tmpNext;

        tmpNext = this.nextNodePtr;
        this.nextNodePtr = nodeLoc;
        nodeLoc.nextNodePtr = tmpNext;
        return;
    }

    // Get location pointed by nextNodePtr
    public IntNode getNext() {
        return this.nextNodePtr;
    }

    public void printNodeData() {
        System.out.println(this.dataVal);
        return;
    }

}