package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.ФункциональныеИнтерфейсы_7_1.Sandbox.Task_7_1_8;

@FunctionalInterface
public interface NumberGenerator<T extends Number> {
    boolean cond(T arg);
}
