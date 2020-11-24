package lottery.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ShufflePicker implements Picker {
    private final List<Integer> basis;

    public ShufflePicker(int min, int max) {
        basis = IntStream.rangeClosed(min, max).collect(ArrayList::new, List::add, List::addAll);
    }

    @Override
    public List<Integer> pick() {
        List<Integer> candidate = new ArrayList<>(basis);
        Collections.shuffle(candidate);
        return candidate.subList(0, 6);
    }
}
