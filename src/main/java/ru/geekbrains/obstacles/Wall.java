package ru.geekbrains.obstacles;

import ru.geekbrains.participants.Runner;

public class Wall implements Obstacles {
    private int width;

    public Wall(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void check(Runner runner) {
        runner.run();
        runner.setSuccess(runner.getMaxWeight() >= width);
        if (runner.getSuccess()) {
            System.out.println("Прыгун " + runner.getName() + " выполнил испытание, перепрыгнув стену высотой: " + width);
        } else {
            System.out.println("Прыгун " + runner.getName() + " не перепрыгнул стену высотой: " + width);
        }
    }
}
