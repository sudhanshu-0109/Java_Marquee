package Functions;

public class Scopes {

    /* =========================================================
       1. Local Scope (Local Variable)

       Definition:
       A variable declared inside a method, constructor,
       or block.

       Properties:
       - Can only be used inside that method/block
       - Created when block starts
       - Destroyed when block ends
       ========================================================= */

    void localScopeExample() {
        int x = 10; // local variable

        System.out.println("Local Variable : " + x);

        // x can only be used inside this method
    }


    /* =========================================================
       2. Instance Scope (Instance Variable)

       Definition:
       A variable declared inside a class but outside
       methods without using static keyword.

       Properties:
       - Every object gets its own copy
       - Accessible using objects
       - Created when object is created
       ========================================================= */

    int marks = 95; // instance variable

    void instanceScopeExample() {
        System.out.println("Instance Variable : " + marks);
    }


    /* =========================================================
       3. Class Scope / Static Scope

       Definition:
       A variable declared using static keyword inside
       class but outside methods.

       Properties:
       - Shared among all objects
       - Belongs to class
       - Memory allocated only once
       ========================================================= */

    static String college = "Parul University";

    void staticScopeExample() {
        System.out.println("Static Variable : " + college);
    }


    /* =========================================================
       4. Block Scope

       Definition:
       A variable declared inside a block using { }

       Properties:
       - Accessible only inside that block
       - Commonly used in loops and conditions
       ========================================================= */

    void blockScopeExample() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Block Variable : " + i);
        }

        // System.out.println(i);
        // ERROR because i exists only inside loop block
    }


    /* =========================================================
       5. Parameter Scope

       Definition:
       Variables passed as parameters in methods.

       Properties:
       - Accessible only inside that method
       - Acts like local variables
       ========================================================= */

    void parameterScopeExample(int a, int b) {

        int sum = a + b;

        System.out.println("Parameter Variables Sum : " + sum);

        // a and b can only be used inside this method
    }


    /* =========================================================
       6. Shadowing in Java

       Definition:
       When a local variable and instance variable
       have the same name, the local variable hides
       the instance variable.

       This is called Shadowing.

       Properties:
       - Local variable gets higher priority
       - this keyword is used to access instance variable
       ========================================================= */

    int value = 100; // instance variable

    void shadowingExample() {

        int value = 50; // local variable shadows instance variable

        System.out.println("Local Variable : " + value);

        System.out.println("Instance Variable : " + this.value);
    }


    /* =========================================================
       MAIN METHOD
       ========================================================= */

    public static void main(String[] args) {

        Scopes obj = new Scopes();

        // 1. Local Scope
        obj.localScopeExample();

        // 2. Instance Scope
        obj.instanceScopeExample();

        // 3. Static Scope
        obj.staticScopeExample();

        // 4. Block Scope
        obj.blockScopeExample();

        // 5. Parameter Scope
        obj.parameterScopeExample(10, 20);

        // 6. Shadowing
        obj.shadowingExample();
    }
}
