 class Holiday {
    private String name;
    private int day;
    private String month;

    Holiday(String n, int d, String m) {
        this.name = n;
        this.day = d;
        this.month = m;
    }

    public static boolean inSameMonth(Holiday h,Holiday H) {
        return h.month.equals(H.month);
    }

    public double avgDate(Holiday h1[]) {
        double avg = 0;
        for (int i = 0; i < h1.length; i++) {
            this.day = h1[i].day;
            avg += this.day;
        }
        return avg / h1.length;
    }
}
    public class OopsExample {
        public static void main(String args[]){
            Holiday obj1 =new Holiday("Independence Day",4,"July");
            Holiday obj2 = new Holiday("Bday",11,"August");
            System.out.println(Holiday.inSameMonth(obj1,obj2));
        }
}
