package comunicacion;


public class Periodico extends Escrito{
	private String fecha;
	private String primicia;
	private String interpretacion;
	
    public Periodico(String origen,String titulo, String autor, int paginas,String fecha, String primicia, String interpretacion) {
        super(origen, titulo, autor, paginas);
    	this.fecha = fecha;
        this.primicia = primicia;
        this.interpretacion = interpretacion;
    }
    
	public int palabrasTotales(int parametro) {
		return this.getPaginas()*parametro*10;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public String toString() {
		String r = this.getOrigen()+ "\n";
		r += this.getTitulo()+ "\n";
		r += this.getAutor() + "\n";
		r += this.getPaginas() + "\n";
		r += this.fecha + "\n";
		r += this.primicia;
		return r;
	}
	
    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPrimicia() {
        return this.primicia;
    }

    public void setPrimicia(String primicia) {
        this.primicia = primicia;
    }

    public String getInterpretacion() {
        return this.interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

}
