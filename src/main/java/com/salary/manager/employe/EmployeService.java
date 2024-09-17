package com.salary.manager.employe;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeService {
	
	@Autowired
	private EmployesRepository employesRepositorie;
	 
	public Employe addEmploye(Employe employe) {
		employesRepositorie.save(employe);
		return employe;
	}
	
	public List<Employe> addListEmploye(List<Employe> employe) {
		return employesRepositorie.saveAll(employe);
	}
	
	public List<Employe> getAllEmploye(){
		return employesRepositorie.findAll();
	}
	
	public List<Employe> listeActifs(){
		return employesRepositorie.getListeActifs();
	}
	
	public List<Employe> listMiseApied(){
		return employesRepositorie.getListeMiseApied();
	}
	
	public Employe getEmployeByID(int id) {
		return employesRepositorie.findById(id).orElse(null);
	}
	
	public List<Employe> getEmployeAgeLimite(int anneeNaissance) {
		return  employesRepositorie.getAnneeLimite(anneeNaissance);
	}
	
	public Employe getEmployeByName(String name) {
		return employesRepositorie.findEmployeByNom(name);
	}
	
	public Employe updateEmploye(int id,Employe employe) {
		Employe oldData = employesRepositorie.findById(id).orElse(null);
//		buck up first 
//		EmployeBuckup entity = new EmployeBuckup(0, oldData);
//		System.out.println(entity);
		String miseAjour = "Update";
		employesRepositorie.createIntoBuckup(oldData.getAgence(), oldData.getAnneeNaissance(), 
				oldData.getBanque(), oldData.getCategorie(), oldData.getCompte(), oldData.getConjointFonction(), oldData.getDateCreated(), oldData.getDateEmbauche(), 
				oldData.getDateModified(), oldData.getEmail(), oldData.getEtat(), oldData.getEtatCivile(), oldData.getFonction(), oldData.getGenre(), oldData.getId(), oldData.getLevel(), oldData.getMatricule(), 
				oldData.getMatriculeInss(), oldData.getNom(), oldData.getNombreDenfant(), oldData.getPrenom(), oldData.getSalaireDeBase(), oldData.getService(), oldData.getTelephone(), 
				oldData.getUserCreated(), oldData.getUserModified(), oldData.getVersion(), miseAjour);
		oldData.setVersion(oldData.getVersion()+1);
//		oldData.setId(0);
		
		oldData.setAgence(employe.getAgence());
		oldData.setAnneeNaissance(employe.getAnneeNaissance());
		oldData.setBanque(employe.getBanque());
		
		oldData.setCategorie(employe.getCategorie());
		oldData.setCompte(employe.getCompte());
		oldData.setConjointFonction(employe.getConjointFonction());
		
		oldData.setDateEmbauche(employe.getDateEmbauche());
		oldData.setDateModified(employe.getDateModified());
		oldData.setNom(employe.getNom());
		
		oldData.setPrenom(employe.getPrenom());
		oldData.setEmail(employe.getEmail());
		oldData.setEtat(employe.getEtat());
		oldData.setEtatCivile(employe.getEtatCivile());
		
		oldData.setGenre(employe.getGenre());
		oldData.setMatricule(employe.getMatricule());
		oldData.setMatriculeInss(employe.getMatriculeInss());
		
		oldData.setNombreDenfant(employe.getNombreDenfant());
		oldData.setSalaireDeBase(employe.getSalaireDeBase());
		oldData.setLevel(employe.getLevel());
		
		oldData.setAgence(employe.getAgence());
		oldData.setService(employe.getService());
		oldData.setTelephone(employe.getTelephone());
		oldData.setUserModified(employe.getUserModified());
		
		employesRepositorie.save(oldData);
		return employe;
	}
	
	public void deleteEmploye(int id) {
		Employe oldData = employesRepositorie.findById(id).orElse(null);
//		buck up first 
		String miseAjour = "Delete";
		employesRepositorie.createIntoBuckup(oldData.getAgence(), oldData.getAnneeNaissance(), 
				oldData.getBanque(), oldData.getCategorie(), oldData.getCompte(), oldData.getConjointFonction(), oldData.getDateCreated(), oldData.getDateEmbauche(), 
				oldData.getDateModified(), oldData.getEmail(), oldData.getEtat(), oldData.getEtatCivile(), oldData.getFonction(), oldData.getGenre(), oldData.getId(), oldData.getLevel(), oldData.getMatricule(), 
				oldData.getMatriculeInss(), oldData.getNom(), oldData.getNombreDenfant(), oldData.getPrenom(), oldData.getSalaireDeBase(), oldData.getService(), oldData.getTelephone(), 
				oldData.getUserCreated(), oldData.getUserModified(), oldData.getVersion(), miseAjour);
		employesRepositorie.deleteById(id);
	}
	
	public void deleteListEmploye(List<Integer>ids) {
		List<Employe> employes = employesRepositorie.findAllById(ids);
		for (Iterator<Employe> iterator = employes.iterator(); iterator.hasNext();) {
			Employe employe = (Employe) iterator.next();
			String miseAjour = "Delete";
			employesRepositorie.createIntoBuckup(employe.getAgence(), employe.getAnneeNaissance(), 
					employe.getBanque(), employe.getCategorie(), employe.getCompte(), employe.getConjointFonction(), employe.getDateCreated(), employe.getDateEmbauche(), 
					employe.getDateModified(), employe.getEmail(), employe.getEtat(), employe.getEtatCivile(), employe.getFonction(), employe.getGenre(), employe.getId(), employe.getLevel(), employe.getMatricule(), 
					employe.getMatriculeInss(), employe.getNom(), employe.getNombreDenfant(), employe.getPrenom(), employe.getSalaireDeBase(), employe.getService(), employe.getTelephone(), 
					employe.getUserCreated(), employe.getUserModified(), employe.getVersion(), miseAjour);
		}
		employesRepositorie.deleteAllById(ids);
	}
	
	public Employe miseApiedEmploye(int idEmploye) {
		Employe oldData = employesRepositorie.findById(idEmploye).orElse(null);
		employesRepositorie.createIntoBuckup(oldData.getAgence(), oldData.getAnneeNaissance(), 
				oldData.getBanque(), oldData.getCategorie(), oldData.getCompte(), oldData.getConjointFonction(), oldData.getDateCreated(), oldData.getDateEmbauche(), 
				oldData.getDateModified(), oldData.getEmail(), oldData.getEtat(), oldData.getEtatCivile(), oldData.getFonction(), oldData.getGenre(), oldData.getId(), oldData.getLevel(), oldData.getMatricule(), 
				oldData.getMatriculeInss(), oldData.getNom(), oldData.getNombreDenfant(), oldData.getPrenom(), oldData.getSalaireDeBase(), oldData.getService(), oldData.getTelephone(), 
				oldData.getUserCreated(), oldData.getUserModified(), oldData.getVersion(), "Mise a pied");
		  oldData.setEtat(1);
		return employesRepositorie.save(oldData);
	}
	
	
}
