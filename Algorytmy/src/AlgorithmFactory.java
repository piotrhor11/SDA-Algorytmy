import Algorithms.AbstractAlgorithm;
import Algorithms.Test;

/**
 * Created by RENT on 2017-07-21.
 */
public class AlgorithmFactory {
    public AbstractAlgorithm getAlgorithm(String name) throws Exception{
        switch(name){
            case "test":
                return new Test();
            default:
                    throw new Exception("Nie ma takiego algorytmu");
        }
    }
}
