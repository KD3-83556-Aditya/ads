package com.sunbeam;

public class infixToPrefix {
	public static int prio (char opr) {
		switch(opr) {
		case'$':return 11;
		case'/':return 10;
		case'*':return 10;
		case '%':return 10;
		case'+':return 9;
		case'-':return 9;
		}
		return 0;
	}
	
	public static String infixPreFix(String infix) {
		Stack st=new Stack(10);
		StringBuilder prefix=new StringBuilder();
		for(int i=infix.length()-1; i>=0; i--) {
			char ele = infix.charAt(i);
			if(Character.isDigit(ele))
				prefix.append(ele);
			else if (ele ==')')
				st.push(ele);
			else if(ele=='(') {
				while(st.peek()!=')') {
					prefix.append(st.pop());
				}
				st.pop();
			}
				else
				{
					while(!st.isEmpty() && prio(st.peek())> prio(ele)) {
						prefix.append(st.pop());
						
					}
					st.push(ele);
					
				}
			}
			
		 while (!st.isEmpty())
			prefix.append(st.pop());
		
		prefix.reverse();
		return prefix.toString();
		
		
	}
	
	public static String infixToPostfix(String infix) {
	
		Stack st = new Stack(10);
		
		StringBuilder postfix = new StringBuilder();
		for(int i = 0 ; i < infix.length() ; i++) {
			
			char ele = infix.charAt(i);
			
			if(Character.isDigit(ele))
	
				postfix.append(ele);
			
			else if(ele == '(')
				st.push(ele);
		
			else if(ele == ')') {
				
				while(st.peek() != '(') {
					postfix.append(st.pop());
				}
			
				st.pop();
			}
			
			else {
				
				while(!st.isEmpty() && prio(st.peek()) >= prio(ele)) {
					postfix.append(st.pop());
				}
				
				st.push(ele);
			}
		}

		while(!st.isEmpty())
			postfix.append(st.pop());
		
		return postfix.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String infix= "987*31-42/37(16+18)+77";
		
		String prefix = infixPreFix(infix);
		System.out.println("Prefix :"+prefix);
		
		String postfix  = infixToPostfix(infix);
		System.out.println("Infix : " + infix);
		System.out.println("Postfix : " + postfix);

		

	}

}
