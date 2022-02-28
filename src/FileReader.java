import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    //A method that takes the info in the csv file and puts it into an arraylist
    public static ArrayList<ZipCodeInfo> getZipCodeInfo() {
        ArrayList<ZipCodeInfo> zipCodeList = new ArrayList<ZipCodeInfo>();

        //Takes the file from "Resources/zipCode.csv"
        File zipCodeFile = new File("Resources/zipCode.csv");
        //Try catch to circumvent the FileNotFoundException
        try {
            //Scans the file
            Scanner sc = new Scanner(zipCodeFile);
            sc.nextLine();
            //While loop to split the strings apart to put them into the ZipCodeInfo object
            while (sc.hasNextLine()) {
                String zipCodeDetails = sc.nextLine();
                String[] stringAsArray = zipCodeDetails.split(";");
                //Parse the string to an integer so it can be used as an integer
                int zipCode = Integer.parseInt(stringAsArray[0]);
                String city = stringAsArray[1];

                //Put into a ZipCodeInfo object
                ZipCodeInfo zipInfo = new ZipCodeInfo(zipCode,city);
                //Put into the arraylist
                zipCodeList.add(zipInfo);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //The arraylist is sent back to whatever called the method
        return zipCodeList;
    }


}
