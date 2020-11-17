package BaseJava.Lesson4.Sandbox.ReflectionExample;

public class Rabbit {

   @RabbitAnnotation
   @Deprecated
   private String name;
   @Deprecated
   private int age;

   private void showRabbitName() {
      System.out.println(name);
   }

   public String getName() {
      return name;
   }

   public int getAge() {
      return age;
   }
}
