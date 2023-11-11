package model;

//СОЗДАНИЕ checked исключени
public class DivideByZeroException  extends Exception{
    public DivideByZeroException() {
    }

    public DivideByZeroException(String message) {
        super(message);
    }
}



