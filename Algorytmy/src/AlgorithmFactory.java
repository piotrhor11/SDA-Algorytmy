import Algorithms.*;


public class AlgorithmFactory {
    public AbstractAlgorithm getAlgorithm(String name) throws Exception {
        switch (name) {
            case "test":
                return new Test();
            case "poorcamelcase":
                return new PoorCamelCase();
            case "specialcamelcase":
                return new SpecialCamelCase();
            case "naturalnumberssum":
                return new NaturalNumbersSum();
//            case "inputnumberssum":
//                return new InputNumbersSum();
//            case "cashwithdraw":
//                return new CashWithdraw();
//            case "leapyear":
//                return new LeapYear();

            default:
                throw new Exception("Nie ma takiego algorytmu");
        }
    }
}
