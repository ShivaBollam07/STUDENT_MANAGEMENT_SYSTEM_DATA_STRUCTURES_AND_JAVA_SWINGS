package com.mycompany.student_management_system;


/*
 * for queue data structure we will use singly linked list
 * */
public class Queue<T>
{
    private node front = null ;
    private node rear = null ;
    private int size = 0 ;
    class node
    {
        T data ;
        node next ;

        public node(T data)
        {
            this.data = data ;
            this.next = null ;
        }
    }
    public void Enqueue(T key)
    {
        node n = new node(key) ;
        if(front==null && rear==null )
        {
            front = n ;
            rear = n ;
            size++ ;
        }
        else
        {

            rear.next = n ;
            rear = n ;
            size++ ;
        }
    }
    public T Dequeue()
    {
        T key = front.data ;
        front =  front.next;
        size-- ;
        if(size==0)
        {
            front = null ;
            rear = null ;
        }
        return key ;
    }
    public boolean isEmpty()
    {
        if(front==null && rear==null) return true ;
        else return false ;
    }
    public T peek()
    {
        return front.data;
    }
    public void clear()
    {
        front = null ;
        rear = null ;
        size = 0 ;
    }
    public int size()
    {
        return size ;
    }
    public void traversal()
    {
        node frontt = front ;
        while(frontt!=null)
        {
            System.out.println(frontt.data);
            frontt = frontt.next ;
        }
    }
}

