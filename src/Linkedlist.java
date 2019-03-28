
public class Linkedlist {
	
	Node start = null;
	Node end = null;
	
	public void addNode(int data) 
	{
		Node temp = new Node(data, null);
		
		if(end == null) 
		{
			start = temp;
			end = temp;
		}
		else 
		{
			end.setNext(temp);
			end = temp;
		}
	}
	
	public void delNode(int data) 
	{
		Node temp = start;
		
		
	}
	
	public void showList() 
	{
		Node temp = start;
		while(temp != null) 
		{
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}

}
