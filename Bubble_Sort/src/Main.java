public class Main {

    public static void main(String args[]) {

    }

    //BASIC SORTING ALGORITHMS IN JAVA
    //1.BUBBLE SORT
    //-CONCEPTS: REPEDEATLY SWAPS ADJACENTS ELEMENTS IF THEY ARE IN THE WRONG ORDER
    //-TIME COMPLEXITY:
    //BEST CASE SCENARIO: O(n) (already sorted)
    //worst case and average case: O(n^2)
    //-SPACE COMPLEXITY O(1) IN PLACE SORTING
    //STABLE? ; YES(PRESERVES ORDER OF EQUAL ELEMENTS)
    //ADAPTIVE?: YES(STOPS EARLY IF ALREADY SORTED)

    //-----------IMPLEMENTATION------------------\\

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for(int i = 0; i < n - 1; i++) {
            swapped = false;
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[ j + 1 ]) {
                    int temp = arr[j];
                    arr[j] = arr[ j + 1];
                    arr[ j + 1 ] = temp;
                    swapped = true;
                }
            }

            if(!swapped) break; //optimization: stop if no swaps
        }
    }

    /*SELECTION SORT
    CONCEPT: FINDS THE MINIMUM ELEMETS AND SWAPS IT WITH THE FIRST UNSORTED ELEMENT
    TIME COMPLEXITY:
    - BEST WORST AND AVERAGE CASE O(1) (IN PLACE SORTING)
    - SPACE COMEPLEXITY O(1) IN PLACE SORTING
    -STABLE? : NO SWAPPING MAY CHANGE RELATIVE ORDER
    -ADAPTIVE? NO ALWAYS RUNS IN O(N^2)
    */




    //----------------IMPLEMENTATION--------------------\\

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            //swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }




    /*
    *3. Insertion Sort
	•	Concept: Inserts each element into its correct position by shifting elements.
	•	Time Complexity:
	•	Best Case: O(n) (already sorted)
	•	Worst & Average Case: O(n²)
	•	Space Complexity: O(1) (in-place sorting)
	•	Stable?: Yes (preserves order of equal elements)
	•	Adaptive?: Yes (efficient for nearly sorted data)
    * */



    //------------IMPLEMENTATION----------///

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for(int i = 1; i < n ; i++) {
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }


/* 	•	Bubble Sort: “Big values bubble up” (largest values move to the right)
	•	Selection Sort: “Select smallest, swap left” (find min & place at the beginning)
	•	Insertion Sort: “Insert in place” (pick element & shift larger values)
*/


















}
