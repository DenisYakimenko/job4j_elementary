package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMan180Weight92() {
        short input = 180;
        double expected = 92;
        double output = Fit.manWeight(input);
        double value = 0.01;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenWoman170Weight64() {
        short input = 170;
        double expected = 69;
        double output = Fit.womanWeight(input);
        double value = 0.01;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}