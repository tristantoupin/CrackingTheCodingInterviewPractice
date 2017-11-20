
public class TheMainPerson {

	
	public static void main(String[] args){
		
		Student s = new Student();
		Person p = s;
		
		Person pers[] = new Person[3];
		pers[0] = s;
		pers[1] = s;
		pers[2] = s;

		p.getType();
		s.getType();
		
	}
}
