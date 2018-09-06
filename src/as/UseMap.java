package as;

import java.util.HashMap;
import java.util.Map;




public class UseMap {


    public static void main(String[] args) {
        Map<String, String> cityNcountry = new HashMap<String, String>();
        cityNcountry.put("USA", "ny");
        cityNcountry.put("mexi", "sonora");
        cityNcountry.put("Uk", "london");
        cityNcountry.put("canada", "Mentreal");

        for (Map.Entry<String, String> state : cityNcountry.entrySet()) {

            System.out.println(state.getKey() + " " + state.getValue());
        }

    }

}







