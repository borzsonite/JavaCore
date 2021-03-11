package BaseJava.Lesson11.Sandbox;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AlwaysSafePublished {
    private final Map map = new HashMap();

    public AlwaysSafePublished() {
        Collection c = new ArrayList();
        c.add("a");
        c.add("A");
        map.put("1", c.size());
    }

    public int number(){
        return (int) map.get("1");
    }
}
