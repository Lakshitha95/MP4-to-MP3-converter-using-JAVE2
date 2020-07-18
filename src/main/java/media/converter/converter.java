package media.converter;


public abstract class converter extends Thread{
    protected abstract void encode();
    public abstract void run();
}