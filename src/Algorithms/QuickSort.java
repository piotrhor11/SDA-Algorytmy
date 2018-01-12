package Algorithms;

import java.util.Arrays;
import java.util.Random;

public class QuickSort extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Quick Sort";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int[] tabData = new int[input.length - 1];

        System.out.printf("Ciąg do posortowania: ");
        for (int i = 0; i < tabData.length; i++) {
            tabData[i] = Integer.parseInt(input[i + 1]);
            System.out.printf("%d ", tabData[i]);
        }

        sortTab(tabData, 0, tabData.length - 1);

        System.out.printf("\nPosortowany ciąg: ");
        for (int a : tabData) {
            System.out.printf("%d ", a);
        }

    }

    private void sortTab(int[] tab, int first, int last) {

        if (first < last) {                             //Jeżeli tablica zawiera minimum 2 elementy

            Random generator = new Random();
            int pivotIndex = generator.nextInt(last - first + 1) + first;       //Indeks elementu rozdzielającego jest wybierany losowo; ToDo OPTYMALIZACJA można poszukać przybliżonej mediany.
            int pivot = tab[pivotIndex];                                                //Pivot - element podziału

            tab[pivotIndex] = tab[last];                                        //Przesuwamy Pivot na koniec zbioru, a na jego miejsce wrzucamy element z końca
            tab[last] = pivot;

            int[] tabCopy = Arrays.copyOf(tab, tab.length);

            int left = first;                               // Inicjalizujemy początkowy indeks lewej części zbioru
            int right = last - 1;                           // Inicjalizujemy końcowy indeks prawej części zbioru
            for (int i = first; i < last; i++) {            // Przechodzimy przez wszystkie elementy zbioru oprócz ostatniego (Pivotu)
                if (tabCopy[i] <= pivot) {
                    tab[left] = tabCopy[i];                 // Wartości mniejsze wpisujemy od pierwszej pozycji i idziemy w górę
                    left++;
                } else {
                    tab[right] = tabCopy[i];                // Wartości większe wpisujemy od przedostatniej pozycji i idziemy w dół
                    right--;
                }
            }

            boolean swap = left < last;                     /* Jeżeli lewa część nie zajęła całości i istnieje jakiś element po prawej stronie to ustawiamy flagę zamiany, inaczej pivot zostanie na końcu
                                                               Sprawdzamy to przed korekcją indeksów, bo przy zbiorach 2-elementowych nie bylibyśmy pewni, czy pierwszy element jest z lewej, czy prawej części.*/

            left = (left > first) ? --left : left;
            right = (right < last - 1) ? ++right : right;

            /*Po skończeniu pętli poprawiamy indeksy, żeby wskazywały odpowiednio: left - na ostatni element lewej części, right - na pierwszy element prawej części.
            Oczywiście jeżeli któryś z warunków w powyższej pętli nie wystąpił ani razu to nie ma co korygować.
            //ToDo Tak wiem, mało przyjazne rozwiązanie - jak znajdę chwilę to postaram się pozbyć tej topornej obsługi indeksów!
            */

            if (swap) {                         // Przesuwamy Pivot na początek prawej części zbioru (o ile flaga swap aktywna), a element z początku prawej części zbioru na koniec
                tab[last] = tab[right];
                tab[right] = pivot;
            }

            sortTab(tab, first, left);
            sortTab(tab, ++right, last);                   // Prawa część przesunęła się w prawo po zamianie pierwszego elementu z Pivotem

            //ToDo OPTYMALIZACJA: Ograniczenie głębokości rekursji
     /* W celu ograniczenia głębokości rekursji po wstępnym podziale zbioru możemy najpierw uporządkować jego krótszą część,
      a dłuższą poddać ponownie podziałowi i dopiero po nim uporządkować (łącznie 3 odcinki na danym poziomie wywołania) */

        }
    }

}
