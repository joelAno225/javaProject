import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import metiers.BanqueRemote;
import metiers.entites.Compte;

public class ClientRemote {

	public static void main(String[] args) {
		try {
			Context ctx = new InitialContext();
			String appName ="";
			String moduleName = "BanqueEJB";
			String beanName ="BK";
			String remoteInterface = BanqueRemote.class.getName(); //metier.BanqueRemote
			String name = "ejb:"+appName+"/"+moduleName +"/"+beanName+"!"+remoteInterface ;
			
			BanqueRemote proxy = (BanqueRemote) ctx.lookup(name);  //BanqueEBJ/BK!metiers.BanqueRemote
			
			/*
			proxy.addCompte(new Compte()); 
			proxy.addCompte(new Compte());
			proxy.addCompte(new Compte());
			*/
			
			Compte cp=proxy.getCompte(1L);
	        System.out.println(cp.getSolde());

	        proxy.verser(1L, 4000);
			proxy.retirer(1L, 2000);
			proxy.virement(1L, 2L, 1000);
			List<Compte> cptes = proxy.ListCompte();
			for (Compte c:cptes) {
				System.out.println(c.getCode()+":"+c.getSolde());
			}
	            
		} catch (Exception e) {
		
			e.printStackTrace();
		}

	}

}
