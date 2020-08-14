package Configuration;

import java.io.Serializable;
import java.util.Hashtable;

public class CustomConfiguration implements Serializable {
    public Hashtable<String, String> data = new Hashtable<>();
}
