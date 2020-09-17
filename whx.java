package whx;
import java.util.Scanner;
public class whx {

    public static void main(String[] args) {
        int year = getYear();
        echoCalender(year);
    }

    private static void echoCalender(int year) {
        for (int i = 1; i <= 12; i++) {
            System.out.println("=========��ǰ��: " + i + "��=============");
            System.out.println("һ\t��\t��\t��\t��\t��\t��");
            printMonthOfDay(year, i);
        }
    }

    private static void printMonthOfDay(int year, int month) {
        int count = 0;
        for (int i = 0; i < getWeekDay(year, month); i++, count++) {
            if (getWeekDay(year, month) == 6) break;
            System.out.print("\t");
        }
        for (int i = 1; i <= getMonthsDays(year, month); i++, count++) {

            if (count % 7 == 0 && count != 0) System.out.println();
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    private static int getWeekDay(int year, int month) {
        int totals = 0;
        for (int y = 1900; y < year; y++) {
            totals += isLeafYear(y) ? 366 : 365;
        }
        for (int m = 1; m < month; m++) {
            totals += getMonthsDays(year, m);
        }
        return totals % 7;
    }

    private static int getMonthsDays(int year, int month) {
        if (month == 4 || month == 6 || month == 9 || month == 11) return 30;
        else if (month == 2) return isLeafYear(year) ? 29 : 28;
        return 31;
    }

    private static boolean isLeafYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) return true;
        return false;
    }

    private static int getYear() {
        int year = 1900;
        try {
            System.out.println("������һλ4λ�����: ����2020: ");
            year = new Scanner(System.in).nextInt();
            if (year < 1900 || year > 9999) {
                System.err.println("!===���뷶Χ����===!");
                return getYear();
            }
        } catch (Exception e) {
            System.err.println("!===�����ʽ����,��������λ���ֵ��������===!");
            return getYear();
        }
        return year;
    }
}