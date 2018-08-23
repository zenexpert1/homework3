package HomeWork3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class TelephoneDirectory {

    private Map<String, ArrayList<Integer>> td;

    TelephoneDirectory(){
        td = new HashMap<>();
    }

    public Map<String, ArrayList<Integer>> GetAll() {
        return td;
    }

    public ArrayList<Integer> Get(String surname){
        return td.get(surname);
    }

    public void Add(String surname, int... phones) {
        if(td.containsKey(surname))
            for (int phone: phones)
                td.get(surname).add(phone);
        else{
            ArrayList<Integer> phonesArray = new ArrayList<>();
            for (int phone: phones)
                phonesArray.add(phone);
            this.td.put(surname,phonesArray);
        }
    }
}
