package be.bagofwords.db.data;

import be.bagofwords.db.combinator.Combinator;

public class CompactCountsIndexCombinator implements Combinator<CompactCountsIndex> {

    @Override
    public CompactCountsIndex combine(CompactCountsIndex first, CompactCountsIndex second) {
        return first.mergeWith(second);
    }
}
