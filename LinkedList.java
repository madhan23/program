package com.aig.gi.uw.noticeletter;

public class LinkedList<T> {

	class Node {
		private T value;
		private Node next;

		public Node(T value) {
			super();
			this.value = value;
		}

		@Override
		public String toString() {
			return "Node [value=" + value + ", next=" + next + "]";
		}

	}

	private Node head;

	public void insert(T data) {

		if (head == null) {
			head = new Node(data);
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = new Node(data);

		}
	}

	public void insert(int pos, T data) {
		if (pos > size()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		Node newNode = new Node(data);
		if (pos == 0) {
			insert(data);
		} else {
			Node temp = head;
			for (int i = 1; i < pos; i++) {

				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;

		}

	}

	public T delete(int pos) {
		T val = null;
		if (pos > size()) {
			throw new IndexOutOfBoundsException();
		}
		if (pos == 0) {
			Node temp = head.next;
			head = temp;
		} else {
			Node temp = head;
			for (int i = 1; i < pos; i++) {

				temp = temp.next;
			}
			val = temp.value;
			Node posTemp = temp.next;
			temp.next = posTemp.next;

		}

		return val;
	}

	public boolean deleteObject(T data) {
		boolean flag = false;
		Node currentNode = null;
		Node previousNode = null;
		int index = 0;
		Node temp = head;
		while (temp != null) {
			if (temp.value.equals(data)) {
				currentNode = temp.next;

				flag = true;
				break;
			}

			temp = temp.next;
			index++;
		}

		temp = head;
		if (index == 0) {
			delete(0);
			return true;
		} else {

			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
				previousNode = temp;
			}
		}

		if (flag) {

			previousNode.next = currentNode;
		}

		return flag;
	}

	public int size() {
		int length = 0;
		if (head == null)
			return length;
		else {
			Node cursor = head;

			while (cursor != null) {
				cursor = cursor.next;
				length++;
			}
		}
		return length;
	}

	public void display() {

		Node cursor = head;

		while (cursor != null) {

			System.out.print(cursor.value + "-->");
			cursor = cursor.next;

		}

		System.out.print(cursor);
	}
	
	public void reverse() { 
		
		Node prev =null;
		Node current = head;
		Node next = null;
		
		while(current!=null) {
			next  = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head =prev;
		
	}
}
