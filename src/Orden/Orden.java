package Orden;
import Producto.Producto;

public class Orden
{
    private static int ordenes;
    private final static int  MaxItems = 10;
    private int idOrden;
    private Producto productos[];

    public Orden(){
        this.idOrden = Orden.ordenes++;
        productos = new Producto[MaxItems];

        for (int i = 0; i < MaxItems; i++)
        {
            productos[i] = null;
        }
    }

    public void AgregarProducto(Producto producto){
        int i = 0;
        while (i < MaxItems && productos[i] != null){
            i++;
        }

        if(i >= MaxItems)
            System.out.println("Has superado el maximo de items");

        else if (i < MaxItems) {
            productos[i] = producto;
        }
    }

    private float CalcularTotal(){
        float total = 0;
        int i = 0;

        while (i < MaxItems && productos[i] != null){
            total += productos[i].getPrecio();
            i++;
        }

        return total;
    }

    public void MostrarOrden(){
        StringBuilder sB = new StringBuilder();

        sB.append("\nID de la orden: ").append(idOrden).append("\n").append("Producto").append("\t\t").append("ID").append("\t\t").append("Precio\n\n");

        int i = 0;
        while (i < MaxItems && productos[i] != null){

            sB.append(productos[i].getItemName()).append("\t\t\t").append(productos[i].getId()).append("\t\t").append(productos[i].getPrecio()).append("\n");

            i++;
        }

        sB.append("\nTotal: \t\t\t\t\t").append(CalcularTotal()).append("\n");

        System.out.println(sB.toString());
    }
}
