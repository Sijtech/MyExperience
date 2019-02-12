package GsonEx;

import com.google.gson.JsonObject;

public class GsonEx {
	public static void main(String[] args) {
        //run the following function
		changeValueOfJson();
    }
    /**
     * change the value of a key element
     * @author Joel
     */
    public static void changeValueOfJson() {
    	//initialize the variables
    	JsonObject result = new JsonObject();
    	String res;
    	//add a json key/value pair
		result.addProperty("result", "ok");
		System.out.println(result.toString());
		//change the value of the json key
		result.addProperty("result", "noo");
		System.out.println(result.toString());
		//get the value as a string
		res = result.get("result").getAsString();
		System.out.println(res);
    }
}
