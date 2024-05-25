package com.sakak.algorithm;

import java.util.stream.Stream;
import org.assertj.core.internal.bytebuddy.asm.Advice.Argument;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class AlgorithmTest {

    @ParameterizedTest
    @MethodSource("inputSource")
    void n번째_개미_수열의_중간_값을_추출한다(){

    }

    static Stream<Arguments> inputSource(){
        return Stream.of(
            Arguments.of("3","21"),
            Arguments.of("4","21"),
            Arguments.of("5","12"),
            Arguments.of("6","22"),
            Arguments.of("7","12"),
            Arguments.of("8","21")
        );
    }


}
