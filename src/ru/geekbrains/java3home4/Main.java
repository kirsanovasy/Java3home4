package ru.geekbrains.java3home4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

        public class Main {
            public static void main(String[] args) {
                Letters a = new Letters();

                ExecutorService executorService = Executors.newFixedThreadPool(3);
                executorService.submit(a::printA);
                executorService.submit(a::printB);
                executorService.submit(a::printC);

                executorService.shutdown();
            }
        }

// ExecutorService он заменяет Thread правильно? то есть  executorService.submit(a::printA);
// просто запускает поток из класса с буквами и указывает какой метод оттуда вызвать?
// а shutdown завершает
