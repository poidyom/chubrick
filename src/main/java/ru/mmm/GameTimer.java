package ru.mmm;

import java.util.Timer;
import java.util.TimerTask;

/** Класс - таймер. */
public class GameTimer {
    /** Основной метод - запуск таймера. */
    public static void StartTimer() {
        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                // тут вызовы всякой хуйни, которая работает по тикам
            }
        }, 0, 1000); //время тика 1 секунда
    }
}
