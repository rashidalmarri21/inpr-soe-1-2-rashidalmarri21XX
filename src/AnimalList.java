import java.util.*;

public class AnimalList {
    ArrayList<String> animals;
    String searchAnimal;
    String name;


    /**
     * Constructor for the class
     */
    public AnimalList() {
        animals = new ArrayList<>();

    }

    /**
     * Adds an animal to the AnimalList two times.
     */
    public void addAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an animal to add to the list: ");
        name = scanner.nextLine();
        animals.add(name);
        animals.add(name);
        String join = String.join(", ", animals);
        System.out.println(join);
        System.out.println();
        System.out.println("Oh no! Your animal " + name + " was added to the list TWO times!" );

    }

    /**
     * Asks user if they would like to resort the list.
     * Uses a hashset to remove any duplicates in a list
     * Sorts the list alphabetically
     */
    public void getUniqueSortedList() {
        Scanner scanner = new Scanner(System.in);
        String choice;
        boolean yesOrNo;

        System.out.println("Do you want to delete the duplicate and sort the new list? y/n?");
        while (true) {
            choice = scanner.nextLine().trim().toLowerCase();
            if (choice.equals("y")) {
                yesOrNo = true;
                break;
            } else if (choice.equals("n")) {
                yesOrNo = false;
                break;
            } else {
                System.out.println("I'm sorry, that response was invalid.Please answer 'y' or 'n'.");
            }
        }

        if (yesOrNo) {
            HashSet<String> newSet = new HashSet<>(animals);
            ArrayList<String> sortedAnimals = new ArrayList<>(newSet);
            Collections.sort(sortedAnimals);
            String resortedList = String.join(", ", sortedAnimals);
            System.out.println(resortedList);
            System.out.println();
            System.out.println("The list is now resorted with the new entry! ");
            int index;
            for (int i = 0; i < sortedAnimals.size(); i++) {
                String findName = sortedAnimals.get(i);
                if (findName.equalsIgnoreCase(name)) {
                    index = i;
                    System.out.println("Your animal '" + name + "' was added to index: " + index + "!");
                }
            }

        } else {
            System.out.println("Oh, okay. Fine, I guess... :(");

        }
    }

    /**
     * Reads the list of animal types
     */
    public void readAnimalsFile() {
        animals = FileIO.readDataFromFile(FileIO.DATA_FILE);
    }

    /**
     * Returns the current size of the list
     * @return the integer representing the list size
     */
     public int getAnimalListSize() {
         return animals.size();

     }


    /**
     * Get a random animal from the ArrayList
     * @return the random Animal name
     */
    public String getRandomAnimal() {
        Random rnd = new Random();
        return animals.get(rnd.nextInt(animals.size()));

    }

    /**
     * Search through the entire animals ArrayList to see if a specific animal is in the list
     * Ignore case in the search
     */
    public void findAnimal() {
        int index = -1;
        for (int i = 0; i < animals.size() ; i++) {
             String findName = animals.get(i);
            if (findName.equalsIgnoreCase(searchAnimal) ) {
                index = i;
            }
        }
        if(index < 0) {
            System.out.println("Your animal '" + searchAnimal + "' was not found!");
        }
        else
            System.out.println("Your animal '" + searchAnimal + "' was found at index: " + index );

    }

    /**
     * Get animal name to search for
     * @return the animal name
     */
    public String getAnimalName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter animal name: ");
        searchAnimal = scanner.nextLine();

        return searchAnimal ;
    }


    /**
     * Print out all the animals in the ArrayList in a row separated by commas
     * (don't add a comma to the last item in the list.)
     * @return list separated by comas.
     */
    public String printAllAnimals() {
        return String.join(", ", animals);
    }

    /**
     * Iterate through the list to find the longest animal name in terms of characters
     * Print out the longest name and how many characters it has!
     */
    public void findLongestName() {
        int maxChars = 0;
        String longestName = null;
        for (String currentIndex : animals) {
            if (currentIndex.length() > maxChars) {
                maxChars = currentIndex.length();
                longestName = currentIndex;
            }
        }
        System.out.println
                ("The animal with the longest name is " + longestName + " and it has " + maxChars + " letters!");
        System.out.println();
    }






    /**
     * Find the most frequent initial letter the occurs in the animal names (the first letter of the name)
     * Keep a count of the initial letters print out the letter that occurs the most and how many times it occurs
     */
    public void findMostFrequentInitialLetter() {

    }






}
