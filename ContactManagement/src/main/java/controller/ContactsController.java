package controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactsController {
	
	@RequestMapping("/contacts/all")
       public String getAllContacts() {
    	   
    	   return "return all the contacts JPA in the form of list";
       }
	
	@GetMapping("/contacts/phoneNumber")
	public String getPerticularContact(@PathVariable Integer PhoneNumber) {
		
		return "particular contacts from the JPA";
	}
	
	@DeleteMapping("/delete/phoneNumber")
	public ResponseEntity<String> deleteContact(@PathVariable Integer phoneNumber){
		
		
		return ResponseEntity.ok("Contact deleted sucessfully");
	}
	
	//In a similar fashion we can make much more specific syntax and methods
	
	

}
