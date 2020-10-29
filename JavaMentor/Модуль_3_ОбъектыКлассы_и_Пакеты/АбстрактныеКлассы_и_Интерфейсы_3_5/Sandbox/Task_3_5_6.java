package JavaMentor.Модуль_3_ОбъектыКлассы_и_Пакеты.АбстрактныеКлассы_и_Интерфейсы_3_5.Sandbox;

import java.util.Arrays;

/**
 * Created by Alpha on 08.09.2020.
 */
public class Task_3_5_6 {

    public static void main(String[] args) {
        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence answer = new AsciiCharSequence(example);
        System.out.println("Последовательность - " + answer.toString());//Hello!
        System.out.println("Размер её - " + answer.length());//6
        System.out.println("Символ под № 1 - " + answer.charAt(1));//e
        System.out.println("Подпоследовательность - " + answer.subSequence(1, 5));//ello
//проверка на нарушение инкапсуляции private поля
        System.out.println(answer.toString());//Hello!
        example[0] = 74;
        System.out.println(answer.toString());//Hello!

        byte[] a = {72, 101, 108, 108, 111, 111, 33};
        // String b = new String(a);
        System.out.println(new String(a));
    }

    public static class AsciiCharSequence implements CharSequence {
        private byte[] chars;

        public AsciiCharSequence(byte[] chars) {
            this.chars = chars;
        }

        @Override
        public int length() {
            return chars.length;
        }

        @Override
        public char charAt(int index) {
            return (char) chars[index];
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            return new AsciiCharSequence(Arrays.copyOfRange(chars, start,end));
        }

        @Override
        public String toString() {
            return new String(chars);
        }
        //Твой код здесь


    }
}


