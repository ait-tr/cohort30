package practice.sentence_test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentenceTest {

    // поле класса
    Sentence sentence; // определяем поле с типом тестируемого класса Sentence и создаем объект sentence такого типа

    @BeforeEach
    void setUp() {
        sentence = new Sentence("XXX");  // создали объект sentence класса Sentence
    }

    @Test
    void wordsInSentenceTest() {
        String st = "Привет и пока-пока!";
        assertEquals(3 , sentence.wordsInSentence(st));
    }

    @Test
    void lettersInSentenceTest() {
        String st = "Я к вам пишу, чего же боле...";
        assertEquals(19, sentence.lettersInSentence(st));
    }
}