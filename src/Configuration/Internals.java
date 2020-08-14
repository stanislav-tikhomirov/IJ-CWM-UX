package Configuration;

public class Internals {

    public static String GetConfigurationId(int index) {
        switch (index){
            case 1:
                return "bh73df87";
            case 2:
                return "Hfdka738";
            case 3:
                return "fy7a8u8f";
            case 4:
                return "dsfiyasf";
            case 5:
                return "f6uad6t4";
            default:
                return null;
        }
    }

    public static void Check(CustomConfiguration configuration, int index){
        CustomString.Compare(ConfigurationLoader.GetValue(configuration, index), index);
    }
}
