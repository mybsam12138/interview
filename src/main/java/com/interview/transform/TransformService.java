package com.interview.transform;

public class TransformService {
    public String transform(String transformType, String input) throws TransformationException {
        try {
            Transformer transformer = TransformerFactory.TRANSFORMER_MAP.get(transformType);
            return transformer.transform(input);
        } catch (Exception e) {
            throw new TransformationException("Error during transformation process", e);
        }
    }
}
