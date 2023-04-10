package comunicacion;

public class Tesis extends Escrito{
	private String idea;
	private String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.setIdea(idea);
		this.setArgumentos(argumentos);
		this.setConclusion(conclusion);
		this.setReferencias(referencias);
		this.setInterpretacion(interpretacion);
		
		}
	
	@Override
	public int palabrasTotales(int palabrasPagina) {
		return (super.getPaginas()*palabrasPagina*5);
		}

	@Override
	public String interpretacion() {
		return (this.getInterpretacion());
		}

	@Override
	public String toString() {
		return (super.getOrigen() + "\n" + super.getTitulo() + "\n" + super.getAutor() + "\n" + super.getPaginas() + "\n" + this.getIdea() + "\n" + this.getArgumentos().length + "\n" + this.getConclusion() + "\n" + this.getReferencias());
	
		}

	public String getIdea() { return idea; }
	public void setIdea(String idea) { this.idea = idea; }
	public String[] getArgumentos() { return argumentos; }
	public void setArgumentos(String[] argumentos) { this.argumentos = argumentos; }
	public String getReferencias() { return referencias; }
	public void setReferencias(String referencias) { this.referencias = referencias; }
	public String getInterpretacion() { return interpretacion; }
	public void setInterpretacion(String interpretacion) { this.interpretacion = interpretacion; }

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
}
