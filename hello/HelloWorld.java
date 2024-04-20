package hello;
/** Ceci est une implémentation du message traditionnel "Hello world!"
* @author L'équipe Education d'OpenClassrooms
*/
public class HelloWorld {
    /** Le programme commence ici */
    public static void main(String[] args) {
        String helloWorld = "Hello World !";
        helloWorld = helloWorld.toUpperCase();

        System.out.println(helloWorld);
    }
}