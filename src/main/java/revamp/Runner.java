package revamp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
//import org.openqa.selenium.*;

public class Runner {

    //private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Runner.class);

    public static void main(String[] args) {
        System.out.println("Runner class week 6; need build in pom.xml or none runs");
        //Oct 23 ARL
       // ChromeOptions options = new ChromeOptions();
        Sept18 obj = new Sept18();
        obj.setNumInA(11);
        //System.out.println(obj.numInA+obj.StrInB);
        System.out.println(obj.getNumInA("TEeK"));

        List<String> testList = new ArrayList<>();
        testList.add("today is 19th");
        testList.add("week 6 on IntelliJ");
        ArrayList<Object> temp = new ArrayList<>();
        temp.add("upcasting");
        temp.add("inheritance");
        printItems(temp);
        // you are given a string, return the count of constant chars
        System.out.println(Sept5.getConstantCharCounting(testList.get(1)));
        // same method as defined here at bottom
    }
public static void printItems(Collection<Object> i) {
    for (Object o : i) {
        System.out.println(o);
    }
}
    public static int getConstantCharCounting(String str) {
        String sttr = str.toUpperCase();
        if(str.contains(sttr)) {
            return str.length()+1;
        }
        return str.length();
    }

}
