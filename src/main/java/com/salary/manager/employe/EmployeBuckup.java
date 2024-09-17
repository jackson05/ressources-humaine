package com.salary.manager.employe;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 

@Entity
public class EmployeBuckup {
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_buckup;
	private int id;
	private String matricule;
	private String nom;
	private String prenom;
	private int anneeNaissance; 
	
	private String genre;
	private String etatCivile;
	@Column(name="level_id", columnDefinition="int(11) NULL default '0'")
	private int levelId;
	private String conjointFonction;
	
	private String telephone;
	private String email;
	private String matriculeInss;
	private int nombreDenfant;
	
	private float salaireDeBase;
	
	@Column(name="service_id", columnDefinition="int(11) NULL default '0'")
	private int serviceId;
	@Column(name="agence_id", columnDefinition="int(11) NULL default '0'")
	private int agenceId;
	@Column(name="fonction_id", columnDefinition="int(11) NULL default '0'")
	private int fonctionId; 
	@Column(name="categorie_id", columnDefinition="int(11) NULL default '0'")
	private int categorieId;
	
	@Column(name="banque_id", columnDefinition="int(11) NULL default '0'")
	private int banqueId;
	private String compte;
	private String dateEmbauche;
	private String dateCreated;
	
	private String dateModified;
	private int userCreated;
	private int userModified;
	private String operation;
	
	@Column(name="version", columnDefinition="int(2) NOT NULL default '1'")
	private int version;
	
	@Column(name="etat", columnDefinition="int(2) NOT NULL default '0' COMMENT '0 ACTIF , 1 MISE A PIED' ")
	private int etat;

	public EmployeBuckup() {
		super();
	}


	public EmployeBuckup(EmployeBuckup employebuck) {
		super();
		this.id_buckup = employebuck.getId_buckup();
		this.id = employebuck.getId();
		this.operation = employebuck.getOperation();
		this.matricule = employebuck.getMatricule();
		this.nom = employebuck.getNom();
		this.prenom = employebuck.getPrenom();
		this.anneeNaissance = employebuck.getAnneeNaissance();
		this.genre = employebuck.getGenre();
		this.etatCivile = employebuck.getEtatCivile();
		this.levelId = employebuck.getLevelId();
		this.conjointFonction = employebuck.getConjointFonction();
		this.telephone = employebuck.getTelephone();
		this.email = employebuck.getEmail();
		this.matriculeInss = employebuck.getMatriculeInss();
		this.nombreDenfant = employebuck.getNombreDenfant();
		this.salaireDeBase = employebuck.getSalaireDeBase();
		this.serviceId = employebuck.getServiceId();
		this.fonctionId = employebuck.getFonctionId();
		this.agenceId = employebuck.getAgenceId();
		this.categorieId = employebuck.getCategorieId();
		this.banqueId = employebuck.getBanqueId();
		this.compte = employebuck.getCompte();
		this.dateEmbauche = employebuck.getDateEmbauche();
		this.dateCreated = employebuck.getDateCreated();
		this.dateModified = employebuck.getDateModified();
		this.userCreated = employebuck.getUserCreated();
		this.userModified = employebuck.getUserModified();
		this.version = employebuck.getVersion();
		this.etat = employebuck.getEtat();
	}


	public int getId_buckup() {
		return id_buckup;
	}


	public String getOperation() {
		return operation;
	}


	public void setOperation(String operation) {
		this.operation = operation;
	}


	public void setId_buckup(int id_buckup) {
		this.id_buckup = id_buckup;
	}


	public int getBanqueId() {
		return banqueId;
	}


	public void setBanqueId(int banqueId) {
		this.banqueId = banqueId;
	}


	public int getLevelId() {
		return levelId;
	}


	public void setLevelId(int levelId) {
		this.levelId = levelId;
	}


	public int getServiceId() {
		return serviceId;
	}


	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}


	public int getFonctionId() {
		return fonctionId;
	}


	public void setFonctionId(int fonctionId) {
		this.fonctionId = fonctionId;
	}


	public int getAgenceId() {
		return agenceId;
	}


	public void setAgenceId(int agenceId) {
		this.agenceId = agenceId;
	}

 

	public int getBanque() {
		return banqueId;
	}
 
	public void setBanque(int banque) {
		this.banqueId = banque;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
 
	
	public int getAnneeNaissance() {
		return anneeNaissance;
	}


	public void setAnneeNaissance(int anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}


	public int getCategorieId() {
		return categorieId;
	}


	public void setCategorieId(int categorieId) {
		this.categorieId = categorieId;
	}


	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getEtatCivile() {
		return etatCivile;
	}

	public void setEtatCivile(String etatCivile) {
		this.etatCivile = etatCivile;
	}

	 

	public String getConjointFonction() {
		return conjointFonction;
	}

	public void setConjointFonction(String conjointFonction) {
		this.conjointFonction = conjointFonction;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMatriculeInss() {
		return matriculeInss;
	}

	public void setMatriculeInss(String matriculeInss) {
		this.matriculeInss = matriculeInss;
	}

	public int getNombreDenfant() {
		return nombreDenfant;
	}

	public void setNombreDenfant(int nombreDenfant) {
		this.nombreDenfant = nombreDenfant;
	}

	public float getSalaireDeBase() {
		return salaireDeBase;
	}

	public void setSalaireDeBase(float salaireDeBase) {
		this.salaireDeBase = salaireDeBase;
	}
 
 
 
	public String getCompte() {
		return compte;
	}

	public void setCompte(String compte) {
		this.compte = compte;
	}

	public String getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(String dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getDateModified() {
		return dateModified;
	}

	public void setDateModified(String dateModified) {
		this.dateModified = dateModified;
	}

	public int getUserCreated() {
		return userCreated;
	}

	public void setUserCreated(int userCreated) {
		this.userCreated = userCreated;
	}

	public int getUserModified() {
		return userModified;
	}

	public void setUserModified(int userModified) {
		this.userModified = userModified;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}
}
