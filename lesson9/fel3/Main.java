import java.util.ArrayList;

public class Main { 
    public static ArrayList<String> getStrSameBeginningAndEnding(ArrayList<String> data) {
        ArrayList<String> result = new ArrayList<>();
        for (String elem : data) {
            int len = elem.length();
            if (len > 0 && elem.charAt(0) == elem.charAt(len-1)) {
                result.add(elem);
            }
        }
        return result;
    }

    public static void removeStrDifferBeginningAndEnding(ArrayList<String> data) {
        // (param1, param2, ... , param_n) -> { System.out.println(""); return param1 + param2; }
        data.removeIf(elem -> (elem.length() <= 0 || elem.charAt(0) == elem.charAt(elem.length()-1)));
    }
    
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("c++");
        list.add("ada");
        list.add("");
        list.add("hello olleh");

        System.out.println(list);
        System.out.println(getStrSameBeginningAndEnding(list));
        removeStrDifferBeginningAndEnding(list);
        System.out.println(list);
    }
}