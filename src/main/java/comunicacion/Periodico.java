package comunicacion;

public class Periodico extends Escrito{
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String implementacion) {
		super(origen, titulo, autor, paginas);
		this.setFecha(fecha);
		this.setPrimicia(primicia);
		this.setInterpretacion(implementacion);
		}
	
	@Override
	public int palabrasTotales(int palabrasPagina) {
		palabrasPagina = 10;
		return (super.getPaginas()*palabrasPagina);
		}
	
	@Override
	public String interpretacion() {
		return this.getInterpretacion();
		}
	
	@Override
	public String toString() { 
		return (super.getOrigen() + "\n" + super.getTitulo() + "\n" + super.getAutor() + "\n" + super.getPaginas() + "\n" + this.getFecha() + "\n" + this.getPrimicia()); 
		}
	
	public String getFecha() { return fecha; }
	public void setFecha(String fecha) { this.fecha = fecha; }
	public String getPrimicia() { return primicia; }
	public void setPrimicia(String primicia) { this.primicia = primicia; }
	public String getInterpretacion() { return interpretacion; }
	public void setInterpretacion(String interpretacion) { this.interpretacion = interpretacion; }

}
