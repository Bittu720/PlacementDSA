class Str8integertoromaneff1 {
        public static void printRoman(int num) {
            if (num >= 1000) {
                System.out.print("M");
                printRoman(num - 1000);
            } else if (num >= 900) {
                System.out.print("CM");
                printRoman(num - 900);
            } else if (num >= 500) {
                System.out.print("D");
                printRoman(num - 500);
            } else if (num >= 400) {
                System.out.print("CD");
                printRoman(num - 400);
            } else if (num >= 100) {
                System.out.print("C");
                printRoman(num - 100);
            } else if (num >= 90) {
                System.out.print("XC");
                printRoman(num - 90);
            } else if (num >= 50) {
                System.out.print("L");
                printRoman(num - 50);
            } else if (num >= 40) {
                System.out.print("XL");
                printRoman(num - 40);
            } else if (num >= 10) {
                System.out.print("X");
                printRoman(num - 10);
            } else if (num >= 9) {
                System.out.print("IX");
                printRoman(num - 9);
            } else if (num >= 5) {
                System.out.print("V");
                printRoman(num - 5);
            } else if (num >= 4) {
                System.out.print("IV");
                printRoman(num - 4);
            } else if (num >= 1) {
                System.out.print("I");
                printRoman(num - 1);
            }
        }
        public static void main(String[] args) {
            int num= 3549;
            printRoman(num);
        }
    }
    