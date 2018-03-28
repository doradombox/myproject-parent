package org.learnio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Reader读取字符流
 * 
 * @author huangwenbo
 *
 */
public class ReaderDemo {
    public static void main(String[] args) throws IOException {
//        testScannerNextLine();
        testScannerNumber();
    }

    /**
     * BufferedReader方式读取
     * @throws IOException
     */
    public static void readerTest() throws IOException {
        BufferedReader brReader = new BufferedReader(new InputStreamReader(System.in));

        String string = "";
        System.out.println("输入一串字符串:");
        System.out.println("输入\'q\'退出.");
        do {
            string = brReader.readLine();
            if (!"q".equals(string)) {
                System.out.println(string);
            }

        } while (!string.equals("q"));
    }

    /**
     * java1.5之后还可以用Scanner类来获取控制台输入 
     * next方式接收
     */
    static void testScanner() {
        // 读取键盘输入
        Scanner scanner = new Scanner(System.in);

        System.out.println("以next方式接收:");
        if (scanner.hasNext()) {
            String str1 = scanner.next();
            System.out.println("输入的数据为：" + str1);
        }

        scanner.close();
    }

    /**
     * Scanner
     * hasNextLine读取,可以读取空格
     */
    static void testScannerNextLine() {
        // 读取键盘输入
        Scanner scanner = new Scanner(System.in);

        System.out.println("以hasNextLine方式接收:");
        if (scanner.hasNextLine()) {
            String str1 = scanner.nextLine();
            System.out.println("输入的数据为：" + str1);
        }

        scanner.close();
    }
    
    /**
     * Scanner
     * hasNextInt读取,可以读取数字,并加以验证
     * hasNextFloat读取,可以读取数字,并加以验证
     */
    static void testScannerNumber() {
     // 读取键盘输入
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        float f = 0.0f;
        System.out.println("以hasNextLine方式接收数字,并且验证:");
        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
            System.out.println("输入的数据为：" + i);
        }
        
        System.out.println("以hasNextLine方式接收浮点数,并且验证:");
        if (scanner.hasNextFloat()) {
            f = scanner.nextFloat();
            System.out.println("输入的数据为：" + f);
        }
        
        scanner.close();
    }

}
