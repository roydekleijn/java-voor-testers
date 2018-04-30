package oefeningen;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EersteClass {

    @Test
    public void map() {
        Map map = new HashMap<>();
        map.put(1, "eerste");
        map.put(1,"tweede");
        map.put(2, "derde");

        System.out.println(map.get(2));

        List<String> list = new ArrayList<String>();
        list.add("eerste string");
        list.add("tweede string");

        for(int i = 0; i < list.size(); i++) {

        }

        for (String item: list) {
            System.out.println(item);
        }

        System.out.println(list.get(1));
    }
}
