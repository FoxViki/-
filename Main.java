
import java.util.Scanner;

public class Main {
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        FIO fio;

        System.out.println("Введите следующие данные именно в таком порядке, разделенные пробелом: <Фамилия> <Имя> <Отчество> <дата _ рождения> <номер _ телефона> <пол>");
        
        String next = scanner.nextLine();
        String [] inputData = next.split(" ");
        scanner.close();
        
        if (inputData.length <6 || inputData.length >6){
            throw new ArrayStoreException("Некоректный ввод данных: количество введенных денных не соответствует требованию");
        }
        if(inputData.length == 6){
            fio = new FIO(inputData);
            Writer writer = new Writer();
            writer.write(fio);
    }
}
}
