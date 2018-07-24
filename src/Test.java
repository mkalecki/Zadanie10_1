import java.util.Scanner;

public class Test {

    public static void main(String[] args) {


        Person person = new Person();

        try {
            person.add();
        } catch (NameUndefinedException e){
            System.err.println(e.getMessage());
        } catch (IncorrectAgeException e) {
            System.err.println(e.getMessage());

        }



        System.out.println(person.toString());

    }
}
