

public class Main {
    public static void main(String[] args) {
        AnimalList animalList = new AnimalList();
        animalList.readAnimalsFile();

        //Print out the number of animals in the list
        System.out.println
                ("There are " + animalList.getAnimalListSize() + " animals on the list.");


        //Print the entire list of the animals in the file using the printAllAnimals method
        System.out.println(animalList.printAllAnimals());


        //Ask the user for an animal name to search for using the method getAnimalName
        System.out.println(animalList.getAnimalName());


        //Search for the animal name using findAnimal
        //Print out if the animal is found or not - print out the relevant index if it is found
        animalList.findAnimal();



        //Call the method findLongestName
        animalList.findLongestName();


        //Call the method findMostFrequentInitialLetter

        //Adds an animal the user defines to animalList TWO times.
        animalList.addAnimal();


        // Asks the user if they would like to sort the list then using method getUniqueSortedList();
        animalList.getUniqueSortedList();
    }

}
