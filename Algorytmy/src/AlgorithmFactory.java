import Algorithms.AbstractAlgorithm;
import Algorithms.PoorCamelCase;
import Algorithms.SpecialCamelCase;
import Algorithms.Test;


public class AlgorithmFactory {
    public AbstractAlgorithm getAlgorithm(String name) throws Exception{
        switch(name){
            case "test":
                return new Test();
            case "poorcamelcase":
                return new PoorCamelCase();
            case "specialcamelcase":
                return new SpecialCamelCase();

            default:
                    throw new Exception("Nie ma takiego algorytmu");
        }
    }
}
