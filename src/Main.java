import model.MyMath;

public class Main {
    public static void main(String[] args) {

        double[] arr1 = {2, 7, 9, 3};
        double[] arr2 = {};
        double[] arr3 = null;


        try {
            try {
                System.out.println("avg arr1: " + MyMath.avgDoubleArrayExm1(arr1));
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }

        } catch (NullPointerException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            System.out.println("avg arr2: " + MyMath.avgDoubleArrayExm1(arr2));
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        try {
            System.out.println("avg arr3: " + MyMath.avgDoubleArrayExm1(arr3));
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
