package Arrays;

public class Passbyvalue {
    public static void main(String[] args) {
        int p = 26;
        int q = 13;

        decrease(p , q);
        System.out.println(p + ";" + q);
    }
    static void decrease(int n1, int n2){

        n1--;
        n2 = n2 - 2;

        System.out.println(n1 + ":;" + n2);

    }
}
/*This code shows the perfect example of "Pass By Value".
*
* Pass by value in Java means that when a method is called, a copy of the actual parameter's value is passed to the
* method, not the original variable itself. This applies to both primitive data types and object references.

For primitive types (like int, float, boolean), the actual value is copied. Modifying the parameter inside the method
* does not affect the original variable outside the method.

For objects, the value that is copied and passed to the method is not the object itself but a copy of the reference
* (address) to the object. This means the method gets its own copy of the reference pointing to the same object in
* memory. Therefore:

The method can modify the state of the object because the reference points to the same object.

However, if the method changes the reference to point to a new object, the original reference outside the method is
* unaffected.

This subtle distinction clarifies why Java is often misunderstood as pass-by-reference, but technically,
* it is always pass-by-value because a copy of the value (whether a primitive value or an object reference) is passed*/