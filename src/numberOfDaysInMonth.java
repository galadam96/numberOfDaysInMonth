public class numberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2, 2018));
    }

    public static boolean isLeapYear(int year){
        boolean result = false;
        if(year > 1 && year < 9999) {

            if (year % 4 == 0) {//step1
                if(year % 100 == 0){ //step2
                    if(year % 400 == 0){//step3
                        //step 4
                        result = true;
                    }
                }
                else{ //step4
                    result = true;
                }
            }
            else { //step 5

            }
        }

        else{
            result = false;
        }
        return result;
    }

    public static int getDaysInMonth(int month, int year){
        int result;
        if(year < 1 || year > 9999 || month < 1 || month > 12){
            result = -1;
        }
        else {
            //calculate how many days are in the month
            switch (month){
                case 1,3,5,7,8,10,12:
                    result = 31;
                    break;
                case 4,6,9,11:
                    result = 30;
                    break;
                case 2:
                    Boolean isLeap = isLeapYear(year);
                    if(isLeap){
                        result = 29;
                    }
                    else{
                        result = 28;
                    }
                    break;
                default:
                    result = -1;
                    break;
            }
        }
        return result;
    }
}

