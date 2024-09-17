package com.salary.manager.employe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeController {
	
	@Autowired
	private EmployeService employeService;
	
	@RequestMapping(value = "/employe", method = RequestMethod.GET)
	public List<Employe>  getAllEmployee() {
		return employeService.getAllEmploye();
	}
	
	@RequestMapping(value = "/employe/{id}", method = RequestMethod.GET)
	public Employe getEmployeById(@PathVariable int id) {
		return employeService.getEmployeByID(id);
	} 
	
	@RequestMapping(value = "/employeActifs", method = RequestMethod.GET)
	public List<Employe> getListEmployeActif(){
		return employeService.listeActifs();
	}
	
	@RequestMapping(value = "/employeMiseApied", method = RequestMethod.GET)
	public List<Employe> getListMiseApied(){
		return employeService.listMiseApied();
	}
	
	@PutMapping("/employe/{id}")
	public Employe editEmploye(@PathVariable int id, @RequestBody Employe employe) {
		return employeService.updateEmploye(id, employe);
	}
	
	@PostMapping("/employe")
	public Employe addEmploye(@RequestBody Employe employe) {
		return employeService.addEmploye(employe);
	}

	@DeleteMapping("/employe/{id}")
	public void deleteEmploye(@PathVariable int id) {
		employeService.deleteEmploye(id);
	}
	
	@RequestMapping(value = "/employe", method = RequestMethod.DELETE)
	public void deleteListEmploye(List<Integer> ids) {
		employeService.deleteListEmploye(ids);
	}
	
	@RequestMapping(value = "/employe/mp/{id}", method = RequestMethod.PUT)
	public Employe miseApied(@PathVariable int id) {
		return employeService.miseApiedEmploye(id);
	}
}
