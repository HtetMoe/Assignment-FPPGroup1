import java.util.Arrays;

public class problem4 {
    public static void main(String[] args) {
        String[] iarr = new String[]{"horse", "dog", "cat", "horse", "dog"};
        System.out.println(Arrays.toString(removeRepeat(iarr)));
    }
    public static String[] removeRepeat(String[] input){
        //StringBuilder sb = new StringBuilder();
        String[] result = new String[input.length];
        boolean repeat = false;
        int arrCnt = 0;
        for(int i = 0; i < input.length; i++){
            for(int j = 0; j < input.length; j++){
                if(input[i].equals(result[j])){
                    repeat = true;
                    break;
                }
            }
            if(!repeat){
                result[arrCnt++] = input[i];
            }
        }

        String[] ret = new String[arrCnt];
        for(int i = 0; i < arrCnt; i++){
            ret[i] = result[i];
        }
        return ret;
<<<<<<< HEAD
        
=======

>>>>>>> 8fdb736e28b72efae30c467ac3dcac7e61b0dd13
    }
}
