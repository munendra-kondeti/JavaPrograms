package java_class_tasks;

public class SumItSelf {

	public static void main(String[] args) {

		int a = 10;
		
		System.out.println(sum(a));
	}

	static int sum(int a) {
		int b =a;
		if (a != 20) {
			++a;
			b++;
		}
		
		return sum(a);
	}

}
