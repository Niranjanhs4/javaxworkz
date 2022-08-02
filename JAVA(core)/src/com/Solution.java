package com;

class Solution {
 
	public static void main(String[] args)
	{
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		
		emp1.id=102;
		emp1.name="nikhi";
		emp1.salary=35000;
		
		emp2.id=103;
		emp2.name="chandu";
		emp2.salary=45000;
		
		emp3.id=104;
		emp3.name="chethu";
		emp3.salary=55000;
		
		System.out.println("id:"+emp1.id+"  "+"name:"+emp1.name+"  "+"salary:"+emp1.salary);
		System.out.println("id:"+emp2.id+"  "+"name:"+emp2.name+"  "+"salary:"+emp2.salary);
		System.out.println("id:"+emp3.id+"  "+"name:"+emp3.name+"  "+"salary:"+emp3.salary);

    }      

}
