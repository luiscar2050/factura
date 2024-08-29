package edu.misena.factura.model;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private static final int MAX_ITEMS = 100;
    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems;

    public Factura(int folio, String descripcion, Date fecha, Cliente cliente) {
        this.folio = folio;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.indiceItems = 0;
    }

    public void addItemFactura(ItemFactura item) {
        if (indiceItems >= MAX_ITEMS) {
            throw new IllegalStateException("No se pueden agregar más ítems. Se ha alcanzado el límite máximo.");
        }
        if (item != null) {
            items[indiceItems++] = item;
        }
    }

    public float calcularTotal() {
        float total = 0.0f;
        for (ItemFactura item : items) {
            if (item != null) {
                total += item.calcularImporte();
            }
        }
        return total;
    }

    public String generarDetalle() {
        StringBuilder sb = new StringBuilder("Factura Nº: ");
        sb.append(folio)
                .append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\t NIF: ")
                .append(cliente.getNif())
                .append("\nDescripción: ")
                .append(this.descripcion)
                .append("\n");

        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        sb.append("Fecha Emisión: ")
                .append(df.format(this.fecha))
                .append("\n")
                .append("\n#\tNombre\t$\tCant.\tTotal\n");

        for (ItemFactura item : items) {
            if (item != null) {
                sb.append(item)
                        .append("\n");
            }
        }
        sb.append("\nGran Total: ")
                .append(calcularTotal());

        return sb.toString();
    }

    @Override
    public String toString() {
        return generarDetalle();
    }
}
