package wdd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 04 随机生成 50 个小于 100 的整数,放入 List 中,将 List 中的数据除以 10, 以 结 果 的 整 数 值 作 为 key 放入
 * Map 中 , 得到如 {1=>[11,10,12],2=>[21,24,23]}的 Map,再将 Map 中 key 对应的数组进 行排序,
 * 得到如{1=>[10,11,12],2=>[21,23,24]} 输出的形式如下: 随机生成 50 个小于 100 的数, 分别为:
 * xxx,xxxx,xxxx Map 中的数据为: {1=>[11,10,12],2=>[21,24,23]} 排序后的 Map 为:
 * {1=>[10,11,12],2=>[21,23,24]}
 *
 */
public class App {
	public static void main(String[] args) {
		ArrayList<Integer> array=new ArrayList<Integer>();
		Map<Integer, ArrayList<Integer>> hMap=new HashMap<Integer, ArrayList<Integer>>();
		for (int i = 0; i < 50; i++) {
			array.add((int) (Math.random()*100));
		}
		System.out.println("生成的随机数为"+array);

		for (int i = 0; i < 10; i++) {
			ArrayList<Integer> list=new ArrayList<Integer>();
			Iterator<Integer> iterator=array.iterator();
			while(iterator.hasNext()){
				Integer j=iterator.next();
				if(j/10==i){
					list.add(j);
				}
			}
			hMap.put(new Integer(i), list);
		}
			System.out.println("map中的数据为{");
			for (int i = 0; i < 10; i++) {
				if(hMap.containsKey(i)){
				System.out.print(i+"-->"+hMap.get(i)+", ");
				}
				else
					continue;
			}
			System.out.println("}");
			
			for (int i = 0; i < 10; i++) {
				if(hMap.containsKey(i)){
					int[] set=new int[hMap.get(i).size()];
					for(int j=0;j<hMap.get(i).size();j++)
					{
						set[j]=((Integer)hMap.get(i).get(j)).intValue();
					}
					//对set进行排序 冒泡
					int temp;//定义一个临时变量
			        for(int a=0;a<set.length;a++){//冒泡排序
			            for(int j=0;j<set.length-a-1;j++){
			                if(set[j+1]<set[j]){
			                    temp = set[j];
			                    set[j] = set[j+1];
			                    set[j+1] = temp;
			                }
			            }
			        }
				}
				else
					continue;
			}
			System.out.println("排序之后的map为");
			for (int i = 0; i < 10; i++) {
				if(hMap.containsKey(i)){
				System.out.print(i+"-->"+hMap.get(i)+", ");
				}
				else
					continue;
			}
	
				
	}
}

/*
 * 	ArrayList<Integer> array=new ArrayList<Integer>();
		Map<Integer, ArrayList<Integer>> hMap=new HashMap<Integer, ArrayList<Integer>>();
		for (int i = 0; i < 50; i++) {
			array.add((int) (Math.random()*100));
		}
		System.out.println("生成的随机数为"+array);

		for (int i = 0; i < 10; i++) {
			ArrayList<Integer> xList=new ArrayList<Integer>();
			Iterator<Integer> iterator=array.iterator();
			while(iterator.hasNext()){
				Integer j=iterator.next();
				if(j/10==i){
					xList.add(j);
				}
			}
			hMap.put(new Integer(i), xList);
		}
			System.out.print("map�е�����Ϊ��{");
			for (int i = 0; i < 10; i++) {
				if(hMap.containsKey(i)){
				System.out.print(i+"-->"+hMap.get(i)+", ");
				}
				else
					continue;
			}
			System.out.print("}");
			GuiBing x=new GuiBing();
			for (int i = 0; i < 10; i++) {
				if(hMap.containsKey(i)){
					int[] ret=new int[hMap.get(i).size()];
					for(int j=0;j<hMap.get(i).size();j++)
					{
					ret[j]=((Integer)hMap.get(i).get(j)).intValue();
					}
				x.paixu(ret);
				}
				else
					continue;
			}
			for (int i = 0; i < 10; i++) {
				if(hMap.containsKey(i)){
				System.out.print(i+"-->"+hMap.get(i)+", ");
				}
				else
					continue;
			}
 */
