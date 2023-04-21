package principal;

public class MiPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cerdito cerdito1 = new Cerdito("Pepito");
		Material paja = new Material(
				"paja",
				Material.RESISTENCIA_BAJA
		);
		cerdito1.construirCasa(paja);
		
		Cerdito cerdito2 = new Cerdito("Pepito 2");
		Material madera = new Material(
				"madera",
				Material.RESISTENCIA_MEDIA
		);
		cerdito2.construirCasa(madera);
		
		Cerdito cerdito3 = new Cerdito("Pepito3 ");
		Material ladrillo = new Material(
				"ladrillo",
				Material.RESISTENCIA_ALTA
		);
		cerdito3.construirCasa(ladrillo);
		

		Lobo lobo = new Lobo();
		Cerdito[] vectorCerditos = new Cerdito[3];
		vectorCerditos[0] = cerdito1;
		vectorCerditos[1] = cerdito2;
		vectorCerditos[2] = cerdito3;
		System.out.println("Habia una vez 3 cerditos");
		
		for(int i=0; i < vectorCerditos.length;i++) { 
			Cerdito cerditoActual = vectorCerditos[i];
			boolean destruyo = lobo.destruirCasa(cerditoActual.casa);
			if(destruyo) {
				System.out.println("y Destruyo casa de "+cerditoActual.nombre);
			}else {
				System.out.println("y No Destruyo casa de "+cerditoActual.nombre);
			}
		}
		
		
		
		
	}

}
