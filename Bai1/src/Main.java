import java.util.Scanner;

public class Main {
    public static void doiCoSo(int n,int base) {
        if(n >= base) doiCoSo(n / base, base);
        if(n % base>9) System.out.printf("%c",n % base + 55);
        else
            System.out.print((n % base));
    }
    public static int nhap() {
        Scanner sc = new Scanner(System.in);
        boolean check= false;
        int n = 0;
        while(!check) {
            System.out.print(" ");
            try {
                n = sc.nextInt();
                check= true;
            } catch (Exception e){
                System.out.println("Bạn phải nhập số! hãy nhập lại...");
                sc.nextLine();
            }
        }
        return (n);
    }
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        int n = nhap();
        System.out.print("Nhập cơ số cần chuyển sang b: ");
        int b = nhap();
        System.out.print("Số " +n+ " chuyển sang cơ số " +b+ " thành: ");
        doiCoSo(n,b);
    }
}
