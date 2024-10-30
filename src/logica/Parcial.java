package logica;

public class Parcial {
	
	public boolean hayRaicesReales(int a, int b, int c){
		boolean respuesta=true;
		if ((Math.pow(b, 2)-4*a*c)<0) {
			respuesta=false;
		}
		return respuesta;
	}
	public double[] calcularRaices(int a, int b, int c) throws Exception{
		double [] raices= {0,0};
		boolean raizReal = hayRaicesReales(a,b,c);
		if (!raizReal) {
			throw new Exception("Las raíces del polinomio ingresado no son reales. ");

		} else if(raizReal && a==0){
			throw new Exception("La ecuación ingresada no es de segundo orden, es lineal. ");

		}else {
			double raiz1= (-b + Math.sqrt((Math.pow(b, 2)-4*a*c)))/(2*a);
			double raiz2= (-b - Math.sqrt((Math.pow(b, 2)-4*a*c)))/(2*a);
			raices[0]=raiz1;
			raices[1]=raiz2;
			return raices;
		} 
	}
	public Parcial() {
	}
	
}
