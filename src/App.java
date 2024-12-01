public class App {
    public static void main(String[] args) {
        Repositorio<String> repoDeStrings = new Repositorio<>();
        repoDeStrings.agregar("Elemento 1");
        repoDeStrings.agregar("Elemento 2");
        System.out.println("Repositorio de Strings: " + repoDeStrings.obtenerTodos());

        Repositorio<Integer> repoDeNumeros = new Repositorio<>();
        repoDeNumeros.agregar(10);
        repoDeNumeros.agregar(20);
        System.out.println("Repositorio de Números: " + repoDeNumeros.obtenerTodos());

        Par<String, Integer> miPar = new Par<>("Edad", 30);
        System.out.println("Par: " + miPar);
    }
}

    
