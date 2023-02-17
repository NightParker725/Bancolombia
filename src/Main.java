import java.util.Scanner;
public class Main {
    public final static Scanner lector = new Scanner (System.in);
    public static void main(String[] args) {
        CircularList lista = new CircularList();
        System.out.println("Bienvenido a Bancolombia, por favor selecciones una de las siguientes opciones: ");
        int i = 0;
        int contador = 0;
        int num = 0;
        do{
            System.out.println("1. Dar turno.");
            System.out.println("2. Mostrar turno.");
            System.out.println("3. Pasar turno.");
            System.out.println("4. Seguir.");
            System.out.println("5. Terminar proceso.");
            i = lector.nextInt();
            lector.nextLine();
            if(i == 1){
                contador++;
                Turn turno = new Turn(contador, 0);
                lista.darTurno(turno);
            }
            if(i == 2){
                num = lista.mostrarTurno();
                if(num == 0){
                    System.out.println("No hay turnos.");
                }
                else{
                    System.out.println("Turno: " + num);
                }
            }
            if(i == 3){
                lista.pasarTurno();
            }
            if(i == 4){
                lista.delete(num);
            }
            if(i == 5){
                System.out.println("Gracias por usar el sistema.");
            }
        }while(i != 5);
    }
}