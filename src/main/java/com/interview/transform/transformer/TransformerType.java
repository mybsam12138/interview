package com.interview.transform.transformer;

public enum TransformerType {
    REMOVE_CONSECUTIVE("RemoveConsecutive"),
    REPLACE_WITH_PREV_CHAR("ReplaceWithPrevChar");

    private final String name;

    TransformerType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
