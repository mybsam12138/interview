package com.interview.transform;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TransformServiceTest {

    private TransformService transformService;

    @BeforeAll
    void setUp() {
        transformService = new TransformService();
    }

    @Test
    void testRemoveConsecutive() throws TransformationException {
        String input = "aabcccbbad";
        String expected = "d"; // Assuming the desired outcome after removing consecutive chars is "d"
        String result = transformService.transform("RemoveConsecutive", input);
        Assertions.assertEquals(expected, result);
    }


    @Test
    void testReplaceWithPrevChar() throws TransformationException {
        String input = "abcccbad";
        String expected = "d"; // Assuming how "ReplaceWithPrevChar" should work
        String result = transformService.transform("ReplaceWithPrevChar", input);
        Assertions.assertEquals(expected, result);
    }


    @Test
    void testTransformWithEmptyString() {
        Assertions.assertDoesNotThrow(() -> {
            String resultRemove = transformService.transform("RemoveConsecutive", "");
            Assertions.assertEquals("", resultRemove);

            String resultReplace = transformService.transform("ReplaceWithPrevChar", "");
            Assertions.assertEquals("", resultReplace);
        });
    }

    @Test
    void testTransformWithInvalidOperation() {
        String input = "test";
        Assertions.assertThrows(TransformationException.class, () -> {
            transformService.transform("InvalidOperation", input);
        });
    }
}