package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main(String[] args) {
		int j = 455;
		for (int i = 1; i <= 5; i=i+4) {
			System.out.println("Value i: "+i);
			i = i-1;
			System.out.println(i);
			j=j+i;
		}
		if (j>455){
			System.out.println("j>455");
			j++;
			System.out.println(j);
		} else {
			System.out.println("j is smaller");
		}
		System.out.println("program ended here");
	}
}