package app.webservice;

import javax.jws.WebService;
import java.util.List;

@WebService(name = "NotebookService", targetNamespace="http://app.webservice")
public interface NotebookService {

	boolean addPerson(Person p);
	
	List<Person> getPersons();
	
	Person getPersonAt(String name);
}
