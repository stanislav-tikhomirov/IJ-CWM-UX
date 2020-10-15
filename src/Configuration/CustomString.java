package Configuration;

import Assertion.Assert;

public class CustomString {
    public static String ToCustomString(String input) {
        byte[] bytes = input.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            bytes[i]++;
        }
        return new String(bytes);
    }

    public static String FromCustomString(String value) {
        byte[] bytes = value.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            bytes[i]--;
        }
        return new String(bytes);
    }

    public static void Compare(String custom, int index){
        Assert.that(CustomString.FromCustomString(custom).equals(Internals.GetConfigurationId(index)),
                String.format( "Wrong value, should be '%s', but it is '%s'",
                        Internals.GetConfigurationId(index),
                        CustomString.FromCustomString(custom)));
    }
}
