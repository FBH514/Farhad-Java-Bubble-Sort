import java.util.Arrays;

public class SortingIntegers {

    public static int[] randomArray(int length){
        int[] arr = new int[length];
        for(int count = 0; count < arr.length; count++){
            int x = (int) (Math.random() * 100);            // casting narrows the range of the random number
            arr[count] = x;
        }
        return arr;
    }

    public static int[] sortArray(int[] arr){
        for(int outer = 0; outer < arr.length; outer++){    // outer loop takes the lead
            for(int inner = 0; inner < outer; inner++){     // inner loop trails against the outer loop
                if(arr[inner] > arr[outer]){                // is the trailing value larger than the leading value?
                    int placeholder = arr[outer];           // if true save the smallest value for later
                    arr[outer] = arr[inner];                // swap the smaller leading value at trailing position
                    arr[inner] = placeholder;               // swap the larger trailing value at leading position
                }
            }
        }
        return arr;
    }

    public static void printArray(int length){
        String arr = Arrays.toString(sortArray(randomArray(length)));   // convert the array to a string
        System.out.println(arr);
    }

    public static void main(String[] args) {
        printArray(Integer.parseInt(args[0]));      // pass the length of the array as a command line argument
    }
}


