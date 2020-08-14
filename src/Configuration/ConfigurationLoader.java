package Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ConfigurationLoader {
    public static void Load() throws IOException, ClassNotFoundException {
        FileInputStream fi = new FileInputStream("data/data.dat");
        ObjectInputStream is = new ObjectInputStream(fi);
        CustomConfiguration configuration = (CustomConfiguration) is.readObject();
        is.close();
        fi.close();
        for (int i = 1; i < 6; i++){
            Internals.Check(configuration, i);
        }
        System.out.println("Success!");
    }

    public static String GetValue(CustomConfiguration configuration, int index){
        switch (index){
            case 1:
                return configuration.data.get("Parameter_1");
            case 2:
                return configuration.data.get("Parameter_1");
            case 3:
                return configuration.data.get("Parameter_1");
            case 4:
                return configuration.data.get("Parameter_1");
            case 5:
                return configuration.data.get("Parameter_1");
        }
        return null;
    }
}
