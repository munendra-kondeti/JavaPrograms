
public class DemoEmployee {

	public static void main(String[] args) {
		// size 10;
		Employee[] employees = new Employee[4];

		// create objects for each elements in a employee array.
		for (int i = 0; i < employees.length; i++)
			employees[i] = new Employee();

		// Initializing the employee data to each object of an element
		for (int i = 0; i < employees.length; i++) {
			employees[i].id = 142;
			employees[i].name = "muni";
			employees[i].age = 21;
			employees[i].experince = 1;
		}
		// Traversing the employee array
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].id);
			System.out.println(employees[i].name);
			System.out.println(employees[i].age);
			System.out.println(employees[i].experince);

		}

	}

}
