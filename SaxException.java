package javaErrorException.Java_Exception;

public class SaxException extends Exception {
    public SaxException() {
    }

    public void saxException(String i) {
        System.out.println("Exception: SaxNotCorrectData");
        System.out.printf("It`s not correct data: %s", i);
        System.out.println();
    }
}
