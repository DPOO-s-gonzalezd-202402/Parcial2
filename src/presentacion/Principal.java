package presentacion;

import logica.Parcial;

public class Principal {

	public static void main(String[] args) throws Exception {
		Parcial p = new Parcial();
		try {
				int a=1;
				int b=0;
				int c=-4;
				double[] raices= p.calcularRaices(1,0,-1);
				System.out.println(raices[0]);
				System.out.println(raices[1]);
				double[] raices2=p.calcularRaices( 1,0, 2); //raíz no real, me saca excepción
				System.out.println(raices2[0]);
				System.out.println(raices2[1]);
				double[] raices3=p.calcularRaices( 0,0, -2); //ecuación de tipo lineal mas no cuadrática, tambien me saca excepción
				System.out.println(raices3[0]);
				System.out.println(raices3[1]);
		} catch (Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		

		}
	}
}
