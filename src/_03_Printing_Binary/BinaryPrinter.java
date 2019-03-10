package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public static void main(String[] args) {
		byte c= 1;
		short s = 1;
		int i = 1;
		long a = 1;
		
		printByteBinary(c);
		printShortBinary(s);
		printIntBinary(i);
		printLongBinary(a);
		
	};
	
	public static void printByteBinary(byte b) {
	System.out.println(Integer.toBinaryString(b));
	}
	
	public static void printShortBinary(short s) {
	
		System.out.println(Integer.toBinaryString(s));
	}
	
	public static void printIntBinary(int i) {
		System.out.println(Integer.toBinaryString(i));
	}
	
	public static void printLongBinary(long l) {
		System.out.println(Integer.toBinaryString((int) l));
		
	}
}
