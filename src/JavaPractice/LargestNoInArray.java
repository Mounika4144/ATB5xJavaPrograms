package src.JavaPractice;

public class LargestNoInArray {

    public static void main(String[] args) {

        int[] arr = {2,15, 85, 30 , 589, 25, 10};

        int maxnumber = arr[0];

        for ( int i = 0; i < arr.length; i++) {
            if (arr[i] > maxnumber) {
                maxnumber = arr[i];
            }
        }

            System.out.println(" The Largest number in the array is " + maxnumber);


    }
}
