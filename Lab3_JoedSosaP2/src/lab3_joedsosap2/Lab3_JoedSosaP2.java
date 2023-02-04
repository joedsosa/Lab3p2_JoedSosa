/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3_joedsosap2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author joeds
 */
public class Lab3_JoedSosaP2 {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Concesionaria> concesionaria = new ArrayList<>();
    public static ArrayList<Clientes> clientes = new ArrayList<>();
    public static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        Menu();
    }

    public static void Menu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------------------Bienvenido a la Alcaldia Municipal del Distrito Central---------------------");
        System.out.println("----------------------------------Elija una Opcion Porfavor: --------------------------------------");
        System.out.println("------------------------------------1. CRUD Concesionaria----------------------------------------");
        System.out.println("---------------------------------------2. CRUD Clientes------------------------------------------");
        System.out.println("---------------------------------------3. CRUD Vehiculos-----------------------------------------");
        System.out.println("----------------------------------4. Compra y Venta de Vehiculos---------------------------------");
        System.out.println("--------------------------------------------5. SALIR---------------------------------------------");
        int opc = 0;
        opc = sc.nextInt();

        if (opc == 1) {
            CRUDconsecionaria();
        } else if (opc == 2) {
            CRUDclientes();
        } else if (opc == 3) {
            CRUDvehiculos();
        } else if (opc == 4) {
            ComprayVenta();
        } else {
            System.out.println("Ha salido");
        }
    }

    public static void CRUDconsecionaria() {
        System.out.println("1. Crear Consecionaria");
        System.out.println("2. Modificar Consecionaria");
        System.out.println("3. Borrar Consecionaria");

        sc = new Scanner(System.in);
        int opc = sc.nextInt();

        switch (opc) {
            case 1: {
                crearConse();
            }
            break;
            case 2: {
                modConcesionaria();
            }
            break;
            case 3: {
                delConsecionaria();
            }
            break;
        }
    }

    public static void MostrarConse() {
        for (Concesionaria e : concesionaria) {
            System.out.println(concesionaria.indexOf(e));
        }
    }

    public static void crearConse() {
        System.out.println("Ingrese nombre de la Concesionaria");
        sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.println(" Ingrese el ID de la Consecionaria");
        sc = new Scanner(System.in);
        int ID = sc.nextInt();
        System.out.println("Ingrese la direccion de la Concesionaria");
        sc = new Scanner(System.in);
        String direc = sc.nextLine();
        System.out.println("Ingrese el saldo dispobile");
        sc = new Scanner(System.in);
        int saldo = sc.nextInt();
        concesionaria.add(new Concesionaria(nombre, ID + concesionaria.size() + 1, direc, saldo));

    }

    public static void modConcesionaria() {
        System.out.println("Modificar Consecionaria");
        MostrarConse();
        System.out.println("Solo puede modificar su direccion de servicios");
        int upt = sc.nextInt();
        if (upt >= 0 && upt < concesionaria.size()) {
            System.out.println("1. Cambiar la direccion");
            System.out.println("2. Regresar al menu");
            int menu = sc.nextInt();
            switch (menu) {
                case 1: {
                    System.out.println("Ingrese la nueva dirección: ");
                    String direccion = sc.nextLine();
                    concesionaria.get(menu).setDirec(direccion);
                }
                break;
                case 2: {
                    CRUDconsecionaria();
                }

                default: {
                    System.out.println("504 error not ");
                    modConcesionaria();
                }
            }
        } else {
            System.out.println("Número inválido, regresando al menú");
            CRUDconsecionaria();
        }
    }

    public static void delConsecionaria() {
        for (Concesionaria c : concesionaria) {
            System.out.println(concesionaria.indexOf(c) + 1 + ") " + c.getNombre() + c.getDirec());
        }
        System.out.println("Ingrese posicionicionicion a eliminar");
        sc = new Scanner(System.in);
        int posicionicion = sc.nextInt();

        concesionaria.remove(posicionicion - 1);
    }

    public static void CRUDclientes() {
        System.out.println("1. Crear Clientes");
        System.out.println("2. Borrar Cliente");
        System.out.println("3. Salir");
        int menu = sc.nextInt();
        switch (menu) {
            case 1: {
                addCliente();
            }
            break;
            case 2: {
                removeClienteSpecific();
            }
            break;
            case 3: {
                System.out.println("exit");
            }
            break;
            default: {
                System.out.println("Número inválido");
                CRUDclientes();
            }
        }
    }

    public static void addCliente() {
        System.out.println("Ingrese nombre");
        sc = new Scanner(System.in);
        String nom = sc.nextLine();

        System.out.println("Ingrese ID");
        sc = new Scanner(System.in);
        int identi = sc.nextInt();

        System.out.println("Ingrese saldo");
        sc = new Scanner(System.in);
        double saldo = sc.nextInt();

        clientes.add(new Clientes(identi + clientes.size() + 1, nom, saldo));
    }

    public static void removeClienteSpecific() {
        for (Clientes c : clientes) {
            System.out.println(clientes.indexOf(c) + 1 + c.getNom() + "\n");
        }
        System.out.println("Ingrese que cliente desea eliminar ");
        sc = new Scanner(System.in);
        int posicionicion = sc.nextInt();

        clientes.remove(posicionicion - 1);
    }
    public static void ComprayVenta() {
        System.out.println("Que desea realiza?");
        System.out.println("1. Comprar");
        System.out.println("2. Vender");
        sc = new Scanner(System.in);
        int ayoo = sc.nextInt();
        System.out.println("posicion");
        for (Clientes c : clientes) {
            System.out.println(clientes.indexOf(c) + 1 + " ]"  + c);
        }
        sc = new Scanner(System.in);
        int cli = sc.nextInt() - 1;
        System.out.println("Ingrese Consesionaria");
        for (Concesionaria c : concesionaria) {
            System.out.println(concesionaria.indexOf(c) + 1 + "] " + c);
        }
        sc = new Scanner(System.in);
        int concecio = sc.nextInt() - 1;
        if (ayoo == 1) {
            comprar(cli, concecio);
        } else {
            vender(cli, concecio);
        }
    }
    public static void vender(int client, int concecio) {
        System.out.println("Ingrese Vehiculo a vender");
        for (Vehiculo E : clientes.get(client).getVehicleowned()) {
            System.out.println(clientes.get(client).getVehicleowned().indexOf(E) + 1);
        }
        sc = new Scanner(System.in);
        int ve = sc.nextInt() - 1;
        
        int saldo = concesionaria.get(concecio).getSaldo();
        Vehiculo v = clientes.get(client).getVehicleowned().get(ve);
        
        if (v.getPrecio()<=saldo) {
            concesionaria.get(concecio).getVehiculos().add(v);
            clientes.get(client).getVehicleowned().remove(ve);
            concesionaria.get(concecio).setSaldo((int) (saldo-v.precio));
            clientes.get(client).setSaldo(clientes.get(client).getSaldo()+v.precio);
        }else{
            System.out.println("NO TIENE LOS FONDOS NECESARIOS");
        }
    }
    private static void comprar(int client, int concecio) {

        System.out.println("Ingrese vehiculo a comprar");
        for (Vehiculo v : concesionaria.get(concecio).getVehiculos()) {
            System.out.println(concesionaria.get(concecio).getVehiculos().indexOf(v));
        }
        sc = new Scanner(System.in);
        int ve = sc.nextInt() - 1;

        Vehiculo v = concesionaria.get(concecio).getVehiculos().get(ve);

        if (clientes.get(client).getSaldo() >= v.getPrecio()+(v.getPrecio()*0.075)) {
            clientes.get(client).getVehicleowned().add(v);
            concesionaria.get(concecio).getVehiculos().remove(v);
            clientes.get(client).setSaldo(clientes.get(client).getSaldo() - (v.getPrecio()+(v.getPrecio()*0.075)));
            concesionaria.get(concecio).setSaldo((int) (concesionaria.get(concecio).getSaldo() + (v.getPrecio()+(v.getPrecio()*0.075))));
            concesionaria.get(concecio).getCliente().add(clientes.get(client));
            System.out.println(">>> VEHICULO COMPRADO <<<");
        } else {
            System.out.println(">>> SALDO INSUFICIENTE <<<");
        }
    }

    public static void CRUDvehiculos() {
        System.out.println("1.Crear");
        System.out.println("2.Modificar");
        System.out.println("3.Eliminar");
        System.out.println("4. Salir");
        int menu = sc.nextInt();
        switch (menu) {
            case 1: {
                createVehicle();
            }
            break;
            case 2: {
                modificarVehiculos();
            }
            break;
            case 3: {
                for (Vehiculo c : vehiculos) {
                    System.out.println(vehiculos.indexOf(c) + 1 + ") " + c.getMarca() + " -> " + c.getModelo() + "\n");
                }
                System.out.println("Ingrese posicion a eliminar");
                sc = new Scanner(System.in);
                int pos = sc.nextInt();

                vehiculos.remove(pos);
            }
            break;

            case 4: {
                System.out.println("exit");
            }

            default: {
                System.out.println("not found");
                CRUDclientes();
            }
        }
    }

    public static void createVehicle() {

        for (Concesionaria c : concesionaria) {
            System.out.println(concesionaria.indexOf(c) + 1 + ") " + c.getNombre() + c.getDirec());
        }

        System.out.println("Ingrese donde quiere anadir ");
        sc = new Scanner(System.in);
        int posicionicion = sc.nextInt() - 1;
        System.out.println("Color");
        sc = new Scanner(System.in);
        String color = sc.nextLine();
        System.out.println("Marca");
        sc = new Scanner(System.in);
        String marca = sc.nextLine();
        System.out.println("Modelo");
        sc = new Scanner(System.in);
        String modelo = sc.nextLine();
        System.out.println("Año");
        sc = new Scanner(System.in);
        int año = sc.nextInt();
        System.out.println("Precio");
        sc = new Scanner(System.in);
        int precio = sc.nextInt();

        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingrese el numero de llantas");
            sc = new Scanner(System.in);
            int numLlantas = sc.nextInt();
            if (numLlantas == 2) {
                System.out.println("Moto");
                System.out.println("Bici");
                sc = new Scanner(System.in);
                int motoobici = sc.nextInt();
                if (motoobici == 1) {
                    addMotos(posicionicion, color, marca, modelo, año, precio, numLlantas);
                } else {
                    addBicis(posicionicion, color, marca, modelo, año, precio, numLlantas);
                }
                bandera = false;
            } else if (numLlantas == 4) {
                System.out.println("1. Carro");
                System.out.println("2. Camion");
                System.out.println("3. Bici");
                sc = new Scanner(System.in);
                int tipo = sc.nextInt();
                switch (tipo) {
                    case 1: {
                        addCarros(posicionicion, color, marca, modelo, año, precio, numLlantas);
                    }
                    break;

                    case 2: {
                        addCamiones(posicionicion, color, marca, modelo, año, precio, numLlantas);
                    }
                    break;

                    case 3: {
                        addBuses(posicionicion, color, marca, modelo, año, precio, numLlantas);
                    }

                }

            }
        }

    }

    public static void modificarVehiculos(Carro carro, Camion camion, Bus bus, Motocicleta moto, Bicicleta bici) {
        System.out.println("1. Mod Carros");
        System.out.println("2. Mod Camiones");
        System.out.println("3. Mod Buses");
        System.out.println("4. Mod Motos");
        System.out.println("5. Mod Bicis");
        sc = new Scanner(System.in);
        int ola = sc.nextInt();
        switch (ola) {
            case 1: {
                modificarCarro(carro);
            }
            break;
            case 2: {
                modificarCamion(camion);
            }
            case 3: {
                modificarBus(bus);
            }
            case 4: {
                modificarMoto(moto);
            }
            break;
            case 5: {
                modificarBici(bici);
            }
            break;
            default: {
                System.out.println("NOT FOUND");
                Menu();
            }

        }
    }

    public static void addCarros(int posicion, String color, String marca, String modelo, int año, int precio, int numLlantas) {
        System.out.println("Ingrese descripcion del Motor");
        sc = new Scanner(System.in);
        String descripcionMotor = sc.nextLine();
        System.out.println("Ingrese velocidad Max");
        sc = new Scanner(System.in);
        int maxvel = sc.nextInt();
        System.out.println("Ingrese cantidad de puertas");
        sc = new Scanner(System.in);
        int puertas = sc.nextInt();
        concesionaria.get(posicion).getVehiculos().add(new Carro(puertas, descripcionMotor, maxvel, color, marca, modelo, año, precio, numLlantas));

    }

    public static void modificarCarro(Carro carro) {
        System.out.println("1. Puertas");
        System.out.println("2. Descripcion");
        System.out.println("3. Velocidad Maxima");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1: {
                System.out.println("Ingrese el número de puertas: ");
                int puertas = sc.nextInt();
                carro.setPuertas(puertas);
            }
            case 2: {
                System.out.println("Ingrese la descripción del motor");
                String descripcionMotor = sc.nextLine();
                carro.setMotor(descripcionMotor);
            }
            case 3: {
                System.out.println("Ingrese la velocidad máxima: ");
                int velocidadMax = sc.nextInt();
                carro.setMaxvel(velocidadMax);
            }
            default: {
                System.out.println("504 not found");
                modificarCarro(carro);
            }
        }
    }

    public static void addCamiones(int posicion, String color, String marca, String modelo, int año, int precio, int numLlantas) {
        System.out.println("Ingrese volumen maximo de carga");
        sc = new Scanner(System.in);
        int cargMax = sc.nextInt();

        System.out.println("Ingrese altura");
        sc = new Scanner(System.in);
        int altura = sc.nextInt();

        System.out.println("Tiene retroexcavadora? 1- Si      2- No");
        sc = new Scanner(System.in);
        int s = sc.nextInt();

        if (s == 1) {
            concesionaria.get(posicion).getVehiculos().add(new Camion(cargMax, altura, true, color, marca, modelo, año, precio, numLlantas));
        } else {
            concesionaria.get(posicion).getVehiculos().add(new Camion(cargMax, altura, false, color, marca, modelo, año, precio, numLlantas));
        }
    }

    public static void modificarCamion(Camion camion) {
        System.out.println("1. Volumen");
        System.out.println("2. Altura");
        System.out.println("3. Retro");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1: {
                System.out.println("Ingrese el volumen máximo: ");
                int cargmax = sc.nextInt();
                camion.setCargMax(cargmax);
            }
            case 2: {
                System.out.println("Ingrese la altura: ");
                int altura = sc.nextInt();
                camion.setAltura(altura);
            }
            case 3: {
                System.out.println("Cuenta conretroexcavadora?");
                System.out.println("1. si");
                System.out.println("2. No");
                sc = new Scanner(System.in);
                int s = sc.nextInt();

                if (s == 1) {
                    camion.setRetro(true);

                } else {
                    camion.setRetro(false);

                }
            }
        }
    }

    public static void addBuses(int posicion, String color, String marca, String modelo, int año, int precio, int numLlantas) {
        System.out.println("Ingrese Cantidad Max de Pasajeros");
        sc = new Scanner(System.in);
        int pasajeros = sc.nextInt();

        concesionaria.get(posicion).getVehiculos().add(new Bus(pasajeros, color, marca, modelo, año, precio, numLlantas));

    }

    public static void modificarBus(Bus bus) {
        System.out.println("Ingrese la capacidad máxima de pasajeros: ");
        int pasajeros = sc.nextInt();
        bus.setCantpasa(pasajeros);
    }

    public static void addMotos(int posicionicion, String color, String marca, String modelo, int anioFab, int precio, int numLlantas) {
        System.out.println("Ingrese Desplazamiento de Motor de la motocicleta: ");
        sc = new Scanner(System.in);
        String Desp = sc.nextLine();
        System.out.println("La moto es electrica?");
        System.out.println("1 Si");
        System.out.println("2 No");
        sc = new Scanner(System.in);
        int s = sc.nextInt();
        if (s == 1) {
            concesionaria.get(posicionicion).getVehiculos().add(new Motocicleta(true, Desp, color, marca, modelo, anioFab, precio, numLlantas));
        } else {
            concesionaria.get(posicionicion).getVehiculos().add(new Motocicleta(false, Desp, color, marca, modelo, anioFab, precio, numLlantas));
        }
    }

    public static void modificarMoto(Motocicleta moto) {
        System.out.println("1. Desplazamiento");
        System.out.println("2. Tipo");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1: {
                System.out.println("Ingrese el desplazamiento del motor: ");
                String desplazamiento = sc.nextLine();
                moto.setDesp(desplazamiento);
            }
            case 2: {
                System.out.println("El motor es electrico?");
                System.out.println("1. si");
                System.out.println("2. no");

                sc = new Scanner(System.in);
                int s = sc.nextInt();
                if (s == 1) {
                    moto.setMotorElectrico(true);

                } else {
                    moto.setMotorElectrico(false);

                }

            }
            default: {
                System.out.println("Not found");
                modificarMoto(moto);
            }
        }
    }

    public static void addBicis(int posicionicion, String color, String marca, String modelo, int año, int precio, int numLlantas) {
        System.out.println("Ingrese descripcion de la Bicicleta");
        sc = new Scanner(System.in);
        String descripcion = sc.nextLine();
        System.out.println("Ingrese tipo");
        sc = new Scanner(System.in);
        String tipo = sc.nextLine();
        System.out.println("Ingrese radio");
        sc = new Scanner(System.in);
        int radio = sc.nextInt();
        concesionaria.get(posicionicion).getVehiculos().add(new Bicicleta(descripcion, tipo, radio, color, marca, modelo, año, precio, numLlantas));
    }

    public static void modificarBici(Bicicleta bici) {
        System.out.println("1. Descripcion");
        System.out.println("2. Radio ");
        System.out.println("3. Tipo");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1: {
                System.out.println("Ingrese una descripción: ");
                String descripcion = sc.nextLine();
                bici.setDescripcion(descripcion);
            }
            break;
            case 2: {
                System.out.println("Ingrese el radio: ");
                int radius = sc.nextInt();
                bici.setRadio(radius);
            }
            break;
            case 3: {
                System.out.println("Ingrese el tipo de bicicleta: ");
                System.out.println("1. BMX");
                System.out.println("2. Calle");
                int type = sc.nextInt();
                String tipo = "";
                switch (type) {
                    case 1: {
                        tipo = "BMX";
                    }
                    case 2: {
                        tipo = "Calle";
                    }
                    default: {
                        System.out.println("Número inválido");
                        modificarBici(bici);
                    }
                }
                bici.setTipo(tipo);
            }
            break;
            default: {
                System.out.println("Número no es válido");
                modificarBici(bici);
            }
        }
    }
    
}
