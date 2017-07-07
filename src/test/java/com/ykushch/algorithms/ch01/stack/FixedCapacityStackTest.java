package com.ykushch.algorithms.ch01.stack;

import com.ykushch.algorithms.ch01.stack.FixedCapacityStack;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FixedCapacityStackTest {

    @Test
    public void shouldPopString() throws Exception {
        FixedCapacityStack<String> stackOfStrings = new FixedCapacityStack<>(100);
        stackOfStrings.push("1");
        stackOfStrings.push("2");
        Assertions.assertThat(stackOfStrings.pop()).isEqualTo("2");
    }

    @Test
    public void shouldCheckEmptinessWhenStackIsNotEmpty() throws Exception {
        FixedCapacityStack<String> stackOfStrings = new FixedCapacityStack<>(100);
        stackOfStrings.push("1");
        stackOfStrings.push("2");
        Assertions.assertThat(stackOfStrings.isEmpty()).isEqualTo(false);
    }

    @Test
    public void shouldReturnCorrectSizeWhenThereAreTwoElements() throws Exception {
        FixedCapacityStack<String> stackOfStrings = new FixedCapacityStack<>(100);
        stackOfStrings.push("1");
        stackOfStrings.push("2");
        Assertions.assertThat(stackOfStrings.size()).isEqualTo(2);
    }

}
