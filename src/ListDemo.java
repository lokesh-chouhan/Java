import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Linkedlist l = new Linkedlist();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<String> names = new ArrayList<String>( Arrays.asList("alex", "brian", "charles") );
		
		l.addNode(3);
		l.addNode(5);
		l.addNode(2);
		l.addNode(7);
		l.addNode(1);
		//l.showList();
		
		ll.add(5);
		ll.add(0, 3);
		ll.get(1);
		ll.addFirst(1);
		ll.addLast(7);
		ll.contains(3);
		ll.removeFirst();
		ll.removeLast();		
		ll.set(1, 2);
		ll.size();
		
		//=====================
		
		al.add(6);
		al.add(0,4);
		al.set(1, 5);
		al.get(1);
		al.contains(2);
		al.remove(0);
		al.size();
		
		Iterator it = ll.listIterator();
		Iterator at = al.listIterator();
		
		while(it.hasNext())System.out.println(it.next());
		System.out.println("---------------------------");
		while(at.hasNext())System.out.println(at.next());

	}

}
