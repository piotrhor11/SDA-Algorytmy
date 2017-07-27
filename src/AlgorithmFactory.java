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
            case "inputnumberssum":
                return new InputNumbersSum();
            case "cashwithdraw":
                return new CashWithdraw();
            case "leapyear":
                return new LeapYear();
            case "factorial":
                return new Factorial();
            case "recursionsum":
                return new RecursionSum();
            case "factorialending":
                return new FactorialEnding();
            case "fibonaccinumbers":
                return new FibonacciNumbers();
            case "caesarcipher":
                return new CaesarCipher();
            case "bubbelsort":
                return new BubbelSort();
            case "sortdistances":
                return new SortDistances();
            case "countingsort":
                return new CountingSort();

            default:
                throw new Exception("Nie ma takiego algorytmu");
        }
    }
}
