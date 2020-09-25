/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshelter;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jessi
 */

//5 main methods are addAnimal, removeAnimal, printAnimals, adoptAnimals, and donateAnimals
public class PetShelterTestHarness {

    Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PetShelterTestHarness run = new PetShelterTestHarness();
        
        System.out.println("Please note that you need to populate the pet shelter with animals before you try to adopt or remove one");
        run.runWelcomeProgram();
        run.runAnimalProgram();
        run.runCatProgram();
        run.runDogProgram();
        run.runBirdProgram();

    } // end of main method

    public void runWelcomeProgram() {

        System.out.println("Welcome to the Pet Shelter!");
        System.out.println("What kind of user are you?");

        System.out.println("1:Adopter");
        System.out.println("2:Employee");
        System.out.println("3:Volunteer");

        // take some user input 
        int choice1 = sc.nextInt();
        
        //type 1 means they are adopter
        if(choice1 == 1) {
            // implement adopter functionality
            
            System.out.println("What would you like to do? \n");
            
            
            System.out.println("1: Adopt an animal.");
            System.out.println("2: Donate an animal. ");
            
            int choice3 = sc.nextInt();
            
            //if they type 1 which means to adopt an animal
            if(choice3 == 1){
              
                
                System.out.println("You chose 1: adopt an animal");
                //print out the current animals in the system
                System.out.println("Current animals in the system: \n");
                
                //create an animal object
                Animal newAnimal = new Animal();
                
                //print out the array list of animals
                newAnimal.printAnimals();
                
                // ask for the index from the user
                System.out.println("Please input the index of the animal you wish to adopt");
                
                // call the remove method, and pass in the above index
                newAnimal.removeAnimal(sc.nextInt());
                
                //print out the updated aray list of animals
                newAnimal.printAnimals();
                
            }
            //if the type 2 which means to donate an animal 
            else if (choice3 == 2){
                
                System.out.println("You chose 2: donate an animal");
                  //create a new animal
                Animal newAnimal = new Animal();
                
                //ask what the age of the animal is
                System.out.println("What is the age of the animal?");
                
                //take user input for the animal
                int input = sc.nextInt();
                
                //set the user input to the age
                int age = 0;
                age = input;
                
                //set the age of the animal
                newAnimal.setAnimalAge(age);
                
                //print out a new line for space
                System.out.println("");
                

                //ask what the kennel number of the animal is
                System.out.println("What is the kennel number of the animal?");
                
                //take user input for the animal kennel num
                int num = sc.nextInt();
                
                //set the kennel number of the animal
                newAnimal.setKennelNum(num);
                
                //print out a new line for space
                System.out.println("");
                
                
                //ask the user for the gender of the animal
                System.out.println("What is the gender of the animal?");
                
                //take user input for the animal gender
                String gender = sc.next();
                
                //set the gender of the animal
                newAnimal.setAnimalGender(gender);
                
                //print out a new line for space
                System.out.println("");
                
                
                
                
                //ask the user for the animal name
                System.out.println("What is the name of the animal?");
                
                //take user input for the animal name
                String name = sc.next();
                
                //set the name of the animal
                newAnimal.setAnimalName(name);
                
                //print out a new line for space
                System.out.println("");
                
                
                
                //ask the user for the adoption status of the animal
                System.out.println("What is the adoption status of the animal?");
                
                //take the user input for the animal adopted status
                boolean adopted = sc.nextBoolean();
                
                //set the adopted status
                newAnimal.setAnimalAdopted(adopted);
                
                //print out a new line for space
                System.out.println("");
                
                
                
                //ask the user for the fed status of the animal
                System.out.println("What is the fed status of the animal?");
                
                //take the user input for the fed status
                boolean fed = sc.nextBoolean();
                
                //set the fed status
                newAnimal.setAnimalFed(fed);
                
                //print out a new line for space
                System.out.println("");
                
                
                
                //ask the user for the price of the animals
                System.out.println("What is the price of the animal?");
                
                //take the user input for the price
                double price = sc.nextDouble();
                
                //set the price
                newAnimal.setAnimalPrice(price);
                
                //print out a new line for space
                System.out.println("");
                

                
                //add the new animal to the array using the add animal method to get all of its fields
                newAnimal.animals.add((Animal) newAnimal.donateAnimal(newAnimal.getAnimalAge(), 
                        newAnimal.getKennelNum(), newAnimal.getAnimalGender(), newAnimal.getAnimalName()
                        , newAnimal.isAnimalAdopted(), newAnimal.isAnimalFed(), newAnimal.getAnimalPrice()));
                
                
        }
        }//if they type 2 which means they are an employee
        else if(choice1 == 2) {
            
            
        
            
            System.out.println("Welcome Employee!");
            System.out.println("");
            System.out.println("What would you like to do? \n");
            
            System.out.println("1: Adding a new animal.");
            System.out.println("2: Remove an animal.");
            
            int choice2 = sc.nextInt();
            //if they type 1 which means to add an animal
            
            if(choice2 == 1) {
                //create a new animal
                Animal newAnimal = new Animal();
                
                //ask what the age of the animal is
                System.out.println("What is the age of the animal?");
                
                //take user input for the animal
                int input = sc.nextInt();
                
                //set the user input to the age
                int age = 0;
                age = input;
                
                //set the age of the animal
                newAnimal.setAnimalAge(age);
                
                //print out a new line for space
                System.out.println("");
                

                //ask what the kennel number of the animal is
                System.out.println("What is the kennel number of the animal?");
                
                //take user input for the animal kennel num
                int num = sc.nextInt();
                
                //set the kennel number of the animal
                newAnimal.setKennelNum(num);
                
                //print out a new line for space
                System.out.println("");
                
                
                //ask the user for the gender of the animal
                System.out.println("What is the gender of the animal?");
                
                //take user input for the animal gender
                String gender = sc.next();
                
                //set the gender of the animal
                newAnimal.setAnimalGender(gender);
                
                //print out a new line for space
                System.out.println("");
                
                
                
                
                //ask the user for the animal name
                System.out.println("What is the name of the animal?");
                
                //take user input for the animal name
                String name = sc.next();
                
                //set the name of the animal
                newAnimal.setAnimalName(name);
                
                //print out a new line for space
                System.out.println("");
                
                
                
                //ask the user for the adoption status of the animal
                System.out.println("What is the adoption status of the animal?");
                
                //take the user input for the animal adopted status
                boolean adopted = sc.nextBoolean();
                
                //set the adopted status
                newAnimal.setAnimalAdopted(adopted);
                
                //print out a new line for space
                System.out.println("");
                
                
                
                //ask the user for the fed status of the animal
                System.out.println("What is the fed status of the animal?");
                
                //take the user input for the fed status
                boolean fed = sc.nextBoolean();
                
                //set the fed status
                newAnimal.setAnimalFed(fed);
                
                //print out a new line for space
                System.out.println("");
                
                
                
                //ask the user for the price of the animals
                System.out.println("What is the price of the animal?");
                
                //take the user input for the price
                double price = sc.nextDouble();
                
                //set the price
                newAnimal.setAnimalPrice(price);
                
                //print out a new line for space
                System.out.println("");
                

                
                //add the new animal to the array using the add animal method to get all of its fields
                newAnimal.animals.add((Animal) newAnimal.addAnimal(newAnimal.getAnimalAge(), 
                        newAnimal.getKennelNum(), newAnimal.getAnimalGender(), newAnimal.getAnimalName()
                        , newAnimal.isAnimalAdopted(), newAnimal.isAnimalFed(), newAnimal.getAnimalPrice()));
                
                
                
                System.out.println("The list of animals in the shelter are:");
                newAnimal.printAnimals();
                
                
            }
            //if they type 2 which means they want to remove an animal 
            
            else  if (choice2 == 2) {
                System.out.println("You chose 2: remove an animal");
                //print out the current animals in the system
                System.out.println("Current animals in the system: \n");
                
                //create an animal object
                Animal newAnimal = new Animal();
                
                //print out the array list of animals
                newAnimal.printAnimals();
                
                // ask for the index from the user
                System.out.println("Please input the index of the animal you wish to remove");
                
                // call the remove method, and pass in the above index
                newAnimal.removeAnimal(sc.nextInt());
                
                System.out.println("The list of animals in the shelter are:");
                newAnimal.printAnimals();
            }
            
            
            
        }
        //if they type 3 which means they are a volunteer
        else  if(choice1 == 3) {
            
            System.out.println("Welcome Volunteer!");
            System.out.println("");
            System.out.println("What would you like to do? \n");
            
            System.out.println("1: Adding a new animal.");
            System.out.println("2: Remove an animal.");
            
            int choice4 = sc.nextInt();
            //if they type 1 which means to add an animal
            
            if(choice4 == 1) {
                //create a new animal
                Animal newAnimal = new Animal();
                
                //ask what the age of the animal is
                System.out.println("What is the age of the animal?");
                
                //take user input for the animal
                int input = sc.nextInt();
                
                //set the user input to the age
                int age = 0;
                age = input;
                
                //set the age of the animal
                newAnimal.setAnimalAge(age);
                
                //print out a new line for space
                System.out.println("");
                

                //ask what the kennel number of the animal is
                System.out.println("What is the kennel number of the animal?");
                
                //take user input for the animal kennel num
                int num = sc.nextInt();
                
                //set the kennel number of the animal
                newAnimal.setKennelNum(num);
                
                //print out a new line for space
                System.out.println("");
                
                
                //ask the user for the gender of the animal
                System.out.println("What is the gender of the animal?");
                
                //take user input for the animal gender
                String gender = sc.next();
                
                //set the gender of the animal
                newAnimal.setAnimalGender(gender);
                
                //print out a new line for space
                System.out.println("");
                
                
                
                
                //ask the user for the animal name
                System.out.println("What is the name of the animal?");
                
                //take user input for the animal name
                String name = sc.next();
                
                //set the name of the animal
                newAnimal.setAnimalName(name);
                
                //print out a new line for space
                System.out.println("");
                
                
                
                //ask the user for the adoption status of the animal
                System.out.println("What is the adoption status of the animal?");
                
                //take the user input for the animal adopted status
                boolean adopted = sc.nextBoolean();
                
                //set the adopted status
                newAnimal.setAnimalAdopted(adopted);
                
                //print out a new line for space
                System.out.println("");
                
                
                
                //ask the user for the fed status of the animal
                System.out.println("What is the fed status of the animal?");
                
                //take the user input for the fed status
                boolean fed = sc.nextBoolean();
                
                //set the fed status
                newAnimal.setAnimalFed(fed);
                
                //print out a new line for space
                System.out.println("");
                
                
                
                //ask the user for the price of the animals
                System.out.println("What is the price of the animal?");
                
                //take the user input for the price
                double price = sc.nextDouble();
                
                //set the price
                newAnimal.setAnimalPrice(price);
                
                //print out a new line for space
                System.out.println("");
                

                
                //add the new animal to the array using the add animal method to get all of its fields
                newAnimal.animals.add((Animal) newAnimal.addAnimal(newAnimal.getAnimalAge(), 
                        newAnimal.getKennelNum(), newAnimal.getAnimalGender(), newAnimal.getAnimalName()
                        , newAnimal.isAnimalAdopted(), newAnimal.isAnimalFed(), newAnimal.getAnimalPrice()));
                
                
                
                System.out.println("The list of animals in the shelter are:");
                newAnimal.printAnimals();
                
                
            }
            //if they type 2 which means they want to remove an animal 
            
            else if(choice4 == 2) {
                System.out.println("You chose 2: remove an animal");
                //print out the current animals in the system
                System.out.println("Current animals in the system: \n");
                
                //create an animal object
                Animal newAnimal = new Animal();
                
                //print out the array list of animals
                newAnimal.printAnimals();
                
                // ask for the index from the user
                System.out.println("Please input the index of the animal you wish to remove");
                
                // call the remove method, and pass in the above index
                newAnimal.removeAnimal(sc.nextInt());
                
                //print out the updated aray list of animals
                newAnimal.printAnimals();
            }
            
            
            
        }
        
        
   
        

        //create an array list to store the animals
        //ArrayList<Animal> animals = new ArrayList<>();

        //animals.add(animal1);
        //animals.add(cat1);
        //animals.add(dog1);
        //animals.add(bird1);
        //System.out.println("The animals in the pet shelter are : ");

        //for (int i = 0; i < animals.size(); i++) {
        //    System.out.println(animals.get(i) + " also known as " + animals.get(i).getAnimalName());
        //}
        
        
    } // end of run welcome program
    
   
    public void runAnimalProgram(){ 
        //testing  all of the getter methods and then setter methods in the animal class
        System.out.println("This is the testing of each animal getter and setter method in the Animal Class: ");

        //print out a blank line to create space
        System.out.println("");

        //create a new animal variable from the animal class
        Animal animal1 = new Animal();

        //print out the default age of the animal from animal class
        System.out.println("The default animal age is : " + animal1.getAnimalAge() + " years old");

        //print out a blank line to create space
        System.out.println("");

        //ask user to update the animal age
        System.out.println("Please set the animal age using an integer");

        //update the animal age
        animal1.setAnimalAge(sc.nextInt());

        //print out the new age of the animal from the animal class
        System.out.println("The updated animal age is : " + animal1.getAnimalAge() + " years old");

        //print out a blank line to create space
        System.out.println("");

        //print out the default kennel number of the animal from the animal class
        System.out.println("The default animal kennel number is kennel # : " + animal1.getKennelNum());

        //print out a blank line to create space
        System.out.println("");

        //ask user to update the animal kennel number
        System.out.println("Please set the animal kennel number using an integer");

        //update the animal kennel number
        animal1.setKennelNum(sc.nextInt());

        //print out the new age of the animal from the animal class
        System.out.println("The updated animal kennel number is kennel # : " + animal1.getKennelNum());

        //print out a blank line to create space
        System.out.println("");

        //print out the default gender of the animal from the animal class
        System.out.println("The default animal gender is : " + animal1.getAnimalGender());

        //print out a blank line to create space
        System.out.println("");

        //ask the user to update the animal gender
        System.out.println("Please set the animal gender using a string");

        //update the animal gender
        animal1.setAnimalGender(sc.next());

        //print out the new gender of the animal 
        System.out.println("The updated animal gender is : " + animal1.getAnimalGender());

        //print out a blank line to create space
        System.out.println("");

        //print out the default name of the animal from the animal class
        System.out.println("The default animal name is : " + animal1.getAnimalName());

        //print out a blank line to create space
        System.out.println("");

        //ask the user to update the name of the animal
        System.out.println("Please set the animal name using a string");

        //update the animal name
        animal1.setAnimalName(sc.next());

        //print out the new name of the animal from the animal class
        System.out.println("The updated animal name is : " + animal1.getAnimalName());

        //print out a blank line to create space
        System.out.println("");

        //print out the default adoption status of the animal from the animal class
        System.out.println("The default animal adoption status is : " + animal1.isAnimalAdopted());

        //print out a blank line to create space
        System.out.println("");

        //ask the user to update the adoption status of the animal 
        System.out.println("Please set the adoption status of the animal using a boolean value");

        //update the animal adoption status
        animal1.setAnimalAdopted(sc.nextBoolean());

        //print out the new adoption status of the animal from the animal class
        System.out.println("The updated animal adoption status is : " + animal1.isAnimalAdopted());

        //print out a blank line to create space
        System.out.println("");

        //print out the default animal fed status of the animal from the animal class
        System.out.println("The default animal fed status is : " + animal1.isAnimalFed());

        //print out a blank line to create space
        System.out.println("");

        //ask the user to update the animal fed status 
        System.out.println("Please set the animal fed status using a boolean value, type true if the animal has recently been "
                + "fed and type false if the animal has not been fed recently");

        //update the animal fed status
        animal1.setAnimalFed(sc.nextBoolean());

        //print out the new animal fed status of the animal from the animal class
        System.out.println("The updated animal fed status is : " + animal1.isAnimalFed());

        //print out a blank line to create space
        System.out.println("");

        //print out the default animal price of the animal from the animal class
        System.out.println("The default animal price is : " + animal1.getAnimalPrice() + " dollars");

        //print out a blank line to create space
        System.out.println("");

        //ask the user to update the animal price
        System.out.println("Please set the animal price using a double");

        //update the animal price
        animal1.setAnimalPrice(sc.nextDouble());

        //print out the new animal price of the animal from the animal class
        System.out.println("The updated animal price is : " + animal1.getAnimalPrice() + " dollars");

        //print out a blank line to create space
        System.out.println("");

        //end of testing out animal class getter and setters
        System.out.println("This is the end of the testing of each animal getter and setter method in the Animal Class");

        //print out a blank line to create space
        System.out.println("");
        
    } // end of run animal program
    
    public void runCatProgram(){
              //testing  all of the getter methods and then setter methods in the cat class
        System.out.println("This is the testing of each cat getter and setter method in the Cat Class which extends the Animal Class: ");

        //print out a blank line to create space
        System.out.println("");

        //create a new cat object using the cat class
        Cat cat1 = new Cat();

        //print out the default age of the cat from cat class
        System.out.println("The default cat age is : " + cat1.getAnimalAge() + " years old");

        //print out a blank line to create space
        System.out.println("");

        //ask the user to update the cat age
        System.out.println("Please set the cat age using an integer");

        //update the cat age
        cat1.setAnimalAge(sc.nextInt());

        //print out the new age of the cat from the cat class
        System.out.println("The updated cat age is : " + cat1.getAnimalAge() + " years old");

        //print out a blank line to create space
        System.out.println("");

        //print out the default kennel number of the cat from the cat class
        System.out.println("The default cat kennel number is kennel # : " + cat1.getKennelNum());

        //print out a blank line to create space
        System.out.println("");

        //ask the user to update the kennel number
        System.out.println("Please set the cat kennel number using an integer");

        //update the cat kennel number
        cat1.setKennelNum(sc.nextInt());

        //print out the new age of the cat from the cat class
        System.out.println("The updated cat kennel number is kennel # : " + cat1.getKennelNum());

        //print out a blank line to create space
        System.out.println("");

        //print out the default gender of the cat from the cat class
        System.out.println("The default cat gender is : " + cat1.getAnimalGender());

        //print out a blank line to create space
        System.out.println("");

        //ask the user to update the cat gender
        System.out.println("Please set the cat gender using a string");

        //update the cat gender
        cat1.setAnimalGender(sc.next());

        //print out the new gender of the cat 
        System.out.println("The updated cat gender is : " + cat1.getAnimalGender());

        //print out a blank line to create space
        System.out.println("");

        //print out the default name of the cat from the cat class
        System.out.println("The default cat name is : " + cat1.getAnimalName());

        //print out a blank line to create space
        System.out.println("");

        //ask the user to update the cat name
        System.out.println("Please set the cat name using a string");

        //update the cat name
        cat1.setAnimalName(sc.next());

        //print out the new name of the cat from the cat class
        System.out.println("The updated cat name is : " + cat1.getAnimalName());

        //print out a blank line to create space
        System.out.println("");

        //print out the default adoption status of the cat from the cat class
        System.out.println("The default cat adoption status is : " + cat1.isAnimalAdopted());

        //print out a blank line to create space
        System.out.println("");

        //ask the user to update the cat adoption status
        System.out.println("Please set the cat adoption status using a boolean"
                + "type true if the cat has been adopted"
                + "type false if the cat has not been adopted");

        //update the cat adoption status
        cat1.setAnimalAdopted(sc.nextBoolean());

        //print out the new adoption status of the cat from the cat class
        System.out.println("The updated cat adoption status is : " + cat1.isAnimalAdopted());

        //print out a blank line to create space
        System.out.println("");

        //print out the default cat fed status of the cat from the cat class
        System.out.println("The default cat fed status is : " + cat1.isAnimalFed());

        //print out a blank line to create space
        System.out.println("");

        //ask the user to update the cat fed status
        System.out.println("Please set the cat fed status using a boolean"
                + "type true if the cat has been fed recently"
                + "type false if the cat has not been fed recently");

        //update the cat fed status
        cat1.setAnimalFed(sc.nextBoolean());

        //print out the new cat fed status of the cat from the cat class
        System.out.println("The updated cat fed status is : " + cat1.isAnimalFed());

        //print out a blank line to create space
        System.out.println("");

        //print out the default cat price of the cat from the cat class
        System.out.println("The default cat price is : " + cat1.getAnimalPrice() + " dollars");

        //print out a blank line to create space
        System.out.println("");

        //ask the user to update the cat price
        System.out.println("Please set the cat price using a double");

        //update the cat price
        cat1.setAnimalPrice(sc.nextDouble());

        //print out the new cat price of the cat from the cat class
        System.out.println("The updated cat price is : " + cat1.getAnimalPrice() + " dollars");

        //print out a blank line to create space
        System.out.println("");

        //print out the default cat playe with from the cat class
        System.out.println("The default cat played with status is : " + cat1.isCatPlayedWith());

        //print out a blank line to create space
        System.out.println("");

        //ask the user to set the cat played with status
        System.out.println("Please set the cat played with status using a boolean"
                + "type true if the cat has recently been played with"
                + "type false if the cat has not recently been played with ");

        //update the cat played with 
        cat1.setCatPlayedWith(sc.nextBoolean());

        //print out the new cat played with from the cat class
        System.out.println("The updated cat played with status is : " + cat1.isCatPlayedWith());

        //print out a blank line to create space
        System.out.println("");

        //end of testing out cat class getter and setters
        System.out.println("This is the end of the testing of each cat getter and setter method in the Cat Class which extends the Animal Class");

        //print out a blank line to create space
        System.out.println("");

    }//end of run cat program
    
    public void runDogProgram(){
           //testing  all of the getter methods and then setter methods in the dog class
        System.out.println("This is the testing of each dog getter and setter method in the Dog Class which extends the Animal Class: ");

        //print out a blank line to create space
        System.out.println("");

        //create a new dog object using the dog class
        Dog dog1 = new Dog();

        //print out the default age of the dog from dog class
        System.out.println("The default dog age is : " + dog1.getAnimalAge() + " years old");

        //print out a blank line to create space
        System.out.println("");

        //ask the user to update the dog age
        System.out.println("Pleate set the dog age using an integer");

        //update the dog age
        dog1.setAnimalAge(sc.nextInt());

        //print out the new age of the dog from the dog class
        System.out.println("The updated dog age is : " + dog1.getAnimalAge() + " years old");

        //print out a blank line to create space
        System.out.println("");

        //print out the default kennel number of the dog from the dog class
        System.out.println("The default dog kennel number is kennel # : " + dog1.getKennelNum());

        //print out a blank line to create space
        System.out.println("");

        //ask the user to update the kennel number
        System.out.println("Please set the dog kennel number using an integer");

        //update the dog kennel number
        dog1.setKennelNum(sc.nextInt());

        //print out the new age of the dog from the dog class
        System.out.println("The updated dog kennel number is kennel # : " + dog1.getKennelNum());

        //print out a blank line to create space
        System.out.println("");

        //print out the default gender of the dog from the dog class
        System.out.println("The default dog gender is : " + dog1.getAnimalGender());

        //print out a blank line to create space
        System.out.println("");

        //ask the user to update the dog gender
        System.out.println("Please set the dog gender using a string: type female or male");

        //update the dog gender
        dog1.setAnimalGender(sc.next());

        //print out the new gender of the dog 
        System.out.println("The updated dog gender is : " + dog1.getAnimalGender());

        //print out a blank line to create space
        System.out.println("");

        //print out the default name of the dog from the dog class
        System.out.println("The default dog name is : " + dog1.getAnimalName());

        //print out a blank line to create space
        System.out.println("");

        //ask the user to update the dog name
        System.out.println("Please set the dog name using a string");

        //update the dog name
        dog1.setAnimalName(sc.next());

        //print out the new name of the dog from the dog class
        System.out.println("The updated dog name is : " + dog1.getAnimalName());

        //print out a blank line to create space
        System.out.println("");

        //print out the default adoption status of the dog from the dog class
        System.out.println("The default dog adoption status is : " + dog1.isAnimalAdopted());

        //print out a blank line to create space
        System.out.println("");

        //ask the user to set the dog adoption status
        System.out.println("Please set the dog adoption status using a boolean");

        //update the dog adoption status
        dog1.setAnimalAdopted(sc.nextBoolean());

        //print out the new adoption status of the dog from the dog class
        System.out.println("The updated dog adoption status is : " + dog1.isAnimalAdopted());

        //print out a blank line to create space
        System.out.println("");

        //print out the default dog fed status of the dog from the dog class
        System.out.println("The default dog fed status is : " + dog1.isAnimalFed());

        //print out a blank line to create space
        System.out.println("");

        //ask the user to update the dog fed status
        System.out.println("Please set the dog fed status using a boolean"
                + "type true if the dog has recently been fed"
                + "type false if the dog hasnt been recently fed");

        //update the dog fed status
        dog1.setAnimalFed(sc.nextBoolean());

        //print out the new dog fed status of the dog from the dog class
        System.out.println("The updated dog fed status is : " + dog1.isAnimalFed());

        //print out a blank line to create space
        System.out.println("");

        //print out the default dog price of the dog from the dog class
        System.out.println("The default dog price is : " + dog1.getAnimalPrice() + " dollars");

        //print out a blank line to create space
        System.out.println("");

        //ask the user to set the dog price
        System.out.println("Please set the dog price using a double");

        //update the dog price
        dog1.setAnimalPrice(sc.nextDouble());

        //print out the new dog price of the dog from the dog class
        System.out.println("The updated dog price is : " + dog1.getAnimalPrice() + " dollars");

        //print out a blank line to create space
        System.out.println("");

        //print out the default dog bathed status from the dog class
        System.out.println("The default dog bathed status is : " + dog1.isDogBathed());

        //print out a blank line to create space
        System.out.println("");

        //ask the user to update the dog bathed status
        System.out.println("Please set the dog bathed status using a boolean"
                + "type true if the dog has recently been bathed"
                + "type false if the dog hasnt been recently bathed");

        //update the dog bathed status
        dog1.setDogBathed(sc.nextBoolean());

        //print out the new dog bathed status from the dog class
        System.out.println("The updated dog bathed status is : " + dog1.isDogBathed());

        //print out a blank line to create space
        System.out.println("");

        //print out the default dog walked status from the dog class
        System.out.println("The default dog walked status is : " + dog1.isDogWalked());

        //print out a blank line to create space
        System.out.println("");

        //ask the dog to set the dog walked status
        System.out.println("Please set the dog walked status using a boolean"
                + "type true if the dog has recently been walked"
                + "type false if the dog hasnt recently been walked");

        //update the dog walked status
        dog1.setDogWalked(sc.nextBoolean());

        //print out the new dog walked status from the dog class
        System.out.println("The updated dog walked status is : " + dog1.isDogWalked());

        //print out a blank line to create space
        System.out.println("");

        //end of testing out dog class getter and setters
        System.out.println("This is the end of the testing of each dog getter and setter method in the Dog Class which extends the Animal Class");

        //print out a blank line to create space
        System.out.println("");
    } // end of run dog program
    
