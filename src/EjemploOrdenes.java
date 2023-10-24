import java.util.Date;
public class EjemploOrdenes {
    public static void main(String[] args) {

        OrdenCompra barbacoa = new OrdenCompra("Barbacoa del finde");
        barbacoa.setCliente(new Cliente("Javier","Vazquez Castillo"));
        barbacoa.setFecha(new Date());
        barbacoa.addProducto(new Producto("Bimbo","Pan de hamburguesas",10));
        barbacoa.addProducto(new Producto("Carniceria","Hamburguesas",20));
        barbacoa.addProducto(new Producto("Fruteria","Tomates",3));
        barbacoa.addProducto(new Producto("Supermercado","Queso",6));

        OrdenCompra paella = new OrdenCompra("Comida del finde");
        paella.setCliente(new Cliente("Francisco","Ortega Castro"));
        paella.setFecha(new Date());
        paella.addProducto(new Producto("Supermercado","Arroz",5));
        paella.addProducto(new Producto("Carniceria","Pollo",7));
        paella.addProducto(new Producto("Fruteria","Pimientos",5));
        paella.addProducto(new Producto("Pescaderia","Gambas",4));

        OrdenCompra desayuno = new OrdenCompra("Desayuno del finde");
        desayuno.setCliente(new Cliente("Jorge","Fernandez Martinez"));
        desayuno.setFecha(new Date());
        desayuno.addProducto(new Producto("Supermercado","Cereales",4));
        desayuno.addProducto(new Producto("Supermercado","Leche",10));
        desayuno.addProducto(new Producto("Fruteria","Platano",6));
        desayuno.addProducto(new Producto("Pasteleria","Donuts",8));

        OrdenCompra[] ordenes = {barbacoa, paella, desayuno};

        for (OrdenCompra orden : ordenes) {
            System.out.println("Folio: " + orden.getIdentificador());
            System.out.println("Cliente: " + orden.getCliente());
            System.out.println("Descripcion: " + orden.getDescripcion());
            System.out.println("Fecha: " + orden.getFecha());
            System.out.println("Total: " + orden.getGranTotal());

            int i = 1;
            for (Producto p : orden.getProductos()) {
                System.out.println("Producto " + i + ": " + p.getNombre() + " " + p.getFabricante() + " precio $" + p.getPrecio());
                i++;
            }
            System.out.println("---------------------------------- siguiente --------------------------------------");
        }
    }

}

