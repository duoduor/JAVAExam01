package wdd;

import java.util.Scanner;

/**03
 * 输入某年某月某日，给出下一天的日期？当然输入日期不合法需要做 出错误提示。
 *  从控制台读取日期,日期输入的格式为”2015-07-26”形式.
 * (不允许使用 Calendar,Date,DateTime 类中的函数),输入输出的形式如下: 
 *
 */
public class App {
	
public static void main(String[] args)  {
	System.out.println("请以年-月-日的格式输入日期：");
	Scanner scanner=new Scanner(System.in);
	String date=scanner.next();
	scanner.close();
	x(date);
}
public static void x(String date){
int days=0;
String b[]= date.split("-");
//分割为数组的三个元素，第一个第二个第三个元素分别对应年月日
int a[]=new int[b.length];
for (int i = 0; i < a.length; i++) {
	a[i]=Integer.valueOf(b[i]);
}
switch (a[1]) {
case 12:
	if(a[2]>31)
	{
		System.out.println("您输入的日期有误");
		break;
	}
	if(a[2]+1>31){
		if (a[1]+1>12) {
			a[0]+=1;
			a[1]=1;
			a[2]=1;
		}
		else{
			a[1]+=1;
			a[2]=1;
		}
	}
	else	{
		a[2]+=1;
	}
	System.out.println("下一天为"+a[0]+"年"+a[1]+"月"+a[2]+"日");
	break;
case 11:
	if(a[2]>30)
	{
		System.out.println("您输入的日期有误");
		break;
	}
	if(a[2]+1>30){
		a[1]+=1;
		a[2]=1;
	}
	else{
		a[2]+=1;
	}	
	System.out.println("下一天为"+a[0]+"年"+a[1]+"月"+a[2]+"日");
	break;
case 10:
	if(a[2]>31)
	{
		System.out.println("您输入的日期有误");
		break;
	}
	if(a[2]+1>31){
		a[1]+=1;
		a[2]=1;
	}
	else{
		a[2]+=1;
	}
	System.out.println("下一天为"+a[0]+"年"+a[1]+"月"+a[2]+"日");
	break;
case 9:
	if(a[2]>30)
	{
		System.out.println("您输入的日期有误");
		break;
	}
	if(a[2]+1>30){
		a[1]+=1;
		a[2]=1;
	}
	else{
		a[2]+=1;
	}
	System.out.println("下一天为"+a[0]+"年"+a[1]+"月"+a[2]+"日");
	break;
case 8:
	if(a[2]>31)
	{
		System.out.println("您输入的日期有误");
		break;
	}
	if(a[2]+1>31){
		a[1]+=1;
		a[2]=1;
	}
	else{
		a[2]+=1;
	}
	System.out.println("下一天为"+a[0]+"年"+a[1]+"月"+a[2]+"日");
	break;
case 7:
	if(a[2]>31)
	{
		System.out.println("您输入的日期有误");
		break;
	}
	if(a[2]+1>31){
		a[1]+=1;
		a[2]=1;
	}
	else{
		a[2]+=1;
	}
	System.out.println("下一天为"+a[0]+"年"+a[1]+"月"+a[2]+"日");
	break;
case 6:
	if(a[2]>30)
	{
		System.out.println("您输入的日期有误");
		break;
	}
	if(a[2]+1>30){
		a[1]+=1;
		a[2]=1;
	}
	else{
		a[2]+=1;
	}
	System.out.println("下一天为"+a[0]+"年"+a[1]+"月"+a[2]+"日");
	break;
case 5:
	if(a[2]>31)
	{
		System.out.println("您输入的日期有误");
		break;
	}
	if(a[2]+1>31){
		a[1]+=1;
		a[2]=1;
	}
	else{
		a[2]+=1;
	}
	System.out.println("下一天为"+a[0]+"年"+a[1]+"月"+a[2]+"日");
	break;
case 4:
	if(a[2]>30)
	{
		System.out.println("您输入的日期有误");
		break;
	}
	if(a[2]+1>30){
		a[1]+=1;
		a[2]=1;
	}
	else{
		a[2]+=1;
	}
	System.out.println("下一天为"+a[0]+"年"+a[1]+"月"+a[2]+"日");
	break;
case 3:
	if(a[2]>31)
	{
		System.out.println("您输入的日期有误");
		break;
	}
	if(a[2]+1>30){
		a[1]+=1;
		a[2]=1;
	}
	else{
		a[2]+=1;
	}
	System.out.println("下一天为"+a[0]+"年"+a[1]+"月"+a[2]+"日");
	break;
case 2:
	if(a[0]%4==0&&a[0]%100!=0||a[0]%400==0){
		if(a[2]>29)
		{
			System.out.println("您输入的日期有误");
			break;
		}
		else {
			if(a[2]+1>29){
				a[1]+=1;
				a[2]=1;
			}
			else{
				a[2]+=1;
			}
		}
	}
	else{
		if(a[2]>28)
		{
			System.out.println("您输入的日期有误");
			break;
		}
		if(a[2]+1>28){
			a[1]+=1;
			a[2]=1;
		}
		else{
			a[2]+=1;
		}
	}
	System.out.println("下一天为"+a[0]+"年"+a[1]+"月"+a[2]+"日");
	break;
case 1:
	if(a[2]>31)
	{
		System.out.println("您输入的日期有误");
		break;
	}
	if(a[2]+1>31){
		a[1]+=1;
		a[2]=1;
	}
	else{
		a[2]+=1;
	}
	System.out.println("下一天为"+a[0]+"年"+a[1]+"月"+a[2]+"日");
	break;
}


}


}


