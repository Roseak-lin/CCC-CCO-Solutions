package classWork;

public class InnerClassAccessPrivate {

	public static void main(String[] args) {
		OuterClass o = new OuterClass();
		OuterClass.InnerClass in = o.new InnerClass();
		System.out.println(in.getNum());
	}

}

class OuterClass {
	private int num = 80;

	class InnerClass {
		public int getNum() {
			System.out.print("The number in the inner class is: ");
			return num;
		}
	}
}