package com.aig.gi.uw.noticeletter;

import java.util.Arrays;

public class StackMain {

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(120);
		s.push(30);
		s.push(4);
		s.push(350);

		System.out.println(s.pop());

		System.out.println(s.peek());

		System.out.println(s.contains(120));
		System.out.println(s.contains(20));
		s.display();

		Queue<Integer> queue = new Queue<>();
		queue.enQueue(10);
		queue.enQueue(20);

		System.out.println(queue.size());
		System.out.println(Arrays.toString(queue.display()));
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(Arrays.toString(queue.display()));
		System.out.println(queue.IsEmpty());

	}

}
