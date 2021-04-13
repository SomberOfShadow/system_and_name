package object;

public class TestObject {
    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest(null, null);


        System.out.println("object test " + objectTest);

        objectTest.getDate();
        System.out.println("date is " + objectTest.getDate());
    }
}
