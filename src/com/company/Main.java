package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String[] students = {"Lich", "Chien", "Binh", "Viet", "Toan", "Minh", "Sang"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten can tim kiem:");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Vi tri cua hoc sinh " + input_name + " la: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("khong tim thay" + input_name + " trong danh sach");
        }
    }
}
