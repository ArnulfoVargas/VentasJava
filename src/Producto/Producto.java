package Producto;

public class Producto
{
    private String itemName;
    private float precio;
    private int id;
    private static int contador;

    public Producto(String itemName, float precio){
        this.setId(contador++);
        this.setItemName(itemName);
        this.setPrecio(precio);
    }

    public String getItemName()
    {
        return itemName;
    }

    public void setItemName(String itemName)
    {
        this.itemName = itemName;
    }

    public float getPrecio()
    {
        return precio;
    }

    public void setPrecio(float precio)
    {
        this.precio = precio;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        StringBuilder sB = new StringBuilder();
        sB.append("id: ").append(id).append("\nName: ").append(itemName).append("\nPrice: ").append(precio);

        return sB.toString();
    }
}
