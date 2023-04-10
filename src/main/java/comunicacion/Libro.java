package comunicacion;

public class Libro extends Escrito{
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	
	public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial, String edicion, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.setCo_autor(co_autor);
		this.setEditorial(editorial);
		this.setEdicion(edicion);
		this.setInterpretacion(interpretacion);
		}
	
	@Override
	int palabrasTotales(int palabrasPagina) {
		palabrasPagina = 2;
		return (super.getPaginas()*palabrasPagina);
		}
	
	@Override
	String interpretacion() {
		return interpretacion;
		}
	
	@Override
	public String toString() {
		return (super.getOrigen() + "\n" + super.getTitulo() + "\n" + super.getAutor() + "\n" + super.getPaginas() + "\n" + this.getCo_autor() + "\n" + this.getEditorial() + "\n" + this.getInterpretacion());
		}
	
	public String getCo_autor() { return co_autor; }
	public void setCo_autor(String co_autor) { this.co_autor = co_autor; }
	public String getEditorial() { return editorial; }
	public void setEditorial(String editorial) { this.editorial = editorial; }
	public String getEdicion() { return edicion; }
	public void setEdicion(String edicion) { this.edicion = edicion; }
	public String getInterpretacion() { return interpretacion; }
	public void setInterpretacion(String interpretacion) { this.interpretacion = interpretacion; }

}