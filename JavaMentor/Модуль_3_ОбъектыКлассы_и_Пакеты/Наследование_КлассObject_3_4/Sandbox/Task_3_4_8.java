package JavaMentor.Модуль_3_ОбъектыКлассы_и_Пакеты.Наследование_КлассObject_3_4.Sandbox;

import java.util.Objects;

public class Task_3_4_8 {

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        System.out.println(a.equals(b)); //must return true
        System.out.println(a.hashCode()); //must be equal to b.hashCode()
        System.out.println(b.hashCode()); //must be equal to b.hashCode()
    }

    public static class ComplexNumber {
        private double re;
        private double im;

        public ComplexNumber() {
        }

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true; // если переменные содержат ссылку на один и тот же объект
            if (o == null || getClass() != o.getClass()) return false; // если переданная в параметрах ссылка не на что не ссылаеся ИЛИ объекты относятся к разрым типам - return false
            ComplexNumber that = (ComplexNumber) o;
            return Double.compare(that.re, re) == 0 &&
                    Double.compare(that.im, im) == 0;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            double result = 1;
            result = prime * result + re;
            result = prime * result + im;

            return (int) result;
        }
    }
}
