package com.ykushch.solution.ch01;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueTest {
    @Test
    public void shouldReturnTrueWhenUniqueStringOfCharactersIsPassed() throws Exception {
        boolean isUnique1 = Unique.isUniqueChars("abcde");
        Assertions.assertThat(isUnique1).isEqualTo(true);

        boolean isUnique2 = Unique.isUniqueChars("kite");
        Assertions.assertThat(isUnique2).isEqualTo(true);

        boolean isUnique3 = Unique.isUniqueChars("padle");
        Assertions.assertThat(isUnique3).isEqualTo(true);
    }

    @Test
    public void shouldReturnFalseWhenNonUniqueStringOfCharactersIsPassed() throws Exception {
        boolean isUnique1 = Unique.isUniqueChars("hello");
        Assertions.assertThat(isUnique1).isEqualTo(false);

        boolean isUnique2 = Unique.isUniqueChars("apple");
        Assertions.assertThat(isUnique2).isEqualTo(false);
    }

}
