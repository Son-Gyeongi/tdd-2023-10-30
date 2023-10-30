package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * TDD
 * 테스트 주도 개발
 * 테스트 코드 -> 구현 -> 배포
 * <p>
 * red-green-refactoring 반복
 * RED : 실패하는 테스트케이스를 만든다.
 * <p>
 * GREEN : 최대한 꼼수를 써서 테스트케이스를 통과하게 만든다.
 * <p>
 * REFACTORING : 중복을 제거한다.
 */
public class CalcTest {

    @Test
    @DisplayName("Calc에 run 메서드는 int를 리턴한다.")
    void t1() {
        int rs = Calc.run("");
    }

    @Test
    @DisplayName("10 + 10 => 20")
    void t2() {
        int rs = Calc.run("10 + 10");
        // 요구사항 작성
        assertThat(rs).isEqualTo(20);
    }

    // 이때까지 구현을 피했지만 이제는 구현할 때
    @Test
    @DisplayName("10 + 20 => 30")
    void t3() {
        int rs = Calc.run("10 + 20");
        // 요구사항 작성
        assertThat(rs).isEqualTo(30);
    }

    @Test
    @DisplayName("10 + 30 => 40")
    void t4() {
        int rs = Calc.run("10 + 30");
        // 요구사항 작성
        assertThat(rs).isEqualTo(40);
    }

    @Test
    @DisplayName("10 + 40 => 50")
    void t5() {
        int rs = Calc.run("10 + 40");
        // 요구사항 작성
        assertThat(rs).isEqualTo(50);
    }

    @Test
    @DisplayName("10 - 10 => 0")
    void t6() {
        int rs = Calc.run("10 - 10");
        assertThat(rs).isEqualTo(0);
    }

    @Test
    @DisplayName("10 - 5 => 5")
    void t7() {
        int rs = Calc.run("10 - 5");
        assertThat(rs).isEqualTo(5);
    }

    @Test
    @DisplayName("10 * 5 => 50")
    void t8() {
        int rs = Calc.run("10 * 5");
        assertThat(rs).isEqualTo(50);
    }

    @Test
    @DisplayName("10 / 3 => 3")
    void t9() {
        int rs = Calc.run("10 / 3");
        assertThat(rs).isEqualTo(3);
    }

    @Test
    @DisplayName("10 / 5 => 2")
    void t10() {
        int rs = Calc.run("10 / 5");
        assertThat(rs).isEqualTo(2);
    }
}
