package com.aig.gi.uw.noticeletter;

import java.util.EmptyStackException;

public class Stack<T> {

	class Node {
		public Node(T val) {
			this.val = val;
		}

		private T val;
		private Node next;

	}

	public Node top = null;
	int size = 0;

	public boolean isEmpty() {
		if (top == null)
			return true;
		else
			return false;
	}

	public void push(T val) {
		Node oldNode = top;
		top = new Node(val);
		top.next = oldNode;
		size++;
	}

	public T pop() {

		if (size < 0) {
			throw new EmptyStackException();
		}
		T val = top.val;
		top = top.next;
		size--;
		return val;
	}

	public T peek() {

		if (size < 0) {
			throw new EmptyStackException();
		}

		return top.val;
	}

	public boolean contains(Integer val) {

		if (size < 0) {
			throw new EmptyStackException();
		}
		Node node = top;
		while (node.next != null) {
			if (node.val.equals(val))
				return true;

			node = node.next;
		}
		return false;
	}

	public void display() {
		Node node = top;
		while (node.next != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}

}
