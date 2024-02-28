package com.interview.transform;

public class RemoveConsecutiveTransformer implements Transformer {
    @Override
    public String transform(String input) {
        StringBuilder sb = new StringBuilder(input);
        boolean found = true;

        while (found) {
            found = false;
            for (int i = 0; i < sb.length(); i++) {
                int j = i + 1;
                while (j < sb.length() && sb.charAt(j) == sb.charAt(i)) {
                    j++;
                }
                if (j - i >= TransformServiceConstants.CONSECUTIVE_NUM) {
                    sb.delete(i, j);
                    found = true;
                    break; // Restart checking after modification
                }
            }
        }

        return sb.toString();
    }
}
