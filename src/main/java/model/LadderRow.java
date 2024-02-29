package model;

import java.util.List;

public class LadderRow {

    private final List<Line> isLines;

    public LadderRow(List<Boolean> isLines) {
        validateLadderRow(isLines);
        this.isLines = isLines.stream().map(Line::valueOf).toList();
    }

    private void validateLadderRow(List<Boolean> isLines) {
        for (int i = 1; i < isLines.size(); i++) {
            isConsecutiveTrue(isLines, i);
        }
    }

    private void isConsecutiveTrue(List<Boolean> isLines, int index) {
        if (isLines.get(index - 1) && isLines.get(index)) {
            throw new IllegalStateException("연속된 true 값이 존재하면 안됩니다");
        }
    }

    public Position move(Position position) {
        if (position.getValue() > 0 && isLines.get(position.getValue() - 1).getConnected()) {
            return position.decrement();
        }
        if (position.getValue() < isLines.size() && isLines.get(position.getValue()).getConnected()) {
            return position.increment();
        }
        return position;
    }

    public List<Line> getIsLines() {
        return isLines;
    }

    public int getLinesSize() {
        return isLines.size();
    }
}
