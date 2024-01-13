package br.com.treinaweb.javaOOP.main;
import br.com.treinaweb.javaOOP.classes.cat;
import br.com.treinaweb.javaOOP.classes.dog;
import java.util.Scanner;
public class main {
	private static boolean hasEnded = false;
	protected static boolean takeCarePet = true;
	
	public  static void main(String[] args) {
		// TODO Auto-generated method stub

		// initiate the simple prompt to make the user interact with the pet;
		
		do{
			System.out.println("Choose which animal do you want, a dog or a cat?");
			Scanner objAnimalOption = new Scanner (System.in);
			Scanner objLeaveCondition = new Scanner (System.in);
			Scanner objActionCondition = new Scanner(System.in);
			String animalOption = objAnimalOption.nextLine();
			   if(animalOption.toUpperCase().equals(dog.getTypeAnimal().toUpperCase())) {
				  System.out.println("Congratulations, you've chosen a dog!");
				  dog objDog = new dog();
				  do {
					 showChoicesMain();
					 String actionCondition = objActionCondition.nextLine();
					 doActionMainDog(actionCondition, objDog);
				  }while(takeCarePet);
			  }else if (animalOption.toUpperCase().equals(cat.getTypeAnimal().toUpperCase())){
				  System.out.println("Congrulations, you've chosen a cat!");
				  cat objCat = new cat();
				   boolean takeCarePet = true;
				  
				  do {
					  showChoicesMain();
					  String actionCondition = objActionCondition.nextLine();
					  doActionMainCat(actionCondition, objCat);
					  
				  }while(takeCarePet);
			  }
			  else {
				    System.out.println("You've chosen a wrong alternative! Please, try again! ");
				    System.out.println("Would you like to play again? [y/N]");
				    String leaveCondition = objLeaveCondition.nextLine();
				    switch(leaveCondition) {
				  		case "y":
				  		case "Y":
				  			hasEnded = false;
				  			break;
				  		case "n":
				  		case "N":
				  			hasEnded = true;
				  			objLeaveCondition.close();
				  		default:
				  			System.out.println("Since you've placed something random, the program will be ending!");
				  			hasEnded = true;
				  			objLeaveCondition.close();
				    }
				  
			  }
	
		}while(!hasEnded);
		
		
	}
	public static void showChoicesMain(){
		  System.out.println("You've a few interactions to do with you pet!");
		  System.out.println("1. Name it;");
		  System.out.println("2. Feed it;");
		  System.out.println("3. Walk it;");
		  System.out.println("4. Attribute an age to it;");
		  System.out.println("5. Attribute a personality to it;");
		  System.out.println("6. Check the info about the pet;");
		  System.out.println("7. Leave the game;");
		  System.out.print("Your choice: ");
	}
	public static void doActionMainDog(String action, dog objDog) {
		switch(action) {
		 	case "1":
		 		System.out.print("Insert the name of the dog: ");
		 		Scanner objSetNameDog = new Scanner (System.in);
		 		Scanner objConfirmName = new Scanner(System.in);
		 		objDog.setName(objSetNameDog.nextLine());
		 		System.out.println(String.format("The name of the dog is: %s! Congratulations ", objDog.getName()));
		 		System.out.println("Are you sure, that is the name that you want for your dog? ");
		 		System.out.println("After, it's confirmed, you won't be able to change it");
		 		System.out.print(String.format("Still name your dog %s [y/N]?", objDog.getName()));
		 		
		 		String confirmName = objConfirmName.nextLine();
		 		do {
		 			if (confirmName.toUpperCase().equals("Y")) {
		 				return;
		 			}
		 			else if(confirmName.toUpperCase().equals("N")) {
		 				objDog.setName("");
		 			}
		 			else {
		 				System.out.println(" \n You've made a wrong choice! Insert [y/N]");
		 				confirmName = objConfirmName.nextLine();
		 				
		 			}
		 		} while(!(confirmName.toUpperCase().equals("Y")) || !(confirmName.toUpperCase().equals("N")));
		 		break;
		 	case "2":
		 		System.out.println("Insert the amount of food that you'd like to feed your pet: ");
		 		Scanner objSetAmountFood = new Scanner (System.in);
		 		objDog.insertFood(objSetAmountFood.nextFloat());
		 		System.out.println(objDog.getAmountFood());
		 		break;
		 	case "3":
		 		System.out.println("Insert the amount of steps that you'd like to do with your pet. (it's possible to walk backwards too");
		 		Scanner objSetAmountSteps = new Scanner (System.in);
		 		objDog.insertSteps(objSetAmountSteps.nextInt());
		 		break;
		 	case "4":
		 		System.out.println("Insert the age of your dog (only full integer numbers): ");
		 		Scanner objSetAgeDog = new Scanner (System.in);
		 		Scanner objConfirmAge = new Scanner(System.in);
		 		objDog.setAge(objSetAgeDog.nextInt());
		 		System.out.println(String.format("The age of the dog is: %d! Congratulations ", objDog.getAge()));
		 		System.out.println("Are you sure, that is that the age that you want for your dog? ");
		 		System.out.println("After, it's confirmed, you won't be able to change it");
		 		System.out.println(String.format("Still age your dog %d [y/N]?", objDog.getAge()));
		 		String confirmAge = objConfirmAge.nextLine();
		 		do {
		 			
		 			if (confirmAge.toUpperCase().equals("Y")) {
		 				return;
		 			}
		 			else if(confirmAge.toUpperCase().equals("N")) {
		 				objDog.setAge(0);
		 			}
		 			else {
		 				System.out.println("You've made a wrong choice! Insert [y/N]");
		 				confirmAge = objConfirmAge.nextLine();
		 			}
		 		} while(!confirmAge.toUpperCase().equals("Y") || !confirmAge.toUpperCase().equals("N"));
		 		break;
		 	case "5":
		 		System.out.println("Insert the personality of your dog:");
		 		Scanner objSetPersonalityDog = new Scanner(System.in);
		 		objDog.setPersonality(objSetPersonalityDog.nextLine());
		 		break;
		 	case "6":
		 		Scanner objLeaveInfo = new Scanner(System.in);
		 		System.out.println(String.format("Pet's name of the pet: %s ", objDog.getNickname()));
		 		System.out.println(String.format("The age of the pet: %s ", objDog.getAge()));
		 		System.out.println(String.format("The personality of the pet is: %s", objDog.getPersonality()));
		 		System.out.println(String.format("The amount of food you've fed your pet is: %f", objDog.getAmountFood()));
		 		System.out.println(String.format("You've walked %s steps with your pet! ", objDog.getSteps()));
		 		System.out.println("When you'd like to leave the prompt, press Y");
		 		String confirmLeaveInfo = objLeaveInfo.nextLine();
		 		do {
		 			
		 			if (confirmLeaveInfo.toUpperCase().equals("Y")) {
		 				return;
		 			}
		 			else {
		 				System.out.println("You've made a wrong choice! Press [Y] and then enter!");
		 				confirmLeaveInfo = objLeaveInfo.nextLine();
		 			}
		 		} while(!confirmLeaveInfo.toUpperCase().equals("Y"));
		 		break;
		 	case "7":
		 		takeCarePet = false;
		 		hasEnded = true;
		 		break;
		 	default:
		 		
		}

	}
	public static void doActionMainCat(String action, cat objCat) {
		switch(action) {
		 	case "1":
		 		System.out.print("Insert the name of the dog: ");
		 		Scanner objSetNameCat = new Scanner (System.in);
		 		Scanner objConfirmName = new Scanner(System.in);
		 		objCat.setName(objSetNameCat.nextLine());
		 		System.out.println(String.format("The name of the dog is: %s! Congratulations ", objCat.getName()));
		 		System.out.println("Are you sure, that is the name that you want for your dog? ");
		 		System.out.println("After, it's confirmed, you won't be able to change it");
		 		System.out.println(String.format("Still name your dog %s [y/N]?", objCat.getName()));
		 		
		 		String confirmName = objConfirmName.nextLine();
		 		do {
		 			if (confirmName.toUpperCase().equals("Y")) {
		 				return;
		 			}
		 			else if(confirmName.toUpperCase().equals("N")) {
		 				objCat.setName("");
		 			}
		 			else {
		 				System.out.println("You've made a wrong choice! Insert [y/N]");
		 			}
		 		} while(!confirmName.toUpperCase().equals("Y") || !confirmName.toUpperCase().equals("N"));
		 		break;
		 	case "2":
		 		System.out.print("Insert the amount of food that you'd like to feed your pet: ");
		 		Scanner objSetAmountFood = new Scanner (System.in);
		 		objCat.insertFood(objSetAmountFood.nextFloat());
		 		break;
		 	case "3":
		 		break;
		 	case "4":
		 		break;
		 	case "5":
		 		break;
		 	case "6":
		 		break;
		 	case "7":
		 		Scanner objLeaveInfo = new Scanner(System.in);
		 		System.out.println(String.format("Pet's name: %s  ", objCat.getName()));
		 		System.out.println(String.format("Type of the pet: %s  ", objCat.getTypeAnimal()));
		 		System.out.println(String.format("Nick name of the pet: %s ", objCat.getNickname()));
		 		System.out.println(String.format("The age of the pet: %s ", objCat.getAge()));
		 		System.out.println(String.format("The personality of the pet is: %s", objCat.getPersonality()));
		 		System.out.println(String.format("The amount of food you've fed your pet is: ", objCat.getAmountFood()));
		 		System.out.println(String.format("You've walked %s steps with your pet! ", objCat.getSteps()));
		 		
		 		
		 		break;
		 		
		 		
		}

	}

}
