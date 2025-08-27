package Collections;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Filter {
    public static void main(String[] args){
        List<String> list = new ArrayList<>(Arrays.asList("Red", "Blue", "Green"));
        CollectionUtils.filter(list, new Predicate<String>(){
            public boolean evaluate(String s){
                return s.length() > 4;
            }
        });
    System.out.println(list);
    }
}
