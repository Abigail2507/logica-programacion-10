/* Crear un diccionario Español-Inglés, que contenga al menos 20 palabras (con traducción).
Utilizar un objeto HashMap para almacenar los pares de palabras.
Escoger al azar 5 palabras en español del mini diccionario.
Pedir al usuario que teclee la traducción al inglés de cada una de las palabras y comprobará si son correctas.
Al final debe mostrar por consola cuántas respuestas correctas e incorrectas tiene el usuario. */
    
    import java.util.HashMap;
    import java.util.Random;
    import java.util.Scanner;
    
    public class RRLPD10 {
    
        private static final HashMap<String, String> Diccionario = new HashMap<>();
        private static final Random Random = new Random();
        private static final Scanner scanner = new Scanner(System.in);
    
        public static void main(String[] args) {
            llenarDiccionario();
    
            String[] palabrasEspanol = new String[5];
            for (int i = 0; i < palabrasEspanol.length; i++) {
                palabrasEspanol[i] = obtenerPalabraAleatoria();
            }
            int correctas = 0;
            int incorrectas = 0;
            for (String palabraEspanol : palabrasEspanol) {
                System.out.println("¿Traduce \"" + palabraEspanol + "\" al inglés?");
                String respuestaUsuario = scanner.nextLine().trim();
                String traduccionCorrecta = Diccionario.get(palabraEspanol);
                if (respuestaUsuario.equalsIgnoreCase(traduccionCorrecta)) {
                    correctas++;
                } else {
                    incorrectas++;
                }
            }
    
            System.out.println("Respuestas correctas: " + correctas);
            System.out.println("Respuestas incorrectas: " + incorrectas);
        }
    
        private static void llenarDiccionario() {
        Diccionario.put("mujer", "woman");
        Diccionario.put("desarrolladora", "developer");
        Diccionario.put("tarea", "task");
        Diccionario.put("tambien", "also");
        Diccionario.put("incluso", "even");
        Diccionario.put("obtener", "get");
        Diccionario.put("colocar", "set");
        Diccionario.put("Base de datos", "Database");
        Diccionario.put("desventaja", "drawback");
        Diccionario.put("entorno", "environment");
        Diccionario.put("mantener", "maintain");
        Diccionario.put("reiniciar", "reboot");
        Diccionario.put("resolver", "solve");
        Diccionario.put("integer", "entero");
        Diccionario.put("cadena", "string");
        Diccionario.put("bucle", "loop");
        Diccionario.put("si", "if");
        Diccionario.put("ademas", "else");
        }
    
        private static String obtenerPalabraAleatoria() {
            int indiceAleatorio = Random.nextInt(Diccionario.size());
            return (String) Diccionario.keySet().toArray()[indiceAleatorio];
        }
    }
    