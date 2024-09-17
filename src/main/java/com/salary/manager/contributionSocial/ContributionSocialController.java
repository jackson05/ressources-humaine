package com.salary.manager.contributionSocial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContributionSocialController {

	@Autowired
	private ContributionSocialService contributionSocialService;
	
	@RequestMapping(value = "/contributionsocial", method = RequestMethod.GET)
	public List<ContributionSocial> getAllData (){
		return contributionSocialService.getAllContributionSocial();
	}
	
	@RequestMapping(value = "/contributionsocial/id/{id}", method = RequestMethod.GET)
	public ContributionSocial getDataById (@PathVariable int id){
		return contributionSocialService.getContributionSocialById(id);
	}
	
	@RequestMapping(value = "/contributionsocial/name/{name}", method = RequestMethod.GET)
	public ContributionSocial getDataByName (@PathVariable String name){
		return contributionSocialService.getContributionSocialByDesignation(name);
	}
	
	@RequestMapping(value = "/contributionsocial", method = RequestMethod.POST)
	public ContributionSocial addData(@RequestBody ContributionSocial nouveau) {
		return contributionSocialService.addContributionSocial(nouveau);
	}
	
	@RequestMapping(value = "/contributionsocial/{id}", method = RequestMethod.PUT)
	public ContributionSocial editData(@PathVariable int id, @RequestBody ContributionSocial nouveau) {
		return contributionSocialService.updateContributionSocial(id, nouveau);
	}
	

	@RequestMapping(value = "/contributionsocial/{id}", method = RequestMethod.DELETE)
	public void deleteDataById (@PathVariable int id){
		contributionSocialService.deleteContributionSocialById(id);
	}
	
	@RequestMapping(value = "/contributionsocial/deleteList", method = RequestMethod.DELETE)
	public void deleteDataByList (@RequestBody List<Integer> ids){
		contributionSocialService.deleteContributionSocialByListIds(ids);
	}
	
	@RequestMapping(value = "/contributionsocial/deleteAll", method = RequestMethod.DELETE)
	public void deleteAllData (){
		contributionSocialService.deleteAllContributionSocial();
	}
	
}
