import MyThread.Talkative;

public class Aplication {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Talkative talkative = new Talkative(i); // Création d'un nouvel objet Talkative avec un entier unique
            Thread thread = new Thread(talkative); // Création d'un nouveau Thread avec l'objet Talkative comme paramètre
            thread.setName("Thread " + i); // Attribution d'un nom unique pour chaque Thread
            thread.start(); // Démarrage du Thread
        }
    }
}