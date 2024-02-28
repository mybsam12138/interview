package com.interview.transform.service;

import com.interview.transform.exception.TransformationException;
import com.interview.transform.transformer.Transformer;
import com.interview.transform.transformer.TransformerFactory;

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
