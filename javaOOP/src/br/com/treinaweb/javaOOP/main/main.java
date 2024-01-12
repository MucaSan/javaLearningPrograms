package br.com.treinaweb.javaOOP.main;
import br.com.treinaweb.javaOOP.classes.cat;
import br.com.treinaweb.javaOOP.classes.dog;
import java.util.Scanner;
public class main {
	private static boolean hasEnded = false;
	
	public  static void main(String[] args) {
		// TODO Auto-generated method stub

		// initiate the simple prompt to make the user interact with the pet;
		
		do{
			System.out.print("Choose which animal do you want, a dog or a cat?");
			Scanner objAnimalOption = new Scanner (System.in);
			Scanner objLeaveCondition = new Scanner (System.in);
			Scanner objActionCondition = new Scanner(System.in);
			String animalOption = objAnimalOption.nextLine();
			
			objAnimalOption.close();
			   if(animalOption.toUpperCase().equals(dog.getTypeAnimal())) {
				  System.out.println("Congratulations, you've chosen a dog!");
				  dog objDog = new dog();
				  boolean takeCarePet = true;
				  do {
					 showChoicesMain();
					 String actionCondition = objActionCondition.nextLine();
					 doActionMainDog(actionCondition, objDog);
				  }while(takeCarePet);
			  }else if (animalOption.toUpperCase().equals(cat.getTypeAnimal())){
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
	
		}while(hasEnded);
		
		
	}
	public static void showChoicesMain() {
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
		 		System.out.println(String.format("Still name your dog %s ?", objDog.getName()));
		 		
		 		
		 		break;
		 	case "2":
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
		 		break;
		 	
		 	default:
		 		
		}

	}
	public static void doActionMainCat(String action, cat objCat) {
		switch(action) {
		 	case "1":
		 		
		 		break;
		 	case "2":
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
		 		break;
		 	default:
		 		
		}

	}

}
