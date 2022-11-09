package day21_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {
        String[] words = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};


        for (String each : words) {// each: "Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"


            int count = 0;
            for (String element : words){
                if (element.equals(each)){
                    count++;
                }

            }
            if(count == 1){
                System.out.println(each);
            }


        }
    }
}
