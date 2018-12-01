package orderLite;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class OrderLiteApp {

	public static void main(String[] args) {
		//new MenuGUI();
		OrderLiteApp o = new OrderLiteApp();
		o.readInFoods();
	}

	public void readInFoods() {
		//The csv File being read into the system
        String csvFile = "resources/FoodOrder.csv";
        //The current line being read in
        String line;
        //The csv file is being split by the comma
        String csvSplitBy = ",";
        //the food items will be placed into this arraylist
        ArrayList<Food> foods = new ArrayList<Food>();

        //creating a FileReader that will read in the csv File. The bufferedreader scans through the filereader.
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
        	//While there is a line to read, it reads in the line.
            while ((line = br.readLine()) != null) {
            	//The string objects are then each placed into a String array
                String[] foodDescription = line.split(csvSplitBy);
                //the string array is used to create a food object by taking the 5 strings in each line and placing them in their respective spots
                foods.add(new Food(foodDescription[0], foodDescription[1], foodDescription[2], foodDescription[3], foodDescription[4]));
            }
         //catches IOException
        } catch (IOException e) {
            e.printStackTrace();
        }
        //prints out the foods to prove it works.
        for (Food f : foods) {
        	System.out.println(f);
        }
    }
}
