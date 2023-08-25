package org.example.level1;

public class card {

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        int card1Index = 0;
        int card2Index = 0;

        for (int i = 0; i < goal.length; i++) {
            if(card1Index < cards1.length && goal[i].equals(cards1[card1Index])) {
                card1Index++;
                continue;
            }

            if(card2Index < cards2.length && goal[i].equals(cards2[card2Index])) {
                card2Index++;
                continue;
            }

            answer = "No";
            return answer;
        }

        return answer;
    }
    public static void main(String[] args) {
        card card = new card();
        String[] card1 = {"월","수","화"};
        String[] card2 = {"목","금","토","일"};
        String[] goal = {"월","화","수","목","금","토","일"};
        System.out.println(card.solution(card1,card2,goal));
    }
}
