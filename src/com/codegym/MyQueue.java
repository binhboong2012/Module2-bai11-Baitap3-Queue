package com.codegym;

public class MyQueue <T>{
    public Node<T> head;
    public Node<T> tail;

    public MyQueue() {
        head = tail = null;
    }
}
