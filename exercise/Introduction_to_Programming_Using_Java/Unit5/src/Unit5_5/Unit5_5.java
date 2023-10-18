package Unit5_5;

import Unit5_4.BlackjackHand;
import Unit5_4.Card;
import Unit5_4.Deck;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Unit5_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = 100;
        boolean winCheck = false;
        while (true) {
            System.out.println("Now Money is : " + money);
            int bet = Integer.MIN_VALUE;
            while (bet == Integer.MIN_VALUE) {
                System.out.println("Enter bat amount");
                bet = Integer.parseInt(br.readLine());
                if (bet > money) {
                    bet = Integer.MIN_VALUE;
                }
            }
            money = game() ? money + bet : money - bet;
            if (money < 0) {
                System.out.println("Money loss");
                break;
            }
        }
        br.close();
    }

    private static boolean game() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deck deck = new Deck();
        BlackjackHand player = new BlackjackHand();
        BlackjackHand dealer = new BlackjackHand();

        deck.shuffle();
        player.addCard(deck.dealCard());
        dealer.addCard(deck.dealCard());
        player.addCard(deck.dealCard());
        dealer.addCard(deck.dealCard());

        if (dealer.getBlackjackValue() == 21) {
            System.out.println("Dealer's BlackjackValue =21");
            return false;
        }
        if (player.getBlackjackValue() == 21) {
            System.out.println("player's BlackjackValue =21");
            return true;
        }
        while (true) {
            System.out.println("Player's card list");
            for (int i = 0; i < player.getCardCount(); i++) {
                System.out.println(player.getCard(i) + " ");
            }
            System.out.println("Player BlackjackValue is " + player.getBlackjackValue());
            System.out.println("Dealer's one card is " + dealer.getCard(0));
            System.out.print("choose Hit(H) or Stand(S) >> ");
            char addOrStop = br.readLine().charAt(0);
            while (addOrStop != 'H' && addOrStop != 'S') {
                if (addOrStop != 'H' && addOrStop != 'S') {
                    System.out.println("Enter H or S");
                }
            }
            if (addOrStop == 'S') {
                break;
            } else {
                Card card = deck.dealCard();
                player.addCard(card);
                System.out.println("player Added card is " + card);
                System.out.println("Player BlackjackValue is " + player.getBlackjackValue());
                if (player.getBlackjackValue() > 21) {
                    System.out.println("player blackjackValue is over 21");
                    return false;
                }
            }
        }
        // S를 입력할 경우
        while (dealer.getBlackjackValue() <= 16) {
            Card card = deck.dealCard();
            System.out.println("dealer Added card is " + card);
            dealer.addCard(card);
            if (dealer.getBlackjackValue() > 21) {
                System.out.println("dealer blackjackValue is over 21");
                return true;
            }
        }
        if (player.getBlackjackValue() == dealer.getBlackjackValue()) {
            System.out.println("BlackjackValue is same");
            return false;
        } else if (player.getBlackjackValue() < dealer.getBlackjackValue()) {
            System.out.println("dealer BlackjackValue is more");
            return false;
        } else {
            return true;
        }
    }
}
