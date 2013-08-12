package xjc;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.bank.account.Details;

public class XJCTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testUnMarshaller() throws Exception { 
		File file = new File("/home/arorah1/xsd/bbc/account.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(com.bank.account.Details.class);
 
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		com.bank.account.Details customer = (com.bank.account.Details) jaxbUnmarshaller.unmarshal(file);
		System.out.println("Name=" + customer.getPerson().getName().getFirstName().getTitile() + " " +
		customer.getPerson().getName().getFirstName().getValue());
		System.out.println("Account Type=" +customer.getAccounts().getAccount().get(0).getType() + 
		"Balance=" + customer.getAccounts().getAccount().get(0).getBalance());
	}
	
	@Test
	public void testMarshaller() throws Exception{
		Details details = new Details();
		Details.Person person = new Details.Person();
		Details.Person.Name name = new Details.Person.Name();
		Details.Person.Name.FirstName fname = new Details.Person.Name.FirstName();

		Details.Person.Address address = new Details.Person.Address();
		Details.Person.Address.Location location = new Details.Person.Address.Location();
		Details.Person.Address.State state = new Details.Person.Address.State();
		Details.Person.Address.Country country = new Details.Person.Address.Country();

		Details.Person.Contact contact = new Details.Person.Contact();
		Details.Person.Contact.Phone phone = new Details.Person.Contact.Phone();
		contact.setEmail("anjlina.jolly@gmail.com");
		phone.setMobile(9898121200L);
		phone.setOffice(22447755);
		phone.setValue("y");
		contact.setPhone(phone);

		fname.setTitile("Ms");fname.setValue("Anjlina");
		name.setLastName("Joly");name.setFirstName(fname);


		location.setDoor(new Short("23"));location.setValue("south Avenue");
		state.setDistrict("LA");state.setValue("MA");
		country.setPin(110022);country.setValue("USA");
		address.setState(state);
		address.setLocation(location);
		address.setCountry(country);

		person.setName(name);
		person.setAddress(address);
		person.setContact(contact);


		List<Details.Accounts> accountList = new ArrayList<Details.Accounts>();
		Details.Accounts accounts = new Details.Accounts ();
		Details.Accounts.Account acc = new Details.Accounts.Account(); 
		
		acc.setType("Credit");
		acc.setBalance(-2000000);
		accounts.getAccount().add(acc);
		acc.setType("PF");
		acc.setBalance(25353453);
		accounts.getAccount().add(acc);
		
		details.setPerson(person);
		details.setAccounts(accounts);

		JAXBContext jc = JAXBContext.newInstance(Details.class);

		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(details,  new FileOutputStream("out/output.xml"));
	}
}
