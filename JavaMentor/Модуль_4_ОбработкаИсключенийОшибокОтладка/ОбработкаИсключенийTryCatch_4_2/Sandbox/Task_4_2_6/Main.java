package JavaMentor.Модуль_4_ОбработкаИсключенийОшибокОтладка.ОбработкаИсключенийTryCatch_4_2.Sandbox.Task_4_2_6;

public class Main {
    public static void main(String[] args) {

        BankClient client = new BankClient();
        BankEmployee employee = new BankEmployee();

        getCreditForClient(employee, client);



    }

    public static boolean getCreditForClient(BankEmployee bankWorker, BankClient bankClient)  {
        //Твой код здесь
        try {
            if(bankWorker.checkClientForCredit(bankClient)) {
               return true;
            }
            return false;
        } catch (BadCreditHistoryException e) {
            System.out.println("Проблемы с банковской историей");
            return false;
        }
        catch (ProblemWithLawException e) {
            return false;
        }
    }
}
