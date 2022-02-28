import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //ArrayList that contains all info from the csv file
        ArrayList<ZipCodeInfo> listOfZipCodeCity = new ArrayList<ZipCodeInfo>(FileReader.getZipCodeInfo());

        //Prints the instructions to the user
        System.out.println("Type in the zip code of the city you want to find: ");

        //An interger variable that keeps the user input
        int userInput = integerInput();

        //A for loop that cycles through the array
        for (int i = 0; i < listOfZipCodeCity.size(); i++) {

            //An if statement that prints the city if the user input corresponds with a zip code in the arraylist
            if (listOfZipCodeCity.get(i).getZipCode() == userInput) {
                System.out.println("Found info -> " + listOfZipCodeCity.get(i));
            }

        }


    }

    //A method that circumvents the scanner bug that can happen when you use the scanners .nextInt() method
    public static int integerInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
