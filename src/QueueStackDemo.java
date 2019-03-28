import java.util.LinkedList;

public class QueueStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		//Queue
		for(int i = 0;i<10;i++)ll.addLast(i);
		while(!ll.isEmpty())System.out.println(ll.removeFirst());
		
		System.out.println("=========================================");
		
		//Stack
		for(int i = 0;i<10;i++)ll.addLast(i);
		while(!ll.isEmpty())System.out.println(ll.removeLast());
	}

}
