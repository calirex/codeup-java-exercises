public class Person {

    private String name;
    private int age;

    // CONSTRUCTORS //
    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // GETTERS AND SETTERS //
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // METHODS // SAYS HELLO TO THE PAST PERSON OBJECT //
    public void sayHello() {
        System.out.printf("*** Hello, %s ***", this.name);
    }

    // ADDS A PERSON OBJECT TO A PERSON ARRAY //
    public static Person[] addPerson(Person[] persons, Person person) {
        Person[] personsPlusOne = new Person[persons.length + 1];
        for(int i = 0; i < persons.length; i += 1){
            personsPlusOne[i] = persons[i];
        }
        personsPlusOne[personsPlusOne.length - 1] = person;
        persons = personsPlusOne;
        return persons;
    }


    // PRINT A PERSONS NAME //
    public static void main(String[] args) {

        Person person1 = new Person("Boob Master");
        Person person2 = new Person("Julio");
        Person person3 = new Person("Action");

        System.out.println(person1.name);
        System.out.println(person2.name);
        System.out.println(person3.name);

        person1.sayHello();
        person2.sayHello();
        person3.sayHello();


//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    }
}
