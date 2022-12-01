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
			String name = "ejb:"+appName+"/"+moduleName +"/"+beanName+"/"+remoteInterface ;
			
			BanqueRemote proxy= (BanqueRemote)ctx.lookup(name);  //BanqueEBJ/BK!metiers.BanqueRemote
			
			// Testons mtn notre proxy 
			
			proxy.addCompte(new Compte());
			proxy.addCompte(new Compte());
			proxy.addCompte(new Compte());
					
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
