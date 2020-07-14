package example;
import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {

	     

	      int[] arr = new int[5];

	     

	      Scanner sc = new Scanner(System.in);

	     

	      System.out.println("정수 5개를 입력해주세요.");

	          

	      for(int i=0; i<arr.length;i++){

	        arr[i] = sc.nextInt();

	      }

	     

	      System.out.println("------------------------------------");

	      System.out.println("입력하신 숫자중 최대값은 "+ maxValue(arr));

	      System.out.println("입력하신 숫자중 최소값은 "+ miniValue(arr));

	     

	      System.out.println("문제2");

	      System.out.println("--------------------------------------");

	     

	      int[][] arr2 = {

	                    {1,2,3},

	                    {4,5,6},

	                    {7,8,9},

	                    {10,11,12},

	                    {13,14,15}

	              };

	     

	     

	      for(int i=0; i< arr2.length;i++){

	        for(int j=0; j<arr2[i].length; j++){

	           System.out.print(arr2[i][j]+"\t");

	        }

	        System.out.println();

	      }

	     

	      System.out.println("----------------------------------");

	     

	      addOneDArr(arr2,10);

	     

	      for(int i=0; i< arr2.length;i++){

	        for(int j=0; j<arr2[i].length; j++){

	           System.out.print(arr2[i][j]+"\t");

	        }

	        System.out.println();

	      }

	     

	      System.out.println("자리이동");

	      System.out.println("------------------------------------");

	     

	     

	      changeArr(arr2);

	     

	      for(int i=0; i< arr2.length;i++){

	        for(int j=0; j<arr2[i].length; j++){

	           System.out.print(arr2[i][j]+"\t");

	        }

	        System.out.println();

	      }

	     

	     

	 

	   }

	  

	   // 배열의 요소 위치 변경

	   public static void changeArr(int[][] arr){

	     

	      // arr.length -> 2차원 배열의 1차원 배열 개수

	     

	      int[] temp = new int[arr[0].length];

	     

	      temp = arr[arr.length-1];

	     

	      for(int i=arr.length-1; i>0;i--){

	        arr[i]=arr[i-1];

	      }

	     

	      arr[0] = temp;

	     

	   }

	  

	  

	   // 1차원 배열 모든 요소에 값 더하기

	   public static void addOneDArr(int[] arr, int add){

	        for (int i=0; i<arr.length; i++){

	           arr[i] +=add;

	        }

	   }

	  

	   // 2차원배열의 모든 요소에 값 더하기

	  public static void addOneDArr(int[][] arr, int add){

	     

	      // 세로의 사이즈 : arr.length

	      for (int i=0; i<arr.length;i++){

	        //가로의 사이즈 : arr[0].length

	        for(int j=0; j<arr[i].length; j++){

	           // arr[0][3] = arr[0][0] + add;

	           arr[i][j] = arr[i][j] + add;

	        }

	      }

	     

	   }

	  

	  

	 

	   // 최소값 반환

	   public static int miniValue(int[] arr) {    

	      int min = arr[0];   

	      for(int i=0; i<arr.length ; i++){

	        if(arr[i]<min){

	           min = arr[i];

	        }

	      }

	      return min;  

	   }

	 

	   // 최대값 반환

	  public static int maxValue(int[] arr) {

	      int max=arr[0];

	      for(int i=0; i<arr.length;i++){

	        if(arr[i]>max){

	           max=arr[i];

	        }

	      }

	      return max;
}
}
