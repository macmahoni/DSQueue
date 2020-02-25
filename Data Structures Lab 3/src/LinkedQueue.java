//Richney Chin-Chap & Isabella MacMahon
public class LinkedQueue <T> implements QueueInterface <T>{
	public Node<T> backNode;
	public Node<T> frontNode;
	

@SuppressWarnings("hiding")
private class Node <T>{
	
	private T data;
	private Node <T> next;

	public Node (T data) {
		this.data = data;
		next = null;
	}
	
	public T getData() {
		return data;
	}
	
	public Node <T> getNext(){
		return next;
	}
	
	public void  setData(T data) {
		this.data = data;
	}
	

	public void setNext(Node<T> backNode) {
		next = backNode;
		
	}
}

	int size = 0;
	public LinkedQueue() {
		backNode = null;
		frontNode = null;
	}
	
	@SuppressWarnings("unchecked")
	public void enqueue (T newEntry){
	       @SuppressWarnings({ "unchecked", "rawtypes" })
		Node newNode = new Node (newEntry);
	       if (isEmpty()) 
	           frontNode = newNode;     
	       else
	           backNode.setNext(newNode);
	       backNode = newNode;   
	       size++;
	   }

		
	   public T dequeue (){
	        if (isEmpty())
	            throw new EmptyQueueException();
	        T front = frontNode.getData();
	        frontNode = frontNode.getNext();
	        if (frontNode == null) 
	            backNode = null;
	        size--;
	        return front;
	    }
	   
	   public T getFront(){
	        if (isEmpty())
	            throw new EmptyQueueException();
	        return frontNode.getData();  
	    }
	   
	   public boolean isEmpty() {
		   if (frontNode == null && backNode == null) {
	            return true;
	        }
	        return false;
	    }
	   
	   public void clear () {
		   while(!isEmpty()) {
			   dequeue();
		   }
	   }
	   
	   public int size() {
		   return size;
	   }

}