public void runBirdProgram(){
       //testing  all of the getter methods and then setter methods in the bird class
        System.out.println("This is the testing of each bird getter and setter method in the Bird Class which extends the Animal Class: ");

        //print out a blank line to create space
        System.out.println("");

        //create a new bird object using the bird class
        Bird bird1 = new Bird();

        //print out the default age of the bird from bird class
        System.out.println("The default bird age is : " + bird1.getAnimalAge() + " years old");

        //print out a blank line to create space
        System.out.println("");

        //ask the user to set the age of the bird
        System.out.println("Please set the bird age using an integer");

        //update the bird age
        bird1.setAnimalAge(sc.nextInt());

        //print out the new age of the bird from the bird class
        System.out.println("The updated bird age is : " + bird1.getAnimalAge() + " years old");

        //print out a blank line to create space
        System.out.println("");

        //print out the default kennel number of the bird from the bird class
        System.out.println("The default bird kennel number is kennel # : " + bird1.getKennelNum());

        //print out a blank line to create space
        System.out.println("");

        //ask the user to set the bird kennel number
        System.out.println("Please set the bird kennel number using an integer");

        //update the bird kennel number
        bird1.setKennelNum(sc.nextInt());

        //print out the new age of the bird from the bird class
        System.out.println("The updated bird kennel number is kennel # : " + bird1.getKennelNum());

        //print out a blank line to create space
        System.out.println("");

        //print out the default gender of the bird from the bird class
        System.out.println("The default bird gender is : " + bird1.getAnimalGender());

        //print out a blank line to create space
        System.out.println("");

        //ask the user to update the bird gender
        System.out.println("Please set the bird gender using a string"
                + "type female or male");

        //update the bird gender
        bird1.setAnimalGender("female");

        //print out the new gender of the bird 
        System.out.println("The updated bird gender is : " + bird1.getAnimalGender());

        //print out a blank line to create space
        System.out.println("");

        //print out the default name of the bird from the bird class
        System.out.println("The default bird name is : " + bird1.getAnimalName());

        //print out a blank line to create space
        System.out.println("");

        //ask the user to set the bird name
        System.out.println("Please set the bird name as a string");

        //update the bird name
        bird1.setAnimalName(sc.next());

        //print out the new name of the bird from the bird class
        System.out.println("The updated bird name is : " + bird1.getAnimalName());

        //print out a blank line to create space
        System.out.println("");

        //print out the default adoption status of the bird from the bird class
        System.out.println("The default bird adoption status is : " + bird1.isAnimalAdopted());

        //print out a blank line to create space
        System.out.println("");

        //ask the user to update the bird adoption status
        System.out.println("Please set the bird adoption status as a boolean"
                + "type true if the bird has been adopted"
                + "type false if the bird hasnt been adopted");

        //update the bird adoption status
        bird1.setAnimalAdopted(sc.nextBoolean());

        //print out the new adoption status of the bird from the bird class
        System.out.println("The updated bird adoption status is : " + bird1.isAnimalAdopted());

        //print out a blank line to create space
        System.out.println("");

        //print out the default bird fed status of the bird from the bird class
        System.out.println("The default bird fed status is : " + bird1.isAnimalFed());

        //print out a blank line to create space
        System.out.println("");

        //ask the user to set the bird fed status
        System.out.println("Please set the bird fed status as a boolean"
                + "type true if the bird has recently been fed"
                + "type false if the bird hasnt been recently fed");

        //update the bird fed status
        bird1.setAnimalFed(sc.nextBoolean());

        //print out the new bird fed status of the bird from the bird class
        System.out.println("The updated bird fed status is : " + bird1.isAnimalFed());

        //print out a blank line to create space
        System.out.println("");

        //print out the default bird price of the bird from the bird class
        System.out.println("The default bird price is : " + bird1.getAnimalPrice() + " dollars");

        //print out a blank line to create space
        System.out.println("");

        //ask the user to update the bird price
        System.out.println("Please set the bird price as a double");

        //update the bird price
        bird1.setAnimalPrice(sc.nextDouble());

        //print out the new bird price of the bird from the bird class
        System.out.println("The updated bird price is : " + bird1.getAnimalPrice() + " dollars");

        //print out a blank line to create space
        System.out.println("");

        //print out the default bird talked to status from the bird class
        System.out.println("The default bird talked to status is : " + bird1.isBirdTalkedTo());

        //print out a blank line to create space
        System.out.println("");

        //ask the user to update the bird talked to status
        System.out.println("Please set the bird talked to status as a boolean"
                + "type true if you recently talked to the bird"
                + "type false if the bird hasnt been talked to recently");

        //update the bird talked to status
        bird1.setBirdTalkedTo(sc.nextBoolean());

        //print out the new bird talked to status from the bird class
        System.out.println("The updated bird talked to status is : " + bird1.isBirdTalkedTo());

        //print out a blank line to create space
        System.out.println("");

        //end of testing out bird class getter and setters
        System.out.println("This is the end of the testing of each bird getter and setter method in the Bird Class which extends the Animal Class");

        //print out a blank line to create space
        System.out.println("");
} // end of run bird program

}// end of pet shelter test harness class


//remmeber to do bird talked to
