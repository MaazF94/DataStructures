package ben.edu.examples.thing;

public class ThingClass {

	private int x;
	private int y;
	private static int z = 1;
	private static int a = 12;
	
	public ThingClass() {
		x = z;
		y = z;
	}
	
	public ThingClass(int t) {
		a = t;
	}
	
	public void putThing(int a) {
		z = a;
		x = a + z;
		y = x + 5;
		a = z;
	}
	
	public static void main(String[] args) {
		ThingClass one = new ThingClass(8);
		one.putThing(5);
		display(one);
		
		ThingClass two = new ThingClass(2);
		two.putThing(10);
		display(two);
		
		ThingClass three = new ThingClass();
		three.putThing(30);
		display(three);
	}
	
	private static void display(ThingClass thing) {
		System.out.println(thing.x);
		System.out.println(thing.y);
		System.out.println(z);
		System.out.println(a);
		System.out.println();
	}
	
}
