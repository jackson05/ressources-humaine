package com.salary.manager.indeminites;

 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndemniteController {

	@Autowired
	private IndemniteService indemniteService;
	
	@RequestMapping(value = "/indemnite", method = RequestMethod.GET)
	public List<Indemnite> getAllData(){
		return indemniteService.getAllIndemnites();
	}
	
	@RequestMapping(value = "/indemnite", method = RequestMethod.POST)
	public Indemnite addData(@RequestBody Indemnite data){
		return indemniteService.addNewIndemnite(data);
	}
	
	@RequestMapping(value = "/indemnite/{id}", method = RequestMethod.GET)
	public Indemnite getById(@PathVariable int id) {
		return indemniteService.getById(id);
	}
	
	@RequestMapping(value = "/indemnite/deleteList", method = RequestMethod.GET)
	public List<Indemnite> getListById(@RequestBody List<Integer> ids){
		return indemniteService.getAllIndemnitesByListId(ids);
	}
	
	@RequestMapping(value = "/indemnite/{name}", method = RequestMethod.GET)
	public Indemnite getByName(@PathVariable String name){
		return indemniteService.getByDesignation(name);
	}
	
	@RequestMapping(value ="/indemnite/{id}", method = RequestMethod.PUT)
	public Indemnite updateData(@PathVariable int id ,@RequestBody  Indemnite indemnite) {
		return indemniteService.updateIndeminite(id, indemnite);
	}
	
	@RequestMapping(value = "/indemnite/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable int id) {
		indemniteService.deleteIndemnite(id);
	}
	
	@RequestMapping(value = "/indemnite/deleteList", method = RequestMethod.DELETE)
	public void deleteByListId(@RequestBody List<Integer> ids) {
		indemniteService.deleteSpecificIndeminite(ids);
	}
	
	@RequestMapping(value = "/indemnite/deleteAll", method = RequestMethod.DELETE)
	public void deleteAllIndemnites() {
		indemniteService.deleteAllIndeminite();
	}
	
	
}
