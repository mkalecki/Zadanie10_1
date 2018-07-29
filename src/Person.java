import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private String pesel;
    private int age;

    public Person() throws IncorrectAgeException, NameUndefinedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj imię:");
        String firstName = scan.nextLine();
        if (firstName.length() < 2)
            throw new NameUndefinedException("musisz podać conajmniej dwa znaki imienia");
        System.out.println("podaj nazwisko");
        String lastName = scan.nextLine();
        if (lastName.length() < 2)
            throw new NameUndefinedException("musisz podać conajmniej dwa znaki nazwiska");
        System.out.println("podaj PESEL:");
        String pesel = scan.nextLine();
        System.out.println("podaj wiek:");
        int age = scan.nextInt();
        if (age < 1)
            throw new IncorrectAgeException("wiek nie może być mniejszy od 1");
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPesel(pesel);
        this.setAge(age);
        scan.close();
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", PESEL:" +
                pesel + ", WIEK: " +
                age;
    }
}
