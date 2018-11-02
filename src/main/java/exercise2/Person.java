package exercise2;

class Person {
	private int age;
	private static int populationSize=0;
	private static float totalAge=0;

	public Person(int a){
		age = a;
		populationSize++;
		totalAge = totalAge+a;
	}

	static int getPopulationSize() {
		return populationSize;
	}

	static float getAveragePopulationAge() {
		return totalAge/populationSize;
	}

	static void getResetPopulation() {
		populationSize = 0;
		totalAge = 0;
	}
}


