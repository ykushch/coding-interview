package com.ykushch.solution.ch01;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class UrlifyTest {

    @Test
    public void shouldTransformIntoUrlWhenPlainStringIsPassed() throws Exception {
        char[] arr = "Mr John Smith    ".toCharArray();
        Urlify.make(arr, 13);
        Assertions.assertThat(arr).isEqualTo("Mr%20John%20Smith".toCharArray());
    }

    @Test
    public void shouldTransformIntoUrlUsingStringMethodsWhenPlainStringIsPassed() throws Exception {
        String str = "Mr John Smith    ";
        String actual = Urlify.make(str);
        Assertions.assertThat(actual).isEqualTo("Mr%20John%20Smith");
    }
}
