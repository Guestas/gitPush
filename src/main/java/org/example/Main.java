package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main(String[] args) {
		int j = 455;
		for (int i = 1; i <= 5; i=i+4) {
			System.out.println("value of i is: "+i);
			System.out.println(i);
			j=j+i;
		}
		if (j>455){
			System.out.println("bigger");
		} else {
			System.out.println("small");
		}
		System.out.println("program ended here");
	}
}