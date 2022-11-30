package metiers;

import java.util.List;

import javax.ejb.Remote;

import metiers.entites.Compte;

// Une interface remote est une classe dans la quelle on declare toutes 
// les fonctions (methods) qui sont accessibles a distance pour un client java 

@Remote
public interface BanqueRemote {

	public Compte addCompte(Compte cp);
	public Compte getCompte(Long code);
	public List<Compte> ListCompte();
	public void verser(Long code,double mt);
	public void retirer(Long code,double mt);
	public void virement(Long cp1,Long cp2,double mt);
	
	
}
