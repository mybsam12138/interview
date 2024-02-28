package com.interview.transform.transformer;

import com.interview.transform.transformer.impl.RemoveConsecutiveTransformer;
import com.interview.transform.transformer.impl.ReplaceWithPrevCharTransformer;

import java.util.Map;

/**
 * Factory design pattern
 */
public class TransformerFactory {
    //  Map.of is new feature above java8.
    public static final Map<String, Transformer> TRANSFORMER_MAP = Map.of(
            TransformerType.REMOVE_CONSECUTIVE.getName(), new RemoveConsecutiveTransformer(),
            TransformerType.REPLACE_WITH_PREV_CHAR.getName(), new ReplaceWithPrevCharTransformer()
            // Add new transformers here
    );

    // Private constructor to prevent instantiation
    private TransformerFactory() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}
