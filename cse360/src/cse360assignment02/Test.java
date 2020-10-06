package cse360assignment02;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddingMachine myC = new AddingMachine();
		
		myC.add (4); 
		myC.subtract (2); 
		myC.add(5);
		System.out.println(myC.toString());
		
		myC.clear();
		System.out.println(myC.toString());

		
AddingMachine myC2 = new AddingMachine();
		
		myC2.add (4); 
		myC2.subtract (2); 
		myC2.add(5);
		System.out.println(myC2.toString());
	}

}
