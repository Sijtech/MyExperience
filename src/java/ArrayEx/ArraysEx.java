package ArrayEx;
import java.util.Arrays;
import java.util.ArrayList;
public class ArraysEx {
    
    public static void main(String[] args) {
        //reorderArray();
        stringArrayAddNull();
    }
    public static String stringArrayAddNull() {
        String[] myArray = {"Apple", "Banana"};
        System.out.println(Arrays.toString(myArray));
        myArray[1] = null;
        System.out.println(Arrays.toString(myArray));
        return "Ok";
    }
    public static String reorderArray() {
        String[] myArray = {"joeqwerlie", null, null, "Durian"};
        ArrayList<String> regroupArray = new ArrayList<String>();
        System.out.println(Arrays.toString(myArray));
        for(String i: myArray) {
            //System.out.println(i);
            if(i != null) {
                regroupArray.add(i);
            }
        }
        myArray = regroupArray.toArray(new String[4]);
        System.out.println(Arrays.toString(myArray));
        return "OK";
    }
}
