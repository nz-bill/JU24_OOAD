import java.util.ArrayList;
import java.util.List;

public class OutputManager {



    public void printPersons(List<Person> personList){
        for (Person p : personList){
            System.out.println(p);
        }
    }

    public void greetFromList(List<Person> personList){
        for (Person p : personList){
            System.out.println(p.greet());
        }
    }

    public void printAdressList(List<Adress> adressList){
        for (Adress a : adressList){
            System.out.println(a);
        }
    }
}
