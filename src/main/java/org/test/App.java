package org.test;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.test.shortest_string.ShortestStringProcessor;

@Slf4j
public class App {

    private static final String[] INPUT_STRINGS = {
            "bcabc",
            "cbacdcbc",
            "cdadabcc",
            "ecbacba",
            "bbbbb",
            "pwwkew",
            "plensunbypivaskerlik",
            RandomStringUtils.randomAlphabetic(10).toLowerCase(),
            RandomStringUtils.randomAlphabetic(30).toLowerCase()
    };

    public static void main(String[] args) {
        ShortestStringProcessor processor = new ShortestStringProcessor();
        for (String inputString : INPUT_STRINGS) {
            log.info("Next input string:\n{}", inputString);
            CharSequence shortestSubstring = processor.process(inputString);
            log.info("Shortest substring:\n{}", shortestSubstring);
        }
        System.exit(0);
    }

}
