package practice;

import java.util.Stack;

public class SortStackUsingStack {

	public static void main(String[] args) {
		Stack<Integer> input= new Stack<Integer>();
		input.add(23);
		input.add(54);
		input.add(15);
		input.add(43);
		input.add(66);
		
		Stack<Integer> tempStack= new Stack<Integer>();
		for(int i=0;!input.isEmpty();i++)
		{
			int temp=input.pop();
			for(int j=0;!tempStack.isEmpty() && temp<tempStack.peek();j++)
			{
				input.push(tempStack.pop());
			}
				tempStack.push(temp);
		}
		for(int i=0;!tempStack.empty();i++)
		System.out.print(tempStack.pop()+" ");
	}

}
