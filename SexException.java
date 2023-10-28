package javaErrorException.Java_Exception;

public class SexException extends Exception {
    public SexException() {
    }

    public void sexException(String i) {
        System.out.println("Exception: SaxNotCorrectData");
        System.out.printf("It`s not correct data: %s", i);
        System.out.println();
    }
}
