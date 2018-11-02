package exercise1;

public class Exercise1 {
	static Person createPerson(String name, int age) {
		return new Person(name,age);
}

	public static void main(String[] args) {
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		Person X = createPerson(name,age);
		System.out.print("Nom = " + X.getName()+ " ");
		System.out.println("et Age = "+ X.getAge());

	}
}
