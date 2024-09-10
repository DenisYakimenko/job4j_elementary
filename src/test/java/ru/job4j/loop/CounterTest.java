package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void when0and10thenSum55() {
        int expected = 55;
        int output = Counter.sum(0, 10);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when3and8thenSum33() {
        int expected = 33;
        int output = Counter.sum(3, 8);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when1and1thenSum1() {
        int expected = 1;
        int output = Counter.sum(1, 1);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when9and7thenSum0() {
        int expected = 0;
        int output = Counter.sum(9, 7);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom0To10Then30() {
        int start = 0;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus17To3Then70() {
        int start = -17;
        int finish = 3;
        int result = Counter.sumByEven(start, finish);
        int expected = -70;
        assertThat(result).isEqualTo(expected);
    }
}
