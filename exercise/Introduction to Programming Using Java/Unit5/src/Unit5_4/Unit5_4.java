package Unit5_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Unit5_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        Deck deck = new Deck();
        Card card;
        BlackjackHand hand;
        int cardNum;
        boolean stop = false;
        while(!stop){
            sb = new StringBuilder();
            deck.shuffle();
            hand = new BlackjackHand();
            cardNum = 2 + (int)(Math.random()*5);
            System.out.println("전체 카드 수는 "+ cardNum+ "입니다");
            for(int i=0; i<cardNum; i++){
                card = deck.dealCard();
                hand.addCard(card);
                sb.append(card + ", ");
            }
            sb.delete(sb.length() - 2, sb.length());
            System.out.println(sb);
            System.out.println("BlackjackValue : " + hand.getBlackjackValue());
            System.out.print("If you want stop, enter true >> ");
            stop = Boolean.valueOf(br.readLine());
        }
    }
}
