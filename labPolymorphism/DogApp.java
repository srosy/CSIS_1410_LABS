package labPolymorphism;

public class DogApp {
	public static void main(String[] args) {
		Dog myDog = new Dog("Greyhound");
		System.out.println(myDog.toString());
		actAsDog(myDog);

		SledDog mySledDog = new SledDog("Husky");
		System.out.println(mySledDog.toString());
		actAsDog(mySledDog);

		CircusDog myCircusDog = new CircusDog("Terrier");
		System.out.println(myCircusDog.toString());
		actAsDog(myCircusDog);

		System.out.println("Using an Array:");
		System.out.println();
		Dog[] dogs = new Dog[] { myDog, mySledDog, myCircusDog }; // create array of Dogs
		for (Dog dog : dogs) {
			System.out.println(dog);
			if (dog instanceof SledDog) {
				((SledDog) dog).pullSled(); // cast to sleddog to access pullSled
			}
			actAsDog(dog);
		}

	}

	private static void actAsDog(Dog d) {
		d.communicate();
		d.move();
		System.out.println();
	}
}
