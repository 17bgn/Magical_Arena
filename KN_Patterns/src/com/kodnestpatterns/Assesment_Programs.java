package com.kodnestpatterns;

public class Assesment_Programs {

	public static void main(String[] args) {
		System.out.println("\nfirst pattern\n");
		for(int i=1;i<=6;i++){
			for(int j=1;j<=i;j++){
				if(i==j || i-j==2 || i-j==4){
					System.out.print("1 ");
				}else{
					System.out.print("0 ");
				}
			}System.out.println();
		}

		System.out.println("\nor\n ");
		for (int i = 1; i <= 6; i++) {

			int startValue = (i % 2 == 0) ? 0 : 1;

			for (int j = 1; j <= i; j++) {

				System.out.print(startValue + " ");

				startValue = (startValue == 0) ? 1 : 0;

			}

			System.out.println();
		}
		System.out.println("\n2nd pattern Wrong code\n");
		for(int i=1;i<=6;i++){
			for(int j=1;j<=11;j++){
				if(j==6){
					System.out.print("1 ");
				}else if((j==5 || j==7)&&(i>=2&& i<=6)){
					System.out.print("2 ");
				}else if((j==4 || j==8)&& (i>=3 && i<=6)){
					System.out.print("3 ");
				}else if((j==3 || j==9)&&(i>=4 && i<=6)){
					System.out.print("4 ");
				} else if((j==2 || j==10)&&(i>=5&&i<=6)){
					System.out.print("5 ");
				}else if(i==6 && (j==1 || j==11)){
					System.out.print("6 ");
				}
			}System.out.println();
		}
		System.out.println("\n2nd Pattern Correct Code\n");
		for (int i = 1; i <= 6; i++) {

			// Print spaces

			for (int j = 1; j <= 6 - i; j++)

				System.out.print(" ");

			// Print decreasing numbers

			for (int j = i; j >= 2; j--)

				System.out.print(j + " ");

			// Print increasing numbers

			for (int j = 1; j <= i; j++)

				System.out.print(j + " ");

			System.out.println();

		}
		System.out.println("\n3rd pattern Wrong code\n");
		for(int i=1;i<=12;i++){
			for(int j=1;j<=i;j++){
				if(i<7){
					System.out.print("*");
				}
			}
			for(int k=1;k<=i;k++){
				if(i>5)
					System.out.print("*");
			}System.out.println();
		}
		System.out.println("\n3rd Pattern Correct Code\n");
		int n=12;
		for (int i = 1; i <= n; i++) {

			// Print left asterisks

			for (int j = 1; j <= i; j++)

				System.out.print("*");

			// Print spaces

			for (int j = 1; j <= 2 * (n - i); j++)

				System.out.print(" ");

			// Print right asterisks

			for (int j = 1; j <= i; j++)

				System.out.print("*");

			System.out.println();

		}

		for (int i = n; i >= 1; i--) {

			// Print left asterisks

			for (int j = 1; j <= i; j++)

				System.out.print("*");

			// Print spaces

			for (int j = 1; j <= 2 * (n - i); j++)

				System.out.print(" ");

			// Print right asterisks

			for (int j = 1; j <= i; j++)

				System.out.print("*");

			System.out.println();

		}
		System.out.println("\n4th pattern Wrong code\n");
		for(int i=1;i<=6;i++){
			for(int j=1;j<=6;j++){
				if(i==1){
					System.out.print(j+" ");
				}
				else if(i==2 && (j>1 && j<=6)){
					System.out.print(j+" ");
				}else if(i==3 && (j>2 && j<=6)){
					System.out.print(j+" ");
				}else if(i==4 && (j>3 && j<=6)){
					System.out.print(j+" ");
				}else if(i==5 && (j>4 && j<=6)){
					System.out.print(j+" ");
				}else if(i==6 && j>5){
					System.out.print(j+" ");
				}
			}System.out.println();
		}
		System.out.println("\n4th Pattern Correct Code\n");
		for (int i = 1; i <= 6; i++) {

			// Print spaces

			for (int j = 1; j < i; j++)

				System.out.print(" ");

			// Print numbers in increasing order

			for (int j = i; j <= 6; j++)

				System.out.print(j + " ");

			System.out.println();

		}
		System.out.println("\nfifth pattern\n");
		for(int i=1;i<=11;i++){
			for(int j=1;j<=11;j++){
				if((i==1||i==6||i==11)|| (j==1 || j==6||j==11)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}System.out.println(" ");
		}
		System.out.println("\nor\n ");
		for (int i = 0; i < 11; i++) {

			for (int j = 0; j < 11; j++) {

				if(i==0 || i==10 || j==0 || j==10 || i==5 || j==5) {

					System.out.print("*");

				}

				else {

					System.out.print(" ");

				}

			}

			System.out.println();

		}
		System.out.println("\nsixth pattern\n");
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i==1 || i==5){
					System.out.print("?");
				}else if((i==2 || i==3||i==4) && (j==1 || j==5)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}System.out.println( );
		}

		System.out.println("\nseventh pattern\n");
		for(int i=1;i<=11;i++){
			for(int j=1;j<=11;j++){
				if((i==1 || i==6||i==11)||(j==1||j==11)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}System.out.println( );
		}
		System.out.println("\nor\n");
		for (int i = 0; i < 11; i++) {

			for (int j = 0; j < 11; j++) {

				if(i==0 || i==10 || j==0 || j==10 || i==5) {

					System.out.print("*");

				}

				else {

					System.out.print(" ");

				}

			}

			System.out.println();

		}
		System.out.println("\nEighth pattern\n");
		for(int i=1;i<=5;i++){
			for(int j=1;j<=6;j++){
				if(i==1 ||i==3||i==5){
					System.out.print("1");
				}else{
					System.out.print("0");
				}
			}System.out.println();
		}
		System.out.println("\nor\n");
		for (int i = 1; i <= 5; i++) {

			int startValue = (i % 2 == 0) ? 0 : 1;

			for (int j = 1; j <= 5; j++) {

				System.out.print(startValue);

			}

			System.out.println();

		}
		System.out.println("\nNineth pattern\n");
		for(int i=1;i<=11;i++){
			for(int j=1;j<=11;j++){
				if(i==1 || i==6 || i==11 || j==1 ||j==6||j==11 || i==j||i+j==12){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("\nor\n");
		for (int i = 0; i < 11; i++) {

			for (int j = 0; j < 11; j++) {

				if(i==0 || i==10 || j==0 || j==10 || i==5 || j==5 || i+j == 10 || i==j) {

					System.out.print("*");

				}

				else {

					System.out.print(" ");

				}

			}

			System.out.println();

		}
		System.out.println("\nTenth pattern\n");
		// Upper part of the rhombus

		for (int i = 1; i <= 10; i++) {

			// Print spaces

			for (int j = 1; j <= 10 - i; j++)

				System.out.print(" ");

			// Print stars for the first and last rows, or for the first and last columns

			for (int j = 1; j <= 10; j++) {

				if (j == 1 || j == 10 || i == 1 || i == 10)

					System.out.print("*");

				else

					System.out.print(" ");

			}

			System.out.println();

		}

		// Lower part of the rhombus

		for (int i = 10 - 1; i >= 1; i--) {

			// Print spaces

			for (int j = 1; j <= 10 - i; j++)

				System.out.print(" ");

			// Print stars for the first and last rows, or for the first and last columns

			for (int j = 1; j <= 10; j++) {

				if (j == 1 || j == 10 || i == 1 || i == 10)

					System.out.print("*");

				else

					System.out.print(" ");

			}

			System.out.println();

		}
	}
}
