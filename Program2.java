//Efficient Implementation of Queue using Cicular Arrays all operations in O(1) time.
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Queue q =  new Queue(6);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		
		//printing queue using for loop
		for(int i=q.front;i<=q.rear;i++)
		{
		    System.out.println(q.arr[i]);
		}
		System.out.println(Arrays.toString(q.arr));
		System.out.println("front = "+q.getFront());
		System.out.println("rear = "+q.getRear());
		System.out.println("size = "+q.size);
		System.out.println("-------------------------------");
		q.dequeue();
		for(int i=q.front;i<=q.rear;i++)
		{
		    System.out.println(q.arr[i]);
		}
		System.out.println(Arrays.toString(q.arr));
		System.out.println("front = "+q.getFront());
		System.out.println("rear = "+q.getRear());
        System.out.println("size = "+q.size);
	}
}
class Queue
{
    int front,size,cap,rear;
    // front and rear are two references of the Queue array starting at zero.
    int [] arr;
    Queue(int x)
    {
        cap = x;
        front = 0;
        size = 0;
        arr = new int [cap];
    }
    
    boolean isFull()
    {
        return (cap == size);
    }
    
    boolean isEmpty()
    {
        return (size == 0);
    }
    
    int getFront()
    {
        if(isEmpty())
        {
            return -1;
        }
        return front;
    }
    
    int getRear()
    {
        if(isEmpty())
        {
            return -1;
        }
        return (front+size - 1)%cap;
        
    }
    
    void enqueue(int x)
    {
        if(isFull())
        {
            return;
        }
        rear = getRear();
        rear = (rear+1)%cap;
        arr[rear] = x;
        size ++;
    }
    
    void dequeue()
    {
        if(isEmpty())
        {
            return;
        }
        front = getFront();
        front = (front+1)%cap;
        size --;
    }
}
