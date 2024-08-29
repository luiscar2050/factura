public class Producto {
    private String codigo;
    private String nombre;
    private double precio;

    private static int ultimoCodigo = 0;

    public Producto(String nombre, double precio) {
        this.codigo = generarCodigoUnico();
        this.nombre = nombre;
        setPrecio(precio);
    }

    private String generarCodigoUnico() {
        ultimoCodigo++;
        return "P" + ultimoCodigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            throw new IllegalArgumentException("El precio debe ser mayor o igual a cero.");
        }
    }

    @Override
    public String toString() {
        return codigo + "\t" + nombre + "\t" + precio;
    }
}
