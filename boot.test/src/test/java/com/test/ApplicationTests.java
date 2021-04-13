package com.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@TestMethodOrder(OrderAnnotation.class)
class ApplicationTests {

    @BeforeAll
    static void beforeAll() {
        System.out.println("클래스 테스트 메소드 실행전 : beforeAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("테스트 메소드 실행전 : beforeEach");
    }

    @Test
    @DisplayName("테스트1")
    @Disabled
    @Order(3)
    void succeedingTest_1() {
        System.out.println("테스트 call_1");
    }

    @Test
    @DisplayName("테스트2")
    @Order(2)
    void succeedingTest_2() {
        System.out.println("테스트 call_2");
    }
    
    @Test
    @DisplayName("테스트3")
    @Order(1)
    void succeedingTest_3() {
    	System.out.println("테스트 call_3");
    }

    @AfterEach
    void afterEach() {
        System.out.println("테스트 메소드 실행 후 : afterEach");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("클래스 테스트 메소드 실행 후 : afterAll");
    }

}
