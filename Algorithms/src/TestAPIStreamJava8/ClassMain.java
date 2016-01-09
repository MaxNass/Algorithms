package TestAPIStreamJava8;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

/**
 * @author MaxNass
 *
 */
public class ClassMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Person> personnes = new ArrayList<Person>();
		Person personne1 = new Person();
		personne1.setNom("Mezghiche");
		personne1.setPrenom("Nassim");
		personne1.setAge(25);
		
		Person personne2 = new Person();
		personne1.setNom("Tintin");
		personne1.setPrenom("Toto");
		personne1.setAge(24);
		
		Person personne3 = new Person();
		personne1.setNom("Dupont");
		personne1.setPrenom("Dupond");
		personne1.setAge(26);
		
		personnes.add(personne1);
		personnes.add(personne2);
		personnes.add(personne3);
		
		OptionalDouble toto = personnes.stream().mapToInt(Person::getAge).filter(age-> age > 20).average();
		System.out.println(toto.getAsDouble());
		
		int[] array = {5,2,6,4,7,8};
		int pivot = array[0 +(5-0)/2];
		System.out.println("pivot=" + pivot );
		
		/*int pos = 5;
		pos/=2;
		System.out.println(pos);
		*/
		
		

	}

}
