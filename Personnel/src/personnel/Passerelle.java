package personnel;


public interface Passerelle 
{
	// constructeur de GestionPersonnel appel� getGestionPersonnel
	public GestionPersonnel getGestionPersonnel();
	// sauvegarde de la gestionPersonnel sinon Sauvegarde Impossible
	public void sauvegarderGestionPersonnel(GestionPersonnel gestionPersonnel)  throws SauvegardeImpossible;
}
