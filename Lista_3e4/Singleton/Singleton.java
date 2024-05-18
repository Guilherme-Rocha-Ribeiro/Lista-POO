package Lista_3e4.Singleton;

public class Singleton {
    private static Singleton instance;

    // Construtor privado para evitar instanciar a classe diretamente
    private Singleton() {}

    // Método estático para obter a instância única da classe
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


}
