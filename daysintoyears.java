class DaysIntoYears{
    public static void main(String args[]){
        int days,weeks,months,years;

        days=1010;
        
        years=days/365;
        days=days%365;

        months=days/30;
        days=days%30;

        weeks=days/7;
        days=days%7;
        System.out.println("days are 1010 ");

        System.out.println("\n Years  = "+years);

        System.out.println("\n months = "+months);

        System.out.println("\n weeks = "+weeks);

        System.out.println("\n days = "+days);
    }
}