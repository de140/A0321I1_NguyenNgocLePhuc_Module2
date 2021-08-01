package bai11_dsa_stack_queue.thuc_hanh.trien_khai_stack;

public class GenericStackClient {
    public static void main(String[] args) {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        System.out.println("1. Stack of integers");
        stack.stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stack.stackOfIStrings();
    }
}