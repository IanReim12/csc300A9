package com.example.ianreim.towersofhanoi;

public class Node
{
    private int payload;
    private Node nextode;

    public Node (int paylaod)
    {
        this.payload = paylaod;
        this.nextode = null;
    }


    public void setNextNode(Node nextode) {
        this.nextode = nextode;
    }

    public int getPayload()
    {
        return payload;

    }

    public Node getNextode ()
    {
        return nextode;
    }
}
