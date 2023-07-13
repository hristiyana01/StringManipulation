import java.util.Arrays;

public class StringManipulationExam {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("fijjijjSEPifjijSEPfkeofkofkoSEPkddeok", "SEP")));

    }
    public static String[] solution(String S, String T) {
        // Implement your solution here
        String[] array = S.split(T);
        int size = array.length;
        String[] resultArray = new String[3];
        resultArray[0] = String.valueOf(size);
        resultArray[1] = array[0];
        //String strArray = Arrays.stream(array).spliterator(" ").toString();
        StringBuffer sb = new StringBuffer();
         Arrays.sort(Arrays.copyOfRange(array,1,array.length-1));
        //sb.append()
        for (int i = 1; i <= array.length - 1; i++) {
            sb.append(array[i]);
        }
        resultArray[2] = sb.toString().replaceAll(" ", "");

        return resultArray;
    }
}
