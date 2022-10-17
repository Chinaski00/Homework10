public class Main {
    public static void main(String[] args) {

        //Задача - 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);

        //Задача - 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        //Задача - 3
        String fullName2 = "Иванов Семён Семёнович";
        if (fullName2.contains("ё")){
            System.out.println(fullName2.replace("ё", "е"));
        } else {
            System.out.println("Всё корректно!");
        }
    }
}