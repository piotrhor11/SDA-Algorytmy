package Algorithms;

import java.util.Arrays;

public class MergeSort extends AbstractAlgorithm {

    @Override
    public String getName() {
        return "Merge Sort";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int[] tabData = new int[input.length - 1];

        System.out.printf("Ciąg do posortowania: ");
        for (int i = 0; i < tabData.length; i++) {
            tabData[i] = Integer.parseInt(input[i + 1]);
            System.out.printf("%d ", tabData[i]);
        }

        sortTab(tabData, 0, tabData.length - 1);        //Kopiujemy wartość referencji tabData, tym samym w metodzie będziemy operować na tabData, a nie na jej kopii!

        System.out.printf("\nCiąg posortowany: ");
        for (int a : tabData) {
            System.out.printf("%d ", a);
        }
    }

    private void sortTab(int[] tab, int first, int last) {          //Argumenty to indeksy wycinające fragment tab do posortowania

        if (last - first >= 1) {
            int half = (first + last) / 2;                           //Szukamy indeksu w połowie tablicy, a następnie rekursją wywołujemy sortowanie dla obu połówek osobno
            sortTab(tab, first, half);
            sortTab(tab, half + 1, last);

        /*Scalanie będzie przebiegało porównując pierwsze wartości z obu części tablic. W najgorszym przypadku cała prawa część zastąpi nam lewą po sortowaniu.
          To implikuje potrzebę stworzenia dodatkowego akumulatora (kopii lewej części tablicy).
          Aby tego uniknąć podczas zapisu elementu z prawej części element z lewej będący w zapisywanym miejscu zostanie zapisany w miejsce prawego przesuwając nam początek tablicy na jej koniec.
          Np. dla [L5,L7,L9,L12,P1,P3,P8,P11] po 2 przejściach mielibyśmy [1,3,L9,L12,L5,L7,P8,P11], gdzie L i P oznaczają pozostałe wartości odpowiednio lewej(L) i prawej(P) częsci tablicy.
          Należy w jakiś sposób zająć się sytuacją, w której początek lewej części tablicy de facto ląduje na jej końcu ale wymaga to ciut więcej wysiłku.
          Z tego powodu implementuję wersję z akumulatorem o długości połowy tablicy wejściowej (kopią lewej częsci).*/

            //ToDo OPTYMALIZACJA: Zaimplementować rozwiązanie bez akumulatora zmieniąc tablicę na linkedlistę

            int[] tabLeftCopy = Arrays.copyOfRange(tab, first, half + 1);          //Kopia lewej części tablicy posłuży jako akumulator, skopiowana tablica [first, ..., half]!!!
            int indexLeft = 0;                                                         //Ponieważ mamy kopię tablicy to początek zawsze będzie od 0
            int indexRight = half + 1;
            int index = first;

            while (indexLeft < tabLeftCopy.length && indexRight <= last) {             //Pętla się wykonuje aż do momentu, kiedy dojdziemy do końca którejś z częsci tablicy

                if (tabLeftCopy[indexLeft] <= tab[indexRight]) {
                    tab[index] = tabLeftCopy[indexLeft];
                    indexLeft++;
                } else {
                    tab[index] = tab[indexRight];
                    indexRight++;
                }
                index++;
            }

        /*Jeżeli lewa część została skopiowana cała to nic nie musimy robić, bo prawa część i tak już jest na końcu tablicy.
          W przeciwnym wypadku musimy pozostałe elementy części lewej skopiować na koniec tablicy.
          Poniża pętla for wykona się jedynie dla drugiego przypadku*/

            for (; indexLeft <= half - first; indexLeft++) {
                tab[index] = tabLeftCopy[indexLeft];
                index++;
            }
        }
    }
}