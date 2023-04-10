package comunicacion;

import java.util.ArrayList;

public class Alfabeto extends Pictograma{
	private static ArrayList<String> letras = new ArrayList<>();
	private String interpretacion; 
	
	public Alfabeto(String origen, ArrayList<String> letras, String interpretacion) {
		super(origen);
		this.setLetras(letras);
		this.setInterpretacion(interpretacion);	
	}
	
	public int cantidadLetras() {
		return this.getLetras().size();
	}

	@Override
	String interpretacion() {
		return this.getInterpretacion();
	}

	@Override
	public String toString() {
		return "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z";
	}

	public String getInterpretacion() {	return interpretacion; }
	public void setInterpretacion(String interpretacion) { this.interpretacion = interpretacion; }
	public ArrayList<String> getLetras() {	return letras; }
	public void setLetras(ArrayList<String> letras) { Alfabeto.letras = letras; }

}
