package wdd;

import java.util.Scanner;

/**
 * 02 编程实现工资个人所得税计算程序：
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.print("请输入工资：");

		double tax = 0;
		Scanner scanner = new Scanner(System.in);
		double salary = scanner.nextDouble();
		double taxSalary=salary-3500;
		System.out.println();

		if (taxSalary >=0 && taxSalary < 1500) {
			tax = taxSalary * 0.03;
		} else if (taxSalary > 1500 && taxSalary < 4500) {
			tax = (taxSalary - 1500) * 0.10;
		} else if (taxSalary > 4500 && taxSalary < 9000) {
			tax = (taxSalary - 4500) * 0.20;
		} else if (taxSalary > 9000 && taxSalary < 35000) {
			tax = (taxSalary - 9000) * 0.25;
		} else if (taxSalary > 35000 && taxSalary < 55000) {
			tax = (taxSalary - 35000) * 0.30;
		} else if (taxSalary > 55000 && taxSalary < 80000) {
			tax = (taxSalary - 55000) * 0.35;
		} else if (taxSalary > 80000) {
			tax = (taxSalary - 80000) * 0.45;
		}else{
			System.out.println("您的工资不符合纳税标准");
		}

		System.out.println("所需缴纳的税费为：" + tax);

	}

}
