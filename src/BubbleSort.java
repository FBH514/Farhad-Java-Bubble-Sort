import java.util.Arrays;

public class BubbleSort {

    public static int[] randomArray(int length){
        int[] arr = new int[length];                        // instantiates an array of length parameter
        for(int count = 0; count < arr.length; count++){    // loop through the array
            arr[count] = (int) (Math.random() * 100);       // assigns a random number to each array index
        }
        return arr;
    }

    public static void sortArray(int[] arr){
        /* An outer loop leads iteration over the array while a nested loop, trails behind
        * so that comparison is made between the leading and trailing values. When the trailing value is
        * higher than the leading value, the placeholder reference is assigned to the trailing value so that
        * it may be swapped with the leading value.
        * Process is repeated until the array is sorted, ascendingly in this case */
        int placeholder;
        for(int outer = 0; outer < arr.length; outer++){    // outer loop takes the lead
            for(int inner = 0; inner < outer; inner++){     // inner loop trails against the outer loop
                if(arr[inner] > arr[outer]){                // is the trailing value larger than the leading value?
                    placeholder = arr[outer];               // if true save the smallest value for later
                    arr[outer] = arr[inner];                // swap the smaller leading value at trailing position
                    arr[inner] = placeholder;               // swap the larger trailing value at leading position
                }
            }
        }
    }

    public static void printArray(int[] arr){
        String parsedArray = Arrays.toString(arr);          // converts the array to a string
        System.out.println(parsedArray);
    }

    public static void main(String[] args) {
        try{
            if(Integer.parseInt(args[0]) <= 0){             // checks if the first argument is a positive integer
                System.out.println("Please enter a positive integer as a command line argument.");
                return;
            }
            int argument = Integer.parseInt(args[0]);       // converts the first argument to an integer
            int[] arr = randomArray(argument);              // instantiates an array of argument length
            sortArray(arr);                                 // calls the sortArray method
            printArray(arr);                                // calls the printArray method
        }
        catch (NumberFormatException | ArrayIndexOutOfBoundsException e){
            /* NumberFormatException is caught when input isn't an Integer.
            * ArrayIndexOutOfBoundsExceptions is caught when input is empty. */
            System.out.println("Please enter a positive integer as a command line argument.");
        }
    }
}


