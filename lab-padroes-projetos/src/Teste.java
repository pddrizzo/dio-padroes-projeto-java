import edu.gof.SingletonEager;
import edu.gof.SingletonLazy;

public class Teste {
    public static void main(String[] args) throws Exception {
        
        SingletonLazy lazy = SingletonLazy.getIntancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getIntancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getIntancia();
        System.out.println(eager);
        eager = SingletonEager.getIntancia();
        System.out.println(eager);

    }
}
