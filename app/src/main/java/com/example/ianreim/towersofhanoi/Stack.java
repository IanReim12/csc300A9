package com.example.ianreim.towersofhanoi;

public class Stack
{
    private Node top;
    private int count;

    public Stack ()
    {
        this.top = null;
        this.count = 0;
    }

    public int getCount ()
    {
        return this.count;

    }

    public void push (int payload)
    {
        Node n = new Node (payload);
        n.setNextNode(this.top);
        this.top = n;
        this.count++;
    }

    public int pop()
    {
        Node nodeToReturn = this.top;
        this.top = this.top.getNextode();
        nodeToReturn.setNextNode(null);
        this.count--;
        return nodeToReturn.getPayload();

    }

    public int peek()
    {
        return this.top.getPayload();

    }

    public void display()
    {
        if (this.top == null)
        {
            System.out.println("Empty Stack");
        }
        else {
            Node currNode = this.top;
            do {
                System.out.println("*** " + currNode.getPayload());
                currNode = currNode.getNextode();

            }
            while (currNode != null);
        }
    }
}
