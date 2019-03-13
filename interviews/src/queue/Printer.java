package queue;

public class Printer {

	int capacity = 5;
	int queue[] = new int[capacity];
	int front = 0;
	int rear = 0;

	void insert(int x) {
		if (capacity == rear) {
			System.out.println("Queue is full");
		} else {
			queue[rear] = x;
			rear = rear + 1;
		}
	}

	void delete() {
		if (front == rear) {
			System.out.println("Queue is empty");
		} else {
			System.out.println("Deleted item is : " + queue[front]);
			for (int i = 0; i < rear - 1; i++) {
				queue[i] = queue[i + 1];
			}
			rear = rear - 1;
		}
	}

	void traverse() {
		if (front == rear) {
			System.out.println("Queue is empty");
		} else {
			System.out.println("The available element(s) are: ");

			for (int i = front; i < rear; i++) {
				System.out.println(queue[i]);
			}
		}
	}

}
