package cartes;

public enum Type {
	FEU("Feu rouge","Feu vert","Vehicule Prioritaire"),
	ESSENCE("bidon d'essence" , "panne d'essence" ,null) ,
	CREVAISON("crevaison" ,"Increvable" ,null) ,
	ACCIDENT("accident" , null ,null)  ;
	
	private String attqueD ;
	private String botteD ;
	private String paradeD ;
	
	Type(String attaqueD, String botteD, String paradeD) {
		this.attqueD = attaqueD;
		this.botteD = botteD;
		this.paradeD = paradeD;
	}

	/**
	 * @return the attqueD
	 */
	public String getAttqueD() {
		return attqueD;
	}

	/**
	 * @return the botteD
	 */
	public String getBotteD() {
		return botteD;
	}

	/**
	 * @return the paradeD
	 */
	public String getParadeD() {
		return paradeD;
	}
	
	
	
}
