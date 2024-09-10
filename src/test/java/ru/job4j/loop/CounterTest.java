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
}
