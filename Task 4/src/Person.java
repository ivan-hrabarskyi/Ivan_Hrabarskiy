public class Person {
    private String name;
    private int birthYear;

    Person(){}

    Person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int age(){
        int age = 2021 - birthYear;
        return age;
    }

    public void input(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    public void output(){
        System.out.println("Name of this person is " + this.name + " and the person was born in " + this.birthYear + " year");
    }

    public void changeName(String name){
        System.out.print("A name of the person " + this.name + " changed to ");
        this.name = name;
        System.out.println(this.name);
    }
}
