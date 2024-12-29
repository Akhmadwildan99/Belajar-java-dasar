package Dans;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DansAward {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);


        List<Integer> inputList1 = new ArrayList<>();

        System.out.println("Input value 1: ");
        while (scanner1.hasNextLine()) {
            String item = scanner1.nextLine();
            if (item.isEmpty()) {
                break;
            }
            inputList1.add(Integer.valueOf(item));
        }


        System.out.println("Input value 2: ");
        Scanner scanner2 = new Scanner(System.in);
        List<Integer> inputList2 = new ArrayList<>();

        while (scanner2.hasNextLine()) {
            String item = scanner2.nextLine();
            if (item.isEmpty()) {
                break;
            }
            inputList2.add(Integer.valueOf(item));
        }

        DansAward dansAward = new DansAward();
        List<Integer> award = dansAward.compare2Reward(inputList1, inputList2);

        System.out.println(award);
    }

    List<Integer> compare2Reward(List<Integer> a, List<Integer> b) {
        int aReward= 0;
        int bReward= 0;

        for (int i = 0; i < 3; i++) {

                    if(a.get(i).compareTo(b.get(i)) > 0) {
                        aReward += 1;
                    } else if (b.get(i).compareTo(a.get(i)) > 0) {
                        bReward += 1;
                    }

        }


        return List.of(aReward, bReward);
    }
}
