

public class Node {
	int val;
	Node next;
	Node(int x) { val = x; }

	public void addtolast(int m)
	{
		Node temp = new Node(m);
		while(this.next != null)
		{
			this.next = this.next;
		}

		this.next = temp;
		
	}
	
	public void show() {
		while(this.next!=null) {
			System.out.print(this.val);
		}
	}
}
