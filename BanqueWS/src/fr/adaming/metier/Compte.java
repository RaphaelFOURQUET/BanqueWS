package fr.adaming.metier;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Compte")	//Le xml qu'on va générer représentera un Compte.
public class Compte implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long idCompte;
	
	private double solde;
	
	private Date  dateCreation;

	//ACCESSEURS
	public Long getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(Long idCompte) {
		this.idCompte = idCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	//CONSTRUCTEURS
	public Compte() {
		super();
		this.dateCreation = new Date();
	}
	
	public Compte(long id, double solde) {
		super();
		this.dateCreation = new Date();
		this.idCompte = id;
		this.solde = solde;
	}
	
	

}
