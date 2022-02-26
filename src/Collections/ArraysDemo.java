package Collections;

import java.util.Arrays;
import java.util.List;

class Student{
    int rollno;
    String name, address;

    public Student(int rollno, String name,
                   String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
    public String toString()
    {
        return this.rollno + " "
                + this.name + " "
                + this.address;
    }
}
public class ArraysDemo {

    public static void main(String[] args) {

        //Create an array:
        int intArr[] = {1, 20, 35, 4, 5, 16, 7, 8};

        //convert aaray to the list:
        System.out.println("Integer array as a list: " + Arrays.asList(intArr));

        //Sorting:
        Arrays.sort(intArr);

        //printing:
        for (int i = 0; i < intArr.length; i++){
            System.out.println(intArr[i]);
        }
        //binarySearch() : search for a specified element in the array
        int element = 16;
        System.out.println(element + " found at index = " + Arrays.binarySearch(intArr, element));
        //binarySearch(array, fromIndex, toIndex, key, Comparator)
        System.out.println("35 found at index = " + Arrays.binarySearch(intArr,0, 4, 35));

        //Comparing to arrays :
        int intArr1[] = {10, 2, 1, 22, 35};
        int intArr2[] = {10, 15, 22};
        System.out.println("Comparison the two arrays: " + Arrays.compare(intArr1, intArr2));

        //Copy an array to another array:
        System.out.println("new Array: " + Arrays.toString(Arrays.copyOf(intArr2, 6)));

        //Copy a specific range form an array:
        System.out.println("int array: " + Arrays.toString(Arrays.copyOfRange(intArr1, 0, 2)));

        //Comparason using equals():
        System.out.println("Comparison: " + Arrays.equals(intArr1, intArr2));

        //filling an array with specific values:
        Arrays.fill(intArr, 0);
        System.out.println(Arrays.toString(intArr));

        //Sorting an array using parallelSort:
        Arrays.parallelSort(intArr1);
        System.out.println(Arrays.toString(intArr1));

        //Sorting a specific range from the array:
        int[] arr = {30,25,1,100,6,1,2};
        Arrays.sort(arr, 0, 3);
        System.out.println(Arrays.toString(arr));

        //sort() using comparator:
        Student students[] = {new Student(100, "oussama", "paris"),
                                new Student(200, "ensa", "khouribga"),
                                new Student(130, "ensa", "kenitra")};
        //printing elements:
        for (int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }
        //sorting elements:
        Arrays.sort(students, 0, 3, (a, b) -> a.rollno - b.rollno);// we can use it with fromIndex and toIndex or not
        //printing elements:
        System.out.println("After sorting: ");
        for (int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }
        //spliterator(arrayn , ind, ind) ==> a normal sort

    }
}
