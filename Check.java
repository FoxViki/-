public class Check {

    public String birthdayFormat(String date){
    char[] checkData = date.toCharArray();
    if (checkData.length == 10 && (checkData[2] == '.' && checkData[5] == '.')){

    } else {
        throw new RuntimeException("Формат даты введен не правильно. Правильный формат ввода данных дд.мм.гггг. Пример: 12.02.1989");
    }
    return date;
    }

    public int phoneNumberFormat(String phoneNumber) {
        if (phoneNumber.length() < 10 || phoneNumber.length() > 10) {
                throw new ArrayStoreException("Неверное количество символов в номере телефона. Их должно быть 10");
            }
            
        Integer phone;

        try {
            phone = Integer.parseInt(phoneNumber);
            
        } catch (NumberFormatException e){
            throw new NumberFormatException("Формат телефона пользователя введен неверно. Пример: 9061234567 ");
        }
        return phone;
    }

   
    public String genderFormat(String gender) throws IncorrectValueException{
        if (gender.equals("m")  || gender.equals("f")){
            return gender;
        } else {
            throw new IncorrectValueException("Не верно указан пол. Пол указывается одним символом, если мужчина 'm', если женщина 'f'.\n");
        }
    
    }

}
