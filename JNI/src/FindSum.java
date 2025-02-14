public class FindSum {
    static {
        System.loadLibrary("mynativelib"); // Loas the compiled C++ library
    }

    public native double totalSum(double a, double b); //Native methog

    public static void main(String args[]) {
        FindSum finder = new FindSum();
        double result = finder.totalSum(5.5, 4.5); // calls native c++ function
        System.out.println("Sum: " + result);
    }
}
//native tells java, "This function exisits, but in another language
//System.loadLibrary("mynativelib") loads our C++ code at run time
// The main method calls totalSum() - which java itself doesnt imeplent


//compile code
//javac FindSum.java
//after generate the JNI Header File
//create a C++ blueprint for the native function

//run javac -h . FindSum.java
//this generate a findsum.h file which conttains the functions signature in c++
//then we implement the function by crerating .cpp file