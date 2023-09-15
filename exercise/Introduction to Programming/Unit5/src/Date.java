public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    @Override
    public String toString() {
        return this.year + "-" + this.month + "-" + this.day;
    }

    public boolean equalTo(Date date) {
        return this.day == date.getDay() && this.month == date.getMonth() && this.year == date.getYear();
    }

    public boolean precede(Date date) {
        if (this.year < date.getYear()) {
            return true;
        } else if (this.year == date.getYear()) {
            if (this.month < date.getMonth()) {
                return true;
            } else if (this.month == date.getMonth()) {
                if (this.day < date.getDay()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean leap() {
        return (this.year % 4 == 0) && (this.year % 100 != 0) || (this.year % 400 == 0);
    }

    public String nextDay() {
        int[] day_of_month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (leap()) {
            day_of_month[1] = 29;
        }
        if ((this.getDay() + 1) > day_of_month[this.getMonth() - 1]) {
            if((this.month+1) > 12){
                return ((this.getYear()+1) + "-1-1");
            }else{
                 return (this.getYear() + "-"+ (this.getMonth()+1) +"-1");
            }
        }else{
            return (this.getYear() +"-" + this.getMonth() + "-" + (this.getDay()+1));
        }
    }
}
