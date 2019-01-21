package guiTester;

//hello people, this is my altered comment
// hello

//this one want to include into merging
//this one no!!!

import java.util.Scanner;
import java.util.Random;
public class WoolFactory{
  //The provided code generates random ages for sheep, and picks random names from the below array
  //You can modify this list of names as you wish (add/remove/replace elements).
  private static String[] namesForSheep = {"Cerdic","Cynric","Ceawlin","Ceol","Ceolwulf","Cynegils",
    "Cenwalh","Seaxburh","Aescwine","Centwine","Ceadwalla","Ine","Aethelheard","Cuthred","Cynewulf",
    "Berhtric","Egbert","Aethelwulf","Aethelbald","Aethelberht","Aethelred","Hengest","Aesc","Octa",
    "Eormenric","Aethelbert I","Eadbald","Earconbert","Egbert I","Hlothere","Oswine","Wihtred",
    "Aethelbert II","Sigered","Egbert II","Eadberht II","Cuthred","Baldred","Aethelfrith","Edwin","St. Oswald",
    "Oswiu","Ecgfrith","Aldfrith","Osred I","Cenred","Osric","Ceolwulf","Eadberht",
    "Aethelwald","Alhred","Aethelred I","Aelfwald I","Eardwulf","Eanred","George V","Edward VIII",
    "George VI","Elizabeth II"};
  private static Random r = new Random(123);
  
  //returns a random String from the above array. 
  private static String getRandomName(){
    int index = r.nextInt(namesForSheep.length);
    return namesForSheep[index];
  }
  //returns a random age for a sheep from 1 to 10
  private static int getRandomAge(){
    return r.nextInt(10)+1;
  }
  //End of provided name/age generation code. 
  
  public static void main(String[] args){
    //Student Name:
    //Student Number:
    //Your code goes here.
    Scanner input = new Scanner(System.in); //initializes a scanner
    System.out.println("Please enter a name for desired farm.");
    String farmName = input.nextLine(); //sets the name of the farm
    System.out.println("Please enter a name for desired dog.");
    String dogName = input.nextLine(); //sets the name of the dog
    System.out.println("Please enter a breed for desired dog.");
    String dogBreed = input.nextLine(); //sets the breed of the dog
    System.out.println("Please enter the number of sheep.");
    int sheepNum = input.nextInt(); //sets the number of sheep in the herd
    
    dog myDog = new dog(dogName, dogBreed); //constructs a new dog based on input
    
    sheep myHerd[] = new sheep[sheepNum]; //constructs a herd which is an array of sheep
    
    for(int i=0; i<sheepNum; i++){
    	sheep tempSheep = new sheep(getRandomName(), getRandomAge()); //generates a new sheep
    	myHerd[i] = tempSheep; //places the new sheep in the herd
    }
    
    farm myFarm = new farm(farmName, myDog, myHerd); //constructs a farm used input name, generated dog and generated herd
    
    double shearedWool = myFarm.getWool(); //shears the sheep on the farm
    System.out.println("Farm " + farmName + " has " + sheepNum + " sheep."); //displays the number of sheep
    myFarm.printFarm(); //prints the farm information
    double money = shearedWool * 1.45; //finds the total money from shearing the sheep
    System.out.println("Farm " + farmName + " made $" + money + " from their sheared wool."); //displays the profit of the farm
    
    input.close(); //closes the scanner
  }
}
