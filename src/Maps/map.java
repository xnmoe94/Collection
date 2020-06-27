package Maps;

import java.util.HashMap;
import java.util.Map;

public class map {

    public static void main(String[] args) {
        java.util.Map<String, String> language = new HashMap<>();
        language.put("Java", "a complied high Level, object-oriented, platform independent language");
        language.put("Python", "an interrupted, object oriented, high level programming Language with dyamic semantics");
        language.put("Algol", "an algorithmic laguage");
        language.put("Basics", "Beginner All puropose Symobolic Instruction Code");
        language.put("Lisp", "Therein lies madness");



        for (String key : language.keySet()){
            System.out.println(key + " : " + language.get(key));
        }

        for (String value : language.keySet()){
            System.out.println(value);

        }


    }


}


