package creational.singleton;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Singleton {

    private static volatile Singleton instance;
    private static volatile Lock lock = new ReentrantLock();

    private Singleton() {}

    public static Singleton getInstance() {
        lock.lock();
        try {
            if (instance == null)
                instance = new Singleton();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return instance;
    }
}
