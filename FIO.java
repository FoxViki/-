public class FIO {
    String firstName;
    String secondName;
    String lastName;
    String birthday;
    Integer phoneNumber;
    String gender;
   
    
    public FIO(String[] inputData) {
        Check check = new Check();
        this.firstName = inputData[0];
        this.secondName = inputData[1];
        this.lastName = inputData[2];
        this.birthday = check.birthdayFormat(inputData[3]);
        this.phoneNumber = check.phoneNumberFormat(inputData[4]);
        this.gender = check.genderFormat(inputData[5]);
    }

    @Override
    public String toString() {
        
        return String.format("%s %s %s %s %s %s \n", firstName, secondName, lastName, birthday, phoneNumber, gender);
    }
}
