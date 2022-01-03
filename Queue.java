package com.aig.gi.uw.noticeletter;

public class Queue<T> {

	class Node {
		private T data;
		private Node next;

		public Node(T data) {
			this.data = data;
		}

	}

	private Node front;
	private Node rear;
	private int length;

	public void enQueue(T data) {
		if (front == null) {
			rear = new Node(data);
			front = rear;
		} else {

			rear.next = new Node(data);
			rear = rear.next;
		}

		length++;
	}

	public T dequeue() {
		if (front != null) {
			T data = front.data;
			front = front.next;
			length--;
			return data;
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public T[] display() {

		T[] array = (T[]) new Object[length];
		int index = 0;
		Node cursor = front;

		while (cursor != null) {
			array[index] = (T) cursor.data;
			cursor = cursor.next;
			index++;
		}

		return array;
	}

	public int size() {
		return this.length;
	}

	public boolean IsEmpty() {
		if (length == 0)
			return true;
		else
			return false;

	}
}
