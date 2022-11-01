package com.java21days;

public class PrimeFinder implements Runnable {
    public long target;
    public long prime;
    public boolean finished = false;
    private Thread runner;

    PrimeFinder(long target){
        this.target = target;
        if(runner == null){
            runner = new Thread(this);
            runner.start();
        }
    }

    @Override
    public void run() {

    }
}
