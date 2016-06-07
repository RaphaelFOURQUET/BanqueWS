package fr.adaming.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import fr.adaming.metier.Compte;

@WebService(name="BanqueWS")
public class BanqueService {
	
	//methode de conversion
	@WebMethod(operationName="conversionEuroToFranc")
	public double conversion(@WebParam(name="montant") double mt) {
		return mt*6.55;
	}
	
	//methode pour retourner un compte
	@WebMethod
	public Compte getCompte(@WebParam(name="idCompte") long id) {
		return new Compte(id, Math.random()*8000);
	}
	
	//Retourner la liste des comptes
	@WebMethod
	public List<Compte> getComptes() {
		List<Compte> cptes = new ArrayList<Compte>();
		cptes.add(new Compte(1L, Math.random()*8000));
		cptes.add(new Compte(2L, Math.random()*8000));
		cptes.add(new Compte(3L, Math.random()*8000));
		return cptes;
	}

}
