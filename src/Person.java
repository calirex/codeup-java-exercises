public class Person {

    private String name;

    // CONSTRUCTORS //
    public Person (){

    }

    public Person (String name){
        this.name = name;
    }


// GETTERS AND SETTERS //
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void sayHello() {
        System.out.printf("*** Hello, %s ***", this.name);
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
