package Parking;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ParkingTest_Joshua_Mas {
    public static void main(String[] args) throws Exception {
        Parking_Joshua_Mas p = new Parking_Joshua_Mas(30, 30);
/*
        try {
            p.llegirMatricules(args[0]);
        }catch(Exception e){
                System.out.println(e); }*/


            Scanner teclado = new Scanner(System.in);

            boolean bandera = false;
            while (!bandera) {
                System.out.println("-----------------------------------------------"+ "\n" + "1.- Omplir parking a partir de fitxer");
                System.out.println("2.- Entrar Cotxe");
                System.out.println("3.- Entrar Cotxe Discapacitado");
                System.out.println("4.- Surtir Cotxe");
                System.out.println("5.- Surtir Cotxe Discapacitado");
                System.out.println("6.- Guardar llistat de matricules en fitxer");
                System.out.println("7.- Sortir");
                System.out.print("-----------------------------------------------"+ "\n" + "Elige una de las opciones: ");
                int seleccio = teclado.nextInt();
                try{
                switch (seleccio) {
                    case 1 -> {
                        p.llegirMatricules(args[0]);
                    }
                    case 2 -> {
                        System.out.println("Introduzca la matricula: ");
                        String a = teclado.next();
                        p.entraCotxe(a);
                        System.out.println("Coche con matricula: " + a + " estacionado.");
                    }
                    case 3 -> {
                        System.out.println("Introduzca la matricula: ");
                        String a = teclado.next();
                        p.entraCotxeDiscapacitat(a);
                        System.out.println("Coche con matricula: " + a + " estacionado.");
                    }

                    case 4 -> {
                        System.out.println("Introduzca la matricula: ");
                        String a = teclado.next();
                        p.surtCotxe(a);
                    }
                    case 5 -> {
                        System.out.println("Introduzca la matricula: ");
                        String a = teclado.next();
                        p.surtCotxeDiscapacitat(a);
                    }
                    case 6 -> {
                        System.out.println("Indica la ruta del archivo al que quieres guardar las matriculas: ");
                        String path = teclado.next();
                        p.guardarMatricules(path);
                    }
                    case 7 -> {
                        System.out.println("Fin del programa.");
                        bandera = true;
                    }
                    default -> System.out.println("-----------------------------------------------" +"\n" +"Error al introducir la opción, introduzcala de nuevo por favor: ");
                }
                }catch (Exception s){
                    System.out.println(s);
                }
                /*
                System.out.println(p.getPlacesOcupades(Parking_Joshua_Mas.TipusPlacesParking.no_Discapacitat));
                System.out.println(p.getPlacesOcupades(Parking_Joshua_Mas.TipusPlacesParking.Discapacitat));
                System.out.println(p.getPlacesLliures(Parking_Joshua_Mas.TipusPlacesParking.no_Discapacitat));
                System.out.println(p.getPlacesLliures(Parking_Joshua_Mas.TipusPlacesParking.Discapacitat));
                */
            }
        }
    }





