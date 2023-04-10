package comunicacion;

import java.util.ArrayList;

public class Tesis extends Escrito{
	private String idea;
	private ArrayList<String> argumentos = new ArrayList<>();
	private String referencias;
	private String interpretacion;
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, ArrayList<String> argumentos, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.setIdea(idea);
		this.setArgumentos(argumentos);
		this.setReferencias(referencias);
		this.setInterpretacion(interpretacion);
		
		}
	
	@Override
	int palabrasTotales(int palabrasPagina) {
		palabrasPagina = 5;
		return (super.getPaginas()*palabrasPagina);
		}

	@Override
	String interpretacion() {
		return (this.getInterpretacion());
		}

	@Override
	public String toString() {
		return (super.getOrigen() + "\n" + super.getTitulo() + "\n" + super.getAutor() + "\n" + super.getPaginas() + "\n" + this.getIdea() + "\n" + this.getArgumentos().size() +  "\n" + this.getReferencias());
	
		}

	public String getIdea() { return idea; }
	public void setIdea(String idea) { this.idea = idea; }
	public ArrayList<String> getArgumentos() { return argumentos; }
	public void setArgumentos(ArrayList<String> argumentos) { this.argumentos = argumentos; }
	public String getReferencias() { return referencias; }
	public void setReferencias(String referencias) { this.referencias = referencias; }
	public String getInterpretacion() { return interpretacion; }
	public void setInterpretacion(String interpretacion) { this.interpretacion = interpretacion; }
}
