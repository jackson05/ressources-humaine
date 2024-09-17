package com.salary.manager.employe;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.salary.manager.agences.Agence;
import com.salary.manager.banque.Banque;
import com.salary.manager.categorie.Categorie;
import com.salary.manager.fonction.Fonction;
import com.salary.manager.level.Level;
import com.salary.manager.service.Services;
 

@Repository
@Transactional
public interface EmployesRepository extends JpaRepository<Employe, Integer> {

	Employe findEmployeByNom(String nom);
	 
	@Modifying
	@Query(value = "UPDATE employe set version= :version WHERE id= :id", nativeQuery = true)
	void updateDepartementById(String version, int id);
	
	@Modifying
	@Query(value = "INSERT into employe_buckup (`agence_id`, `annee_naissance`, `banque_id`, `categorie_id`, `compte`, `conjoint_fonction`,"
			+ " `date_created`, `date_embauche`, `date_modified`, `email`, `etat`, `etat_civile`, `fonction_id`, `genre`, `id`, `level_id`,"
			+ " `matricule`, `matricule_inss`, `nom`, `nombre_denfant`, `prenom`, `salaire_de_base`, `service_id`, `telephone`, `user_created`, "
			+ "`user_modified`, `version`, `operation`) "
			+ "VALUES (:agence_id, :annee_naissance, :banque_id, :categorie_id, :compte, :conjoint_fonction, :date_created, "
			+ ":date_embauche, :date_modified, :email, :etat, :etat_civile, :fonction_id, :genre, :id, :level_id, :matricule,"
			+ " :matricule_inss, :nom, :nombre_denfant, :prenom, :salaire_de_base, :service_id, :telephone, :user_created,"
			+ " :user_modified, :version, :operation)", nativeQuery = true)
	void createIntoBuckup(@Param("agence_id") Agence agence, @Param("annee_naissance") int anneeNaissance, @Param("banque_id") Banque banque, @Param("categorie_id") Categorie categorie,
			@Param("compte") String compte, @Param("conjoint_fonction") String conjointFonction, @Param("date_created") String dateCreated,@Param("date_embauche") String dateEmbauche, @Param("date_modified") String dateModified,
			@Param("email") String email, @Param("etat") int etat, @Param("etat_civile") String etatCivile, @Param("fonction_id") Fonction fonction, @Param("genre") String genre, @Param("id") int id, 
			@Param("level_id") Level level, @Param("matricule") String matricule,@Param("matricule_inss") String matriculeInss, @Param("nom") String nom, @Param("nombre_denfant") int nombreDenfant, 
			@Param("prenom") String prenom, @Param("salaire_de_base") float salaireDeBase, @Param("service_id") Services serviceId, @Param("telephone") String telephone, @Param("user_created") int userCreated, 
			@Param("user_modified") int userModified, @Param("version") int version, @Param("operation") String operation);
	
	@Query(value = "SELECT * FROM employe WHERE anneeNaissance >= :anneeNaissance", nativeQuery = true)
	List<Employe> getAnneeLimite(@Param("anneeNaissance") int anneeLimit);
	
	@Query(value = "SELECT * FROM employe WHERE etat = 1", nativeQuery = true)
	List<Employe> getListeMiseApied();
	
	@Query(value = "SELECT * FROM employe WHERE etat = 0", nativeQuery = true)
	List<Employe> getListeActifs();

}
