package co.edu.uniquindio.libreria;

public  class  Libro {

    private String nombre;
    private String anio;
    private String autor;
    private int precio;

    public Libro(String nombre, String anio, String autor, int precio) {
        this.nombre = nombre;
        this.anio = anio;
        this.autor = autor;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


}
