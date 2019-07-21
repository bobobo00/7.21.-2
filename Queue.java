package StackToQueue;

import java.util.Scanner;

public class Queue {
	stackOperate stack1;
	stackOperate stack2;
	static int[] array= {1,2,3,4,5};
	
	public void push(Queue q,int node){
		q.stack1.Push_p(q.stack1,node);
	}
	public int Pop(Queue q) {
		if(q.stack1.empty(q.stack1)&&q.stack2.empty(q.stack2)) {
			System.out.println("队列为空");
			return -1;
		}
		if(q.stack2.empty(q.stack2)) {
		   while(!(q.stack1.empty(q.stack1))) {
			q.stack2.Push_p(q.stack2,q.stack1.Pop_p(q.stack1));
		   }
		}
		return q.stack2.Pop_p(q.stack2);
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		stack s1=new stack();
		stack s2=new stack();
		stackOperate stack_1=new stackOperate();
		stackOperate stack_2=new stackOperate();
		stack_1.ss=s1;
		stack_2.ss=s2;
		Queue q=new Queue();
		q.stack1=stack_1;
		q.stack2=stack_2;
		System.out.println("请输入入队数：");
		q.push(q,scanner.nextInt());
		q.push(q,scanner.nextInt());
		q.push(q,scanner.nextInt());
		System.out.println(q.Pop(q));
		System.out.println(q.Pop(q));
		System.out.println(q.Pop(q));
		System.out.println(q.Pop(q));
	}
}

class stackOperate{
	stack ss;
	
	boolean empty(stackOperate stack) {
		if(stack.ss.size==0) 
		{return true;}
	return false;
	}
	void Push_p(stackOperate stack,int node) {
		if(stack.ss.arr.length==(stack.ss.size)) {
			System.out.println("队满");
			return ;
		}
		stack.ss.arr[(stack.ss.size)++]=node;
	}
	int Pop_p(stackOperate stack){
		if(stack.empty(stack)) {
			System.out.println("队空");
			return -1;
		}
		return stack.ss.arr[--(stack.ss.size)];
	}
	
}
class stack{
	int[] arr=new int[5];
	int size;
}

