import java.util.Arrays;

public class StringArrayReversing {
    public static void main(String[] args) {
        String str = "dkdkdkd.dekfpefk.efpkepf";
        String[] array = str.split("\\.");
        String[] reversed = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length-1-i];
        }
        System.out.println(Arrays.toString(reversed));
    }

}
