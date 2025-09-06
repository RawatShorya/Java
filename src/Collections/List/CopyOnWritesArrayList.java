package Collections.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWritesArrayList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collection<String> list1 = Collections.synchronizedCollection(list);
    }
}
