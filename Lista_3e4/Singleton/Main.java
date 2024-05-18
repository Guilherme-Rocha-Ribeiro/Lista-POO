package Lista_3e4.Singleton;

public class Main {
    public static void main(String[] args){
        //Singleton s = new Singleton();
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if (s1==s2) {
            System.out.println("Mesmo endereço de memória");
        }

    }
}
