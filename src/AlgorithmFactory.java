import Algorithms.*;

public class AlgorithmFactory {
    public AbstractAlgorithm getAlgorithm(String name) throws Exception {
        switch (name) {
            case "test":
                return new Test();
            case "naturalnumberssum":
                return new NaturalNumbersSum();     // "Algorytmy" - Slajd 13
            case "inputnumberssum":
                return new InputNumbersSum();       // "Algorytmy" = Slajd 20
            case "cashwithdraw":
                return new CashWithdraw();          // "Algorytmy" - Slajd 21
            case "leapyear":
                return new LeapYear();              // "Algorytny" = Slajd 22
            case "caesarcipher":
                return new CaesarCipher();          // "Algorytmy" - slajd 23
            case "factorial":
                return new Factorial();             // "Algorytmy" - slajd 26
            case "factorialending":
                return new FactorialEnding();       // "Algorytmy" - slajd 27
            case "fibonaccinumbers":
                return new FibonacciNumbers();      // "Algorytmy" - slajd 28
            case "recursionsum":
                return new RecursionSum();
            case "bubbelsort":
                return new BubbelSort();            // "Algorytmy" - slajd 35
            case "sortdistances":
                return new SortDistances();         // "Algorytmy" - slajd 36
            case "countingsort":
                return new CountingSort();          // "Algorytmy" - slajd 41
            case "battleshipboard":
                return new BattleshipBoard();
            case "battleshipboard2":
                return new BattleshipBoard2();
            case "tables":
                return new Tables();                    // "Struktury danych" - Slajd 10
            case "tablesminmax":
                return new TablesMinMax();              // "Struktury danych" - Slajd 13
            case "tablesleader":
                return new TablesLeader();              // "Struktury danych" - Slajd 14
            case "mylisttest":
                return new MyListTest();
//            case "decimaltobinaryandhex":
//                return new NumeralSystemConverter();     //"Struktury danych" - Slajd 63
            case "simpletree":
                return new SimpleTree();                //"Struktury danych" - Slajd 87
            case "heaptest":
                return new HeapTest();                  //"Struktury danych" - Slajd 99

            //Zadania z listy z piątku 28.07.2017
            case "gtc":
                return new GreatestCommonDivisor();
            case "draughts":
                return new Draughts();
            case "mode":
                return new Mode();                      //Dominanta
            case "testanswers":
                return new TestAnswers();
            case "daycheck":
                return new DayCheck();

            //Zadania z listy z piątku 04.08.2017
            case "duplication":
                return new Duplication();
            case "deleteinarraylist":
                return new DeleteInArrayList();
            case "myonewaylisttest":
                return new MyOneWayListTest();
            case "palindromecheck":
                return new PalindromeCheck();
            case "reversepolishnotationtranslator":
                return new ReversePolishNotationTranslator();

            //Zadania ze zbioru zadań
            case "easter":
                return new Easter();                    // zad 1
            case "poorcamelcase":
                return new PoorCamelCase();             // zad 2
            case "specialcamelcase":
                return new SpecialCamelCase();          // zad 3
            case "leastcommonmultiple":
                return new LeastCommonMultiple();       // zad 11
            case "reversepolishnotation":
                return new ReversePolishNotation();     // zad 15

            //Zadania domowe ze zbioru zadań
            case "palindromesum":
                return new PalindromeSum();             // zad domowe 1
            case "marker":
                return new Marker();                    // zad domowe 2

            default:
                throw new Exception("Nie ma takiego algorytmu");
        }
    }
}
