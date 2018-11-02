package exercise2;

public class Exercise2 {
	static void createPerson(int age) {
		Person X = new Person(age);
	}

	static int computePopulationSize() {
		return Person.getPopulationSize();
	}

	static float computeAveragePopulationAge() {
		return Person.getAveragePopulationAge();
	}

	static void resetPopulation() {
		Person.getResetPopulation();
	}
}
