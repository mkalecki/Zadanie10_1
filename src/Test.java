import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {


        Person person = new Person();

        try {
            person.add();
        } catch (NameUndefinedException e){
            System.err.println(e.getMessage());
        } catch (IncorrectAgeException ex) {
            System.err.println(ex.getMessage());

        } catch (InputMismatchException err) {
            System.err.println("Nieprawidłowe dane");

        }



        System.out.println(person.toString());

    }
}
