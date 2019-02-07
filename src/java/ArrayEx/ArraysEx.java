package ArrayEx;
import java.util.Arrays;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import java.util.ArrayList;
public class ArraysEx {
    
    public static void main(String[] args) {
        //run the following function
//    	stringArrayAddNull();
//    	String[] myArray = {"Joe", null, null, "Fred"};
//    	String[] reorderedArray = reorderArray(myArray);
    	jsonArrayToStringList();
    }
    /**
     * transform a json Array to a ArrayList<String> and remove the unnecessaries quotes(")
     * @author Joel
     */
    public static void jsonArrayToStringList() {
    	//initialize the array
    	JsonArray zrIds = new JsonArray();
    	zrIds.add("pf_5_7127");
    	zrIds.add("137673");
    	ArrayList<String> ids = new ArrayList<String>();
    	for (JsonElement id : zrIds) {
    		ids.add(id.toString().replace("\"", ""));
    	}
        System.out.println(ids.get(0));
    }
    /**
     * In this example I checked, if I can add the value NULL to a string
     * array. Which indeed works.
     * @author Joel
     */
    public static void stringArrayAddNull() {
    	//initialize the array
        String[] myArray = {"Super", "Example", "Overwrite with null"};
        System.out.println(Arrays.toString(myArray));
        myArray[2] = null;
        System.out.println(Arrays.toString(myArray));
    }
    /**
     * I have a string array of four, which could include NULL values.
     * This function moves the NULL values to the end of the array.
     * @param myArray {String[]} - an array, where the NULL values
     * should be at the end.
     * @return string array, with the size of four. And if it contains
     * NULL values, they are at the end of the array.
     */
    public static String[] reorderArray(String[] myArray) {
    	//create and arraylist
        ArrayList<String> regroupArray = new ArrayList<String>();
        System.out.println(Arrays.toString(myArray));
        //each arrayValue
        for(String i: myArray) {
        	//if not null, add to the arraylist
            if(i != null) {
                regroupArray.add(i);
            }
        }
        //transform arraylist to string array with the size of four
        myArray = regroupArray.toArray(new String[4]);
        System.out.println(Arrays.toString(myArray));
        return myArray;
    }
}
