package comunicacion;

public class Alfabeto extends Pictograma{
	private static String[] letras;
	private String interpretacion; 
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.setLetras(letras);
		this.setInterpretacion(interpretacion);	
	}
	
	public int cantidadLetras() {
		return this.getLetras().length;
	}

	@Override
	public String interpretacion() {
		return this.getInterpretacion();
	}

	@Override
	public String toString() {
		return "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z";
	}

	public String getInterpretacion() {	return interpretacion; }
	public void setInterpretacion(String interpretacion) { this.interpretacion = interpretacion; }
	public String[] getLetras() {	return letras; }
	public void setLetras(String[] letras) { Alfabeto.letras = letras; }

}
