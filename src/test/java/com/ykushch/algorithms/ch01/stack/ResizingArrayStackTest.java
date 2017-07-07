package com.ykushch.algorithms.ch01.stack;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class ResizingArrayStackTest {
    @Test
    public void shouldPopString() throws Exception {
        ResizingArrayStack<String> stackOfStrings = new ResizingArrayStack<>();
        stackOfStrings.push("1");
        stackOfStrings.push("2");
        Assertions.assertThat(stackOfStrings.pop()).isEqualTo("2");
    }

    @Test
    public void shouldCheckEmptinessWhenStackIsNotEmpty() throws Exception {
        ResizingArrayStack<String> stackOfStrings = new ResizingArrayStack<>();
        stackOfStrings.push("1");
        stackOfStrings.push("2");
        Assertions.assertThat(stackOfStrings.isEmpty()).isEqualTo(false);
    }

    @Test
    public void shouldReturnCorrectSizeWhenThereAreTwoElements() throws Exception {
        ResizingArrayStack<String> stackOfStrings = new ResizingArrayStack<>();
        stackOfStrings.push("1");
        stackOfStrings.push("2");
        Assertions.assertThat(stackOfStrings.size()).isEqualTo(2);
    }
}
