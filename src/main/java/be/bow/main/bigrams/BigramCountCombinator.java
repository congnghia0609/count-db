package be.bow.main.bigrams;

import be.bow.db.combinator.Combinator;

/**
* Created by Koen Deschacht (koendeschacht@gmail.com) on 9/22/14.
*/
public class BigramCountCombinator implements Combinator<BigramCount> {

    @Override
    public BigramCount combine(BigramCount first, BigramCount second) {
        return new BigramCount(first.getFirstWord(), first.getSecondWord(), first.getCount() + second.getCount());
    }
}