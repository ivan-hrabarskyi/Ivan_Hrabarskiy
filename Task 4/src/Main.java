public class Main {
    public static void main(String[] args) {
        Person firstPerson = new Person();
        firstPerson.setName("Eugene");
        firstPerson.setBirthYear(2000);

        Person secondPerson = new Person("Zoryana", 2005);

        Person thirdPerson = new Person();
        thirdPerson.input("Sofia", 2003);

        Person fourthPerson = new Person("Ivan", 2002);

        Person fifthPerson = new Person("Svyatoslav", 2004);

        firstPerson.output();
        secondPerson.output();
        thirdPerson.output();
        fourthPerson.output();
        fifthPerson.output();
    }
}
