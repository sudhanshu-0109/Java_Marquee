package ArrayList;

import java.util.*;

public class ArrayListCompleteGuide {

    public static void main(String[] args) {

        /*************************************************************
         *                  ARRAYLIST DECLARATION
         *************************************************************/

        // Creates an empty ArrayList of Integer type.
        ArrayList<Integer> list = new ArrayList<>();

        // Creates ArrayList with initial capacity = 20
        ArrayList<Integer> capacityList = new ArrayList<>(20);

        // Creates ArrayList using another collection
        ArrayList<Integer> copyConstructor = new ArrayList<>(list);

        System.out.println("Initially: " + list);

        /*************************************************************
         *                      ADDING ELEMENTS
         *************************************************************/

        // add(element)
        // Adds element at the end
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        // add(index, element)
        // Inserts element at given position
        list.add(1, 15);

        System.out.println(list);

        /*************************************************************
         *                      ACCESS ELEMENT
         *************************************************************/

        // get(index)
        // Returns element at index

        System.out.println("First Element : " + list.get(0));

        System.out.println("Second Element : " + list.get(1));

        /*************************************************************
         *                     UPDATE ELEMENT
         *************************************************************/

        // set(index, value)
        // Replaces old value

        list.set(2, 100);

        System.out.println("After Update : " + list);

        /*************************************************************
         *                      REMOVE ELEMENT
         *************************************************************/

        // remove(index)

        list.remove(1);

        System.out.println("After remove(index): " + list);

        // remove(Object)
        // Removes first occurrence

        list.remove(Integer.valueOf(30));

        System.out.println("After remove(object): " + list);

        /*************************************************************
         *                     SEARCHING
         *************************************************************/

        list.add(100);
        list.add(200);
        list.add(100);

        System.out.println(list);

        // contains()
        System.out.println("Contains 100 : " + list.contains(100));

        // indexOf()
        System.out.println("First index of 100 : " + list.indexOf(100));

        // lastIndexOf()
        System.out.println("Last index of 100 : " + list.lastIndexOf(100));

        /*************************************************************
         *                        SIZE
         *************************************************************/

        System.out.println("Size : " + list.size());

        /*************************************************************
         *                      IS EMPTY
         *************************************************************/

        System.out.println("Is Empty : " + list.isEmpty());

        /*************************************************************
         *                      ITERATION
         *************************************************************/

        System.out.println("\nUsing Normal For Loop");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

        /*************************************************************/

        System.out.println("\nUsing Enhanced For Loop");

        for (Integer num : list) {
            System.out.print(num + " ");
        }

        System.out.println();

        /*************************************************************/

        System.out.println("\nUsing Iterator");

        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();

        /*************************************************************/

        System.out.println("\nUsing Lambda");

        list.forEach(x -> System.out.print(x + " "));

        System.out.println();

        /*************************************************************
         *                     SORTING
         *************************************************************/

        Collections.sort(list);

        System.out.println("\nSorted : " + list);

        /*************************************************************
         *                     REVERSE
         *************************************************************/

        Collections.reverse(list);

        System.out.println("Reverse : " + list);

        /*************************************************************
         *                     SHUFFLE
         *************************************************************/

        Collections.shuffle(list);

        System.out.println("Shuffle : " + list);

        /*************************************************************
         *                    MAX & MIN
         *************************************************************/

        System.out.println("Maximum : " + Collections.max(list));

        System.out.println("Minimum : " + Collections.min(list));

        /*************************************************************
         *                      CLONE
         *************************************************************/

        ArrayList<Integer> cloned =
                (ArrayList<Integer>) list.clone();

        System.out.println("Cloned : " + cloned);

        /*************************************************************
         *                    ADD ALL
         *************************************************************/

        ArrayList<Integer> another = new ArrayList<>();

        another.add(500);
        another.add(600);

        list.addAll(another);

        System.out.println(list);

        /*************************************************************
         *                 INSERT COLLECTION
         *************************************************************/

        ArrayList<Integer> temp = new ArrayList<>();

        temp.add(1000);
        temp.add(2000);

        list.addAll(2, temp);

        System.out.println(list);

        /*************************************************************
         *                    REMOVE ALL
         *************************************************************/

        list.removeAll(temp);

        System.out.println(list);

        /*************************************************************
         *                     RETAIN ALL
         *************************************************************/

        ArrayList<Integer> common = new ArrayList<>();

        common.add(100);
        common.add(500);

        list.retainAll(common);

        System.out.println(list);

        /*************************************************************
         *                      CLEAR
         *************************************************************/

        list.clear();

        System.out.println("After Clear : " + list);

        System.out.println("Empty : " + list.isEmpty());

        /*************************************************************
         *                ARRAY TO ARRAYLIST
         *************************************************************/

        Integer arr[] = {1,2,3,4,5};

        ArrayList<Integer> arrList =
                new ArrayList<>(Arrays.asList(arr));

        System.out.println(arrList);

        /*************************************************************
         *               ARRAYLIST TO ARRAY
         *************************************************************/

        Integer newArray[] = arrList.toArray(new Integer[0]);

        System.out.println(Arrays.toString(newArray));

        /*************************************************************
         *                  LIST OF LIST
         *************************************************************/

        // Think of it like a matrix.

        List<List<Integer>> matrix = new ArrayList<>();

        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);

        List<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);

        List<Integer> row3 = new ArrayList<>();
        row3.add(7);
        row3.add(8);
        row3.add(9);

        // Add rows into matrix
        matrix.add(row1);
        matrix.add(row2);
        matrix.add(row3);

        System.out.println("\nMatrix");

        System.out.println(matrix);

        /*************************************************************
         *              ACCESSING LIST OF LIST
         *************************************************************/

        System.out.println("matrix[1][2] = " + matrix.get(1).get(2));

        /*************************************************************
         *             PRINT MATRIX USING LOOPS
         *************************************************************/

        System.out.println("\nMatrix Traversal");

        for (int i = 0; i < matrix.size(); i++) {

            for (int j = 0; j < matrix.get(i).size(); j++) {

                System.out.print(matrix.get(i).get(j) + " ");

            }

            System.out.println();
        }

        /*************************************************************
         *              ENHANCED FOR LOOP
         *************************************************************/

        System.out.println("\nEnhanced For Loop");

        for (List<Integer> row : matrix) {

            for (Integer value : row) {

                System.out.print(value + " ");

            }

            System.out.println();
        }

        /*************************************************************
         *             DYNAMIC ROW ADDITION
         *************************************************************/

        List<Integer> row4 = new ArrayList<>();

        row4.add(10);
        row4.add(11);
        row4.add(12);

        matrix.add(row4);

        System.out.println(matrix);

        /*************************************************************
         *             REMOVE A COMPLETE ROW
         *************************************************************/

        matrix.remove(1);

        System.out.println(matrix);

        /*************************************************************
         *             REMOVE PARTICULAR ELEMENT
         *************************************************************/

        matrix.get(0).remove(1);

        System.out.println(matrix);

        /*************************************************************
         *            CHECK IF ROW CONTAINS ELEMENT
         *************************************************************/

        System.out.println(matrix.get(0).contains(3));

        /*************************************************************
         *             FINAL OUTPUT
         *************************************************************/

        System.out.println("\nProgram Finished Successfully");
    }
}
