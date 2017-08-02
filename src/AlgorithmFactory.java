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
            case "leapyear":                //Rok 
                return new LeapYear();
            case "factorial":               // Silnia
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
            case "battleshipboard":
                return new BattleshipBoard();
            case "tables":
                return new Tables();            // "Struktury danych" - Slajd 10
            case "tablesminmax":
                return new TablesMinMax();      // "Struktury danych" - Slajd 13
            case "tablesleader":
                return new TablesLeader();      // "Struktury danych" - Slajd 14
            case "listtest":
                return new ListTest();
            case "simpletree":
                return new SimpleTree();        //"Struktury danych" - Slajd 87

            //Zadania z listy z piątku 28.07.2017
            case "gtc":
                return new GreatestCommonDivisor();
            case "draughts":
                return new Draughts();
            case "mode":
                return new Mode();      //Dominanta
            case "testanswers":
                return new TestAnswers();
            case "daycheck":
                return new DayCheck();
            //Koniec listy z piątku 28.07.2017

            case "easter":
                return new Easter();    // Zbiór zadań - zad1

            //Zadania domowe
            case "homework1":
                return new Homework1();

            default:
                throw new Exception("Nie ma takiego algorytmu");
        }
    }
}
