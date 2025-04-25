// import controllers.PersonaController;
// import models.Direccion;
// import models.Persona;
// import view.viewConsole;

// public class App {
//     public static void main(String[] args) throws Exception {
//         // Crear un arreglo de 5 personas
//         Persona[] personas = new Persona[5];

//         // Crear direcciones y personas
//         personas[0] = new Persona("Maria", 30,new Direccion("Calle 2", 23, 56));
//         personas[1] = new Persona("Pedro", 35, new Direccion("Calle 3", 34, 67));
//         personas[2] = new Persona("Ana", 28, new Direccion("Calle 4", 45, 78));
//         personas[3] = new Persona("Juan", 25, new Direccion("Calle 1", 12, 45));
//         personas[4] = new Persona("Luis", 40, new Direccion("Calle 5", 56, 89));
//     }

//     PersonaController pC = new PersonaController();
//     viewConsole vC = new viewConsole();
//     vC.printArray(personas);
//     pC.sortByDireccionCodigo(personas);
//     vC.printPersonas(personas);
//     Persona pB= pC.findPersonasByCodigo(personas, persona)
//     if (pB==null){
//         System.out.println("No existe");
//     }else{
//         System.out.println("La persona es "+pB);
//     }
// }

import controllers.PersonaController;
import models.Direccion;
import models.Persona;
import view.viewConsole;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Crear un arreglo de 5 personas
        Persona[] personas = new Persona[5];

        // Crear direcciones y personas
        personas[0] = new Persona("Maria", 30, new Direccion("Calle 2", 23, 56));
        personas[1] = new Persona("Pedro", 35, new Direccion("Calle 3", 34, 67));
        personas[2] = new Persona("Ana", 28, new Direccion("Calle 4", 45, 78));
        personas[3] = new Persona("Juan", 25, new Direccion("Calle 1", 12, 45));
        personas[4] = new Persona("Luis", 40, new Direccion("Calle 5", 56, 89));

        // Lógica de controlador y vista
        PersonaController pC = new PersonaController();
        viewConsole vC = new viewConsole();

        vC.printArray(personas);

        // Ordenar
        pC.sortByDireccionCodigo(personas);
        System.out.println("\nPersonas ordenadas:");
        vC.printArray(personas);

        // Buscar
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el código de dirección a buscar: ");
        int codigo = sc.nextInt();

        Persona pB = pC.findPersonasByCodigo(personas, codigo);

        if (pB == null) {
            System.out.println("No existe");
        } else {
            System.out.println("La persona es: " + pB);
        }
    }
}
