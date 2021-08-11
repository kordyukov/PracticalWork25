package com.alpha.work2;

public class Runner {
    public void run(){
    PrintCads(NewCards());

    }

    public Card[] NewCards(){
         Card[]cards = new Card[52];

         for (int i = 0; i<cards.length; i++){
             cards[i] = new Card (Rank.values()[0 + (int) (Math.random() * Rank.values().length)],
                            Suit.values()[0 + (int) (Math.random() * Suit.values().length)]);
         }
         return cards;
    }

    public void PrintCads(Card[] cards){
        int i = 1;
        for (Card write:
             cards) {
            System.out.println(i + " - " + write);
            i++;
        }
    }
}
