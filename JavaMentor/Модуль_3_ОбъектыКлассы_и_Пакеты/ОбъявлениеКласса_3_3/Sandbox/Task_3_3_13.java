package JavaMentor.Модуль_3_ОбъектыКлассы_и_Пакеты.ОбъявлениеКласса_3_3.Sandbox;

/**
 * На игровом поле находится робот. Позиция робота на поле описывается двумя целочисленным координатами: X и Y. Ось X смотрит слева направо, ось Y - снизу вверх. (Помните, как рисовали графики функций в школе?)
 * В начальный момент робот находится в некоторой позиции на поле. Также известно, куда робот смотрит: вверх, вниз, направо или налево. Ваша задача — привести робота в заданную точку игрового поля.
 * Робот описывается классом Robot. Вы можете пользоваться следующими его методами (реализация вам неизвестна):
 */


import java.math.*;
import java.security.DigestException;
import java.util.Arrays;

public class Task_3_3_13 {

    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, Direction.DOWN);
        System.out.println(robot.getX() + " : " + robot.getY());
        moveRobot(robot, 2, 0);
        System.out.println(robot.getX() + " : " + robot.getY());

    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static class Robot {
        int x;
        int y;
        Direction dir;

        public Robot(int x, int y, Direction dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }

        public Direction getDirection() {
            return dir;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void turnLeft() {
            if (dir == Direction.UP) {
                dir = Direction.LEFT;
            } else if (dir == Direction.DOWN) {
                dir = Direction.RIGHT;
            } else if (dir == Direction.LEFT) {
                dir = Direction.DOWN;
            } else if (dir == Direction.RIGHT) {
                dir = Direction.UP;
            }
        }

        public void turnRight() {
            if (dir == Direction.UP) {
                dir = Direction.RIGHT;
            } else if (dir == Direction.DOWN) {
                dir = Direction.LEFT;
            } else if (dir == Direction.LEFT) {
                dir = Direction.UP;
            } else if (dir == Direction.RIGHT) {
                dir = Direction.DOWN;
            }
        }

        public void stepForward() {
            if (dir == Direction.UP) {
                y++;
            }
            if (dir == Direction.DOWN) {
                y--;
            }
            if (dir == Direction.LEFT) {
                x--;
            }
            if (dir == Direction.RIGHT) {
                x++;
            }
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        // your code
        Direction xDirection = null;
        Direction yDirection = null;

        if (toX < robot.getX()) {
            xDirection = Direction.LEFT;
        } else if (toX > robot.getX()) {
            xDirection = Direction.RIGHT;
        }

        if (toY < robot.getY()) {
            yDirection = Direction.DOWN;
        } else if (toY > robot.getY()) {
            yDirection = Direction.UP;
        }

        while (yDirection != robot.getDirection()) { // ориентируемся по оси y
            if(yDirection !=null) {
                robot.turnLeft();
            } else break;

        }

        while (robot.getY() != toY) { // двигаемся вдоль оси y
            robot.stepForward();
        }

        while (xDirection != robot.getDirection()) { // ориентируемся по оси х
            if(xDirection !=null) {
                robot.turnLeft();
            } else break;
        }

        while (robot.getX() != toX) { // двигаемся вдоль оси x
            robot.stepForward();
        }
//
//        System.out.println("xDir:" + xDirection);
//        System.out.println("yDir:" + yDirection);
    }

}


