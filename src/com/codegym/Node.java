package com.codegym;

public class Node<T> {
    Node<T> next;
    T data;

    public Node(T data) {
        this.data = data;
    }
}
