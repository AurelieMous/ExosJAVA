package hello;
/** Ceci est une implémentation du message traditionnel "Hello world!"
* @author L'équipe Education d'OpenClassrooms
*/
public class HelloWorld {
    /** Le programme commence ici */
    public static void main(String[] args) {
        sayHelloTo("Julian");
    }
    private static void sayHelloTo(String recipient){
        System.out.println("Hello " + recipient);
    }
}

