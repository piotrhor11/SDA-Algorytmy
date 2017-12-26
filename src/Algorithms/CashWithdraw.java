package Algorithms;

public class CashWithdraw extends AbstractAlgorithm {

    @Override
    public String getName() {
        return "Cash Withdraw";
    }

    @Override
    public void runAlgorithm(String[] input) {

        final int[] zlote = {200, 100, 50, 20, 10, 5, 2, 1};
        final int[] grosze = {50, 20, 10, 5, 2, 1};

        int[] wydaneZl = new int[zlote.length];
        int[] wydaneGr = new int[grosze.length];

        int kwotaZl = Integer.parseInt(input[1]);
        int kwotaGr = Integer.parseInt(input[2]);

        System.out.println("Wydajemy " + kwotaZl + "zł i " + kwotaGr + "gr:");

        for (int i = 0; i < zlote.length; i++) {                //Pętla na złotówki
            for (int j = 0; kwotaZl >= zlote[i]; j++) {
                kwotaZl = kwotaZl - zlote[i];
                wydaneZl[i]++;
            }
            if (wydaneZl[i] > 0) {
                System.out.printf("%d x %d zł\n", wydaneZl[i], zlote[i]);
            }
        }

        for (int i = 0; i < grosze.length; i++) {           //Pętla na grosze
            while (kwotaGr >= grosze[i]) {
                kwotaGr -= grosze[i];
                wydaneGr[i]++;
            }
            if (wydaneGr[i] > 0) {
                System.out.printf("%d x %d grosze\n", wydaneGr[i], grosze[i]);
            }
        }


    }
}
