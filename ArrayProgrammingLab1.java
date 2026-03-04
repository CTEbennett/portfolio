//Evan Bennett, 5th hour, 1/30/2025
import java.util.Scanner;
import java.util.Random;
public class ArrayProgrammingLab1 {

	public static void main(String[] args) {
		int generator, even = 0, odd = 0, prime = 0, perfect = 0, count = 0;
		String list = "[";
		Random generate = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("How big would you like your array to be? ");
		int x = input.nextInt();
		int[] array = new int[x];
		for(int i = 0; i < array.length; i++) {
			generator = generate.nextInt(999)+1;
			array[i] = generator;
			if(i == array.length-1) {
				list = list + array[i];
			}else {
				list = list + array[i] + ", ";
			}
		}
		list = list + "]";
		System.out.println(list);
		for(int e = 0; e < array.length; e++) {
			if(array[e] % 2 == 0) {
				even = even + 1;
			}
		}
		for(int o = 0; o < array.length; o++) {
			if(array[o] % 2 == 1) {
				odd = odd + 1;
			}
		}
		for(int p = 0; p < array.length; p++) {
			if(array[p] == 2 || array[p] == 1) {
				prime = prime + 1;
			}else if(array[p] % 2 != 0 && array[p] % 3 != 0 && array[p] % 5 != 0 && array[p] % 7 != 0 && array[p] % 11 != 0 && array[p] % 13 != 0 && array[p] % 17 != 0 && array[p] % 19 != 0 && array[p] % 23 != 0 && array[p] % 29 != 0 && array[p] % 31 != 0) {
				prime = prime +1;
			}
		}
		for(int q= 0; q < x; q++) {
			for(int l = 1; l < array[q]; l++) {
				if(array[q] % l == 0) {
					count = count + l;
				}
			}
			if(array[q] == count) {
				perfect = perfect + 1;
			}
			count = 0;
		}
		System.out.println("Even numbers: " + even);
		System.out.println("Odd numbers: " + odd);
		System.out.println("Prime numbers: " + prime);
		System.out.println("Perfect numbers: " + perfect);
	}
}