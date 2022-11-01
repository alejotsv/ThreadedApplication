package com.java21days;

public class PrimeThreads {
    public static void main(String[] args) {
        PrimeThreads pt = new PrimeThreads(args);
    }

    public PrimeThreads(String[] args){
        PrimeFinder[] finder = new PrimeFinder[args.length];
        for(int i=0; i<args.length; i++){
            try{
                long count = Long.parseLong(args[i]);
                finder[i] = new PrimeFinder(count);
                System.out.println("Looking for primer " + count);
            } catch (NumberFormatException nfe) {
                System.out.println("Error: " + nfe.getMessage());
            }
        }
    }
}
