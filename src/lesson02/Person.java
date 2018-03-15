package lesson02;

public class Person {
    String firstName;
    String secondName;
    int age;
    private static int count = 0;

    Person (String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        /*count++;*/
    }

    static{
            System.out.println("First class loading.");
        }

    {
        System.out.println(++count + " class loading");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        return secondName != null ? secondName.equals(person.secondName) : person.secondName == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    public static void main(String[]args){
        Person person1 = new Person ("Olena","Pavliuk",32);
        Person person2 = new Person ("Ivan","Petrov",33);
        Person person3 = new Person ("Ivan","Petrov",34);

        if (        person1.equals(person2) )

            System.out.println("YES");
            else

                System.out.println("NO");



        if (person2.equals(person3))

            System.out.println("YES");
        else

            System.out.println("NO");
    }
}



