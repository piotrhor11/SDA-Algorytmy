package Algorithms;

public abstract class AbstractAlgorithm {

    public AbstractAlgorithm(){
        System.out.println("Konstruktor Abstract Algorithms");
    }

    public abstract String getName();
    public abstract void runAlgorithm(String[] input);

}
