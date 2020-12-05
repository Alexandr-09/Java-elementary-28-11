import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Masha");
        person1.setAge(29);


        System.out.println(person1.setName();
        System.out.println(person1.getAge();


        Person person2 = person1;

    }


    public static void changePerson(Person person) {
        person.setName(person.getName() + " Changed ");
        person.setAge(person.getAge() + 100;


    }
    public static void printPerson(Person person){
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }

}
