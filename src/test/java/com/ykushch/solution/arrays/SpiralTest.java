package com.ykushch.solution.arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class SpiralTest {

    @Spy
    List<List<Integer>> matrix = new ArrayList<>();

    @Test
    public void testSpiralOrder() throws Exception {
        matrix.add(new ArrayList<>(Arrays.asList(133, 241, 22, 258, 187, 150, 79, 207, 196, 401, 366, 335, 198)));
        matrix.add(new ArrayList<>(Arrays.asList(401, 55, 260, 363, 14, 318, 178, 296, 333, 296, 45, 37, 10)));
        matrix.add(new ArrayList<>(Arrays.asList(112, 374, 79, 12, 97, 39, 310, 223, 139, 91, 171, 95, 126)));
        List<Integer> compared = Arrays.asList(133, 241, 22, 258, 187, 150, 79, 207, 196, 401, 366, 335, 198, 10, 126,
                95, 171, 91, 139, 223, 310, 39, 97, 12, 79, 374, 112, 401, 55, 260, 363, 14, 318, 178, 296, 333, 296,
                45, 37);
        List<Integer> listToCompare = Spiral.spiralOrder(matrix);
        assertThat(listToCompare).isEqualTo(compared);
    }
}
