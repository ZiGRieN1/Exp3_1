package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalcTest {
    Calc calc = new Calc();
    int result;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("This is beforeAll");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("This is beforeEach");
    }

    @Test
    @DisplayName("Проверка суммирования a и b")
    @Tag("addition")
    void addition() {
        result = calc.addition(1,1);
        Assertions.assertEquals(2, result,"Что-то пошло не так :(");
    }

    @ParameterizedTest(name = "#{index} - сложение {0} и {1}, ожидается {2}")
    @DisplayName("Проверка параметризованного теста суммирования a и b")
    @CsvSource({"2,2,4","3,5,8","8,4,12","14,6,20","0,-5,-5"})
    @Tag("addition")
    void paramAddition(int a, int b, int expectedResult){
        result = calc.addition(a,b);
        Assertions.assertEquals(expectedResult, result,"Что-то пошло не так :(");
    }

    @Test
    @DisplayName("Проверка разности a и b")
    @Tag("subscription")
    void subscription() {
        result = calc.subscription(1,-17);
        Assertions.assertEquals(18, result,"Что-то пошло не так :(");
    }

    @ParameterizedTest(name = "#{index} - разность {0} и {1}, ожидается {2}")
    @DisplayName("Проверка параметризованного теста разности a и b")
    @CsvSource({"2,2,0","3,5,-2","8,4,4","14,6,8","0,-5,5"})
    @Tag("subscription")
    void paramSubscription(int a, int b, int expectedResult) {
        result = calc.subscription(a,b);
        Assertions.assertEquals(expectedResult, result,"Что-то пошло не так :(");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("This is afterEach");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("This is afterAll");
    }
}