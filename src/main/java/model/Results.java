package model;

import java.util.Collections;
import java.util.List;

public class Results {
    private final List<Result> results;

    public Results(List<Result> results) {
        this.results = results;
    }

    public int size() {
        return this.results.size();
    }

    public Result findResult(Position position) {
        return results.stream()
                .filter(result -> result.isRightPosition(position))
                .findAny()
                .orElseThrow(() -> new IllegalStateException("주어진 위치에 결과가 존재하지 않습니다."));
    }

    public List<Result> getResults() {
        return Collections.unmodifiableList(results);
    }
}