package MyThread;

public class Talkative implements Runnable {
    private int attribute;

    public Talkative(int attribute) {
        this.attribute = attribute;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Attribute value: " + attribute);
        }
    }

}

