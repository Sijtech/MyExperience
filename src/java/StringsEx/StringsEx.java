package StringsEx;

public class StringsEx {
	public static void main(String[] args) {
        //run the following function
		addToStringBeginning();
    }
    /**
     * Verified, if the value "" of a string means it is empty.
     * @author Joel
     */
    public static void isStringEmpty() {
    	String isItEmpty = "";
        System.out.println(isItEmpty.isEmpty());
    }
    /**
     * add to the beginning of a string some text.
     * @author Joel
     */
    public static void addToStringBeginning() {
    	String toExtend = "is a test";
    	toExtend = "This "+toExtend;
        System.out.println(toExtend);
    }

}
