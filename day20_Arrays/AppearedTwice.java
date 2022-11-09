package day20_Arrays;

public class AppearedTwice {
    public static void main(String[] args) {
        char[] chars = {'A','A','A','B','C','C','D','D','D'};
        String[] words = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};


        for (int j = 0; j < words.length; j++) {

            String element = words[j]; //"Java"
            int frequency =0;
            for (int i = 0; i < words.length; i++) { // finds the frequency of element from array
                if(words[i].equals(element)){
                    frequency++;
                }
            }

            if(frequency == 1){
                System.out.println(element);
            }

        }
    }
}
