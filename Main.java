import java.util.Date;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Pagina> historial = new Stack<>();

        System.out.print("s:1. Busca una direccion url. 2: Retrocede. 3: Ve el historial. 0: Para salir: ");
        int opt = sc.nextInt();

        while (opt != 0) {
            switch (opt) {
                case 1:
                    Pagina pagina = new Pagina();
                    System.out.println("x: Ingrese url");
                    pagina.setUrl(sc.next());
                    System.out.println("Ingrese título");
                    String titulo = sc.next();
                    pagina.setTitulo(titulo);
                    pagina.setFechaAcceso(new Date());
                    historial.push(pagina);
                    break;
                case 2:
                    historial.pop();
                    break;
                case 3:
                    System.out.println(historial.toString());
                    break;
                default:
                    System.out.println("x: Opción inválida");
                    break;
            }
            System.out.print("s:1. Busca una direccion url. 2: Retrocede. 3: Ve el historial. 0: Para salir: ");
            opt = sc.nextInt();
        }
    }
}
