

public class Application {

	public static void main(String[] args) {
		// 
		RationalNumber r1 = new RationalNumber(6, 8);
        RationalNumber r2 = new RationalNumber(1, 3);
        RationalNumber r3, r4, r5, r6, r7;

        System.out.println("First rational number: " + r1);
        System.out.println("Second rational number: " + r2);

        if (r1.isLike(r2))
            System.out.println("r1 and r2 are equal.");
        else
            System.out.println("r1 and r2 are NOT equal.");

        r3 = r1.reciprocal();
        System.out.println("The reciprocal of r1 is: " + r3);

        r4 = r1.add(r2);
        r5 = r1.subtract(r2);
        r6 = r1.multiply(r2);
        r7 = r1.divide(r2);

        System.out.println("r1 + r2: " + r4);
        System.out.println("r1 - r2: " + r5);
        System.out.println("r1 * r2: " + r6);
        System.out.println("r1 / r2: " + r7);
        
        
        		// Module 2 Project
        
	RationalNumber r10 = new RationalNumber(3, 4);
	RationalNumber r11 = new RationalNumber(6, 8);

	    System.out.print(r10.compareTo(r11));
	        
	        
		//********Program 2*********
		// Task class test object
		Task clean = new Task("Sweep");
		Task close = new Task("lock");
		clean.setPriority(10);
		close.setPriority(5);
	
		
		System.out.println(clean.getPriority());
		System.out.println(clean.compareTo(close));
		System.out.println(clean.toString());
		
		//Process class test object
		Process p1 = new Process("file");
		Process p2 = new Process("list");
		p1.setProcessID("777");
		p1.setPriority(10);
		p2.setProcessID("999");
		p2.setPriority(5);
		
		
		System.out.println(p1.getProcessID());
		System.out.println(p1.getPriority());
		System.out.println(p1.compareTo(p2));
		System.out.println(p1.toString());
	}//end main

}//end class

}
