package com.aig.gi.uw.noticeletter;

public class LinkedListMain {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();
		list.insert(10);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		list.insert(60);

		list.insert(2, 7);
		list.display();
		System.out.println();

		System.out.println(list.deleteObject(60));
		list.display();
		list.reverse();
		System.out.println();
		list.display();
	}

}
