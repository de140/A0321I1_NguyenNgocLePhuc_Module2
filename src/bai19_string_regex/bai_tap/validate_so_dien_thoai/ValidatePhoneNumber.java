package bai19_string_regex.bai_tap.validate_so_dien_thoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    static final String NUMBER_PHONE_REGEX = "([(]\\d{2}[)])([-])([(]\\d{10}[)])";
    static final String[] VALID_NUMBER = {"(84)-(1235648968)", "(28)-(8684525689)"};
    static final String[] INVALID_NUMBER = {"(a4)-(1235648968)", "(28)-(84525689)", "65-4758758828"};

    public ValidatePhoneNumber() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(NUMBER_PHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);

        return matcher.matches();
    }

    public static void main(String[] args) {
        ValidatePhoneNumber validateNumberPhone = new ValidatePhoneNumber();
        for (String number : VALID_NUMBER) {
            boolean isValid = validateNumberPhone.validate(number);
            System.out.println(number + " is valid: " + isValid);
        }

        for (String number : INVALID_NUMBER) {
            boolean isValid = validateNumberPhone.validate(number);
            System.out.println(number + " is valid: " + isValid);
        }
    }
}