package com.alpha.work2;

public class Runner {
    public void run(){
    printCads(newCards());

    }

    public Card[] newCards(){
         Card[] cards = new Card[52];

//         for (int i = 0; i<cards.length; i++){
//             cards[i] = new Card (Rank.values()[0 + (int) (Math.random() * Rank.values().length)],
//                            Suit.values()[0 + (int) (Math.random() * Suit.values().length)]);
//         }
        int i = 0;
        for (Rank rank: Rank.values()) {
            for (Suit suit: Suit.values()) {
                cards[i] = new Card(rank,suit);
                i++;
            }
        }

         return cards;
    }

    public void printCads(Card[] cards){

        for (Card write:
             cards) {
            System.out.println(write);

        }
    }
}
