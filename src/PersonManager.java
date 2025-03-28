import java.util.ArrayList;
import java.util.List;

public class PersonManager {
    OutputManager out = new OutputManager();
    List<Person> personList = new ArrayList<>();
    List<Adress> adressList = new ArrayList<>();

    public PersonManager(){

        adressList.add( new Adress("gatan", "1","Staden","01234"));
        adressList.add(  new Adress("stigen", "5b","byn","15324"));

        //Person person1 = new Person();

        personList.add(new Person("Arne",23,"8101014565",adressList.get(0), null ));

        personList.add(new Person("Bill",44,"8101010101",adressList.get(0),personList.get(0)));

    }

    public void run(){
        out.printPersons(personList);
        out.printAdressList(adressList);
        out.greetFromList(personList);
    }


}
