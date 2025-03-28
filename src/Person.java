public class Person {

    String name;
    int age;
    String personNumber;

    //(komposition, objekt i andra objekt)
    Adress adress;

    Person child;

    public Person(String name, int age, String personNumber, Adress adress, Person child) {
        this.name = name;
        this.age = age;
        this.personNumber = personNumber;
        this.adress = adress;
        this.child = child;
    }

    public Person(){
        this.name = "no name";
        this.age = -1;
        this.personNumber = "no personNumber";
        this.adress = new Adress();
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", personNumber='" + personNumber + '\'' +
                ", adress=" + adress +
                ", child=" + child +
                '}';
    }

    public String greet(){
        return "hej, jag heter " + this.name;
    }
}
