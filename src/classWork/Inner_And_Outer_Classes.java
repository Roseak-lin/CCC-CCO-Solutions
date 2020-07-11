package classWork;

public class Inner_And_Outer_Classes {
	public static void main(String[] args) {
		outer o = new outer();
		o.display_inner();
		// outer.innerClass in = o.new innerClass();
	}
} 

class outer {
	int num;

	class innerClass {
		private void print() {
			System.out.println("Inner Class");
		}
	}

	public void display_inner() {
		innerClass in = new innerClass();
		in.print();
	}
}