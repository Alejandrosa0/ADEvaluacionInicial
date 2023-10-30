package PROGRAMACION;

import java.util.Scanner;

public class Cliente {
    private int id_cliente;
    private String nombre;
    private String direccion;
    private String telefono;

    public Cliente(int id_cliente, String nombre, String direccion, String telefono) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public Cliente() {
        
    }  

    @Override
    public String toString() {
        return "DATOS DEL CLIENTE{" + "ID_CLIENTE = " + id_cliente + ", NOMBRE = " + nombre + ", DIRECCIÓN = " + direccion + ", TELÉFONO = " + telefono + '}';
    }
    
    public void pedirDatos() 
    {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce los siguientes datos: ");
        System.out.print("ID_CLIENTE: ");
        id_cliente = teclado.nextInt();
        System.out.print("NOMBRE: ");
        nombre = teclado.nextLine();
        nombre = teclado.nextLine();
        System.out.print("DIRECCIÓN: ");
        direccion = teclado.nextLine();
        System.out.print("TELÉFONO: ");
        telefono = teclado.nextLine();
        
        System.out.println(toString());     
    }
    
    public void guardarDatos()
    {
        
    }
}
