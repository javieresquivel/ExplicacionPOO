package principal;

public class Lobo {
	
	public boolean destruirCasa(Casa casaADestruir) {
		boolean laDestruyo = false;
		
		for(int i=0; i< casaADestruir.material.resistencia;i++) {
			System.out.println("Soplo y soplo "+(i+1));
		}
		
		if(casaADestruir.material.resistencia == Material.RESISTENCIA_BAJA) {
			laDestruyo = true;
		}else if (casaADestruir.material.resistencia == Material.RESISTENCIA_MEDIA) {
			laDestruyo = true;
		}else if (casaADestruir.material.resistencia == Material.RESISTENCIA_ALTA) {
			laDestruyo = false;
		}
		return laDestruyo;
	}

}
