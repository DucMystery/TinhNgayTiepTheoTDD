public class NextDayCalculator {

    public int  findNextDay(int day,int month){
        if (day>=31 && (month ==1 || month==3 ||  month==5 || month == 7|| month == 8 || month==10 || month ==12)){
            day=1;
            ++month;
            return day;
        }else if (day>=30 && (month==4 || month ==6 || month == 9 || month== 11)){
            day =1;
            ++month;
            return day;
        }else if (day>=28 && month==2){
            day =1;
            ++month;
            return day;
        }

        return ++day;

    }
}
