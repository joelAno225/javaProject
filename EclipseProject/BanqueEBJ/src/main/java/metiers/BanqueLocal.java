package metiers;

import java.util.List;

import javax.ejb.Local;

import metiers.entites.Compte;

@Local
public interface BanqueLocal {
	

	public Compte addCompte(Compte cp);
	public Compte getCompte(Long code);
	public List<Compte> ListCompte();
	public void verser(Long code,double mt);
	public void retirer(Long code,double mt);
	public void virement(Long cp1,Long cp2,double mt);

}
