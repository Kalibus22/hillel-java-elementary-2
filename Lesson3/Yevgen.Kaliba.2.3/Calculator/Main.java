import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
        String MyOper;
        String[] Actions = {"Addiction", "Subtraction", "Multiplication", "Division", "Remainder", "Modulus"};
        Scanner MyKeyb = new Scanner(System.in);
        double a=0, b=0;
        boolean ok1 = false;
        boolean ok2 = false;
        if (args.length >= 2) { //���������, ���� �� �������� ��������� ��� ������ ���������, � ����� - ������������ ����������;
            try {
                   a = Double.parseDouble(args[1]);
                   b = Double.parseDouble(args[2]);
                   ok1 = true;
                }
            catch (NumberFormatException e) {
                  System.out.println("���������, ���������� �� ��������� ������, �������. ���������� ������ ����.");
                  ok1 = false;
                }
        }
        if (args.length == 0) {System.out.println("��������� ��� ������� �� ��������, ���������� ������ ����.");}
        else if (args.length > 0 && Arrays.asList(Actions).contains(args[0])) { //���������, ������������ �� ���������� �������� ���������������
            ok2 = true;
                } else  {
            System.out.println("��������, ���������� �� ��������� ������, ������ �������. ���������� ������ ����.");
            ok2 = false;
                        }

        if (ok1 && ok2) {                       //���� � ������� - ����������� ��� ������, �� ���������� ��
            a = Double.parseDouble(args[1]);
            b = Double.parseDouble(args[2]);
            MyOper = args[0];
        }

        else {  // ���� ���������� ���������� ���, ������ ��������� �������

            while (true) {
                System.out.println("������� ��������:");
                MyOper = MyKeyb.next();
                if (Arrays.asList(Actions).contains(MyOper)) {   //�������� �� ����������� ���������� ��������
                    break;
                }
                else {
                    System.out.println("������� �������� ��������. ����������� �������� �� ������" + Arrays.asList(Actions));
                }
            }
            System.out.println("������� ������ �����:");
            a = MyKeyb.nextDouble();
            System.out.println("������� ������ �����:");
            b = MyKeyb.nextDouble();
        }
        // � ���������� ������ � ����� ��������
        if (MyOper.equalsIgnoreCase("Addiction")) { System.out.println("��������� ��������: " + (a+b));}
        else if (MyOper.equalsIgnoreCase("Subtraction")) { System.out.println("��������� ���������: " + (a-b));}
        else if (MyOper.equalsIgnoreCase("Multiplication")) { System.out.println("��������� ���������: " + (a*b));}
        else if (MyOper.equalsIgnoreCase("Division")) { System.out.println("��������� �������: " + (a/b));}
        else if (MyOper.equalsIgnoreCase("Remainder")) { System.out.println("������� �� �������: " + (a%b));}
        else if (MyOper.equalsIgnoreCase("Modulus")) { System.out.println("������ ������� �����: " +Math.abs(a)+" ������ ������� �����: "+Math.abs(b) );}

    }
}

