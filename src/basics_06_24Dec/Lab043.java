package src.basics_06_24Dec;

public class Lab043 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};

        System.out.println(arr1==arr2);

        int[] arr3 = arr1;
        System.out.println(arr1==arr3);

         arr1[3] = 10;
        System.out.println(arr3[3]);
    }
}
