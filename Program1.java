// Basic Implementation of Queue using Arrays
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Queue q = new Queue(5);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(30);
		q.enqueue(4);
		q.enqueue(5);
		
		System.out.println(Arrays.toString(q.arr));
		System.out.println(q.size);
		
		q.deque();
		
		System.out.println(Arrays.toString(q.arr)); 
		System.out.println("size is " +q.size);
		System.out.println("rear = " +q.getRear());
		System.out.println("---------------------------------------");
		 //printing the Queue using array loop
        for(int i=0;i<q.size;i++)
        {
            System.out.println(q.arr[i]);
        }
	}
}
class Queue{
    int size,cap;
    int []arr; //queue array int arr[] queue
    Queue(int x){
        cap = x;
        arr  = new int[cap];
    }
    boolean isFull()
    {
        if(size == cap)
        {
            return true;
        }
        return false;
    }
    
    boolean isEmpty()
    {
        if(size == 0)
        {
            return true;
        }
        return false;
    }
    
    void enqueue(int x)
    {
        if(isFull())
        {
            return;
        }
        arr[size] = x;
        size ++ ;
    }
    void deque(){
        if(isEmpty())
        {
            return;
        }
        for(int i =0;i<size-1;i++)
        {
            arr[i] = arr[i+1];
        }
        size --;
    }
    int getFront()
    {
        if(isEmpty())
        {
            return -1;
        }
        else
            return 0;
    }
    int getRear()
    {
        if(isEmpty())
            return -1;
        else
            return (size-1);
        
    }
    
}
