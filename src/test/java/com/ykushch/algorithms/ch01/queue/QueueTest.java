package com.ykushch.algorithms.ch01.queue;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class QueueTest {

    @Test
    public void shouldPopString() throws Exception {
        Queue<String> queueOfStrings = new Queue<>();
        queueOfStrings.enqueue("1");
        queueOfStrings.enqueue("2");
        Assertions.assertThat(queueOfStrings.dequeue()).isEqualTo("1");
    }

    @Test
    public void shouldCheckEmptinessWhenStackIsNotEmpty() throws Exception {
        Queue<String> queueOfStrings = new Queue<>();
        queueOfStrings.enqueue("1");
        queueOfStrings.enqueue("2");
        Assertions.assertThat(queueOfStrings.isEmpty()).isEqualTo(false);
    }

    @Test
    public void shouldReturnCorrectSizeWhenThereAreTwoElements() throws Exception {
        Queue<String> queueOfStrings = new Queue<>();
        queueOfStrings.enqueue("1");
        queueOfStrings.enqueue("2");
        Assertions.assertThat(queueOfStrings.size()).isEqualTo(2);
    }
}
