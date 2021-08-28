package com.practiseProgramms;

import java.util.Arrays;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
/*
 * Two strings are called anagrams if they contain same set of characters but in different order. For example, “Dormitory – Dirty Room”,
 *  “keep – peek”,  “School Master – The Classroom” are some anagrams.
 */
public class AnagramProgramm {

	public static Boolean isAnagram(String s1,String s2)
	{	
		if(s1.length()==s2.length())
		{
		String arr=s1.replaceAll(" ","");
		String arrr=s2.replaceAll(" ","");
		char arr1[]=arr.toCharArray();
		char arr2[]=arrr.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.equals(arr1, arr2);
		}
		else
		{
			return false;
		}
		return true;
	}
	@Test
	public static void oauth1()
	{
		Response response= RestAssured.
				given().
				auth().
				oauth("iWMLVsbQ32USu7611doW4oTS6","dCz4j76xSPvZOMkmYJ48f8aYqzKIR5vs9PXFKNhW1Pjt3PIA0Q","3701207112-Gzu5dOT3glXBlRZjoJKp8Ltt7FPcWfoBBfJhSnR","vsYft4f0gPFWZRSVWGqvlCE1S1S1R4FiFQ21HWKdCs7Y9").
				post("https://api.twitter.com/1.1/statuses/update.json?status=this is first port via twitter api");
		response.prettyPrint();
		System.out.println(response.jsonPath().prettify());
		JsonPath json=response.jsonPath();
		String tweetid=json.get("id_str");
		System.out.println("My tweet id is:"+tweetid);
	}
	
	@Test
	public static void oauth2()
	{
	Response resp=RestAssured.given()
	.formParam("client_id","TestingApp_oauth2")
	.formParam("client_secret","28ea4857ded63fe618b6e4385d082043")
	.formParam("grant_type", "client_credentials")
	.post("http://coop.apps.symfonycasts.com/token");
	String accessToken=resp.jsonPath().get("access_token");
	System.out.println("Access token is:"+accessToken);
	
	Response resp2=RestAssured.given().auth().oauth2(accessToken).post("http://coop.apps.symfonycasts.com/api/1752/chickens-feed");
   System.out.println("Response is :"+resp2.jsonPath().prettify());
   System.out.println("action :"+resp2.jsonPath().get("action"));
   System.out.println("message :"+resp2.jsonPath().get("message"));
	}
	
	@Test
	public void testSwapWithoutThirdVar()
	{
		swapTwoNumWithoutUsingThirdVar(870,460);
	}
	
	public static void swapTwoNumWithoutUsingThirdVar(int a,int b)
	{
		System.out.println("before swap a:"+a+" "+"b:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap a:"+a+" "+"b:"+b);
		
	}
	       
           public static void palindromeCheck(String org)
           {
        	   String temp="";
        	   String str=org;
        	   for(int i=str.length()-1;i>=0;i--)
       		{
       			temp=temp+str.charAt(i);
       		}
        	   System.out.println("Changed String:"+temp);
        	   System.out.println("Original String:"+str);
        	if(temp.equals(str))
        	{
        		System.out.println("palindrome");
        	}
        	else
        	{
        		System.out.println("not a palindrome");
        	}
           }
       @Test    
      public static void testPalindrome()
      {
    	  palindromeCheck("nitin");
      }

       @Test
       public void reverseString()
       {
    		//int NumRev=12345;
   		//String str=String.valueOf(NumRev);
   		String str="My Name Is Karthik";
   		String emp="";
   		System.out.println(str);
   		for(int i=str.length()-1;i>=0;i--)
   		{
   			emp=emp+str.charAt(i);
   		}
   		System.out.println("reversed string is:"+emp);
       }
       
       public static void sumOfDigitsOfANum(int num)
       {
    	   int sum=0;
    	   while(num>0)
    	   {
    	   sum=sum+num%10;
    	   num=num/10;
    	   }
    	   System.out.println("the sum of digits of a num is :"+sum);
       }
       
       @Test
       public static void testSumOfDigitsOfNum()
       {
    	   sumOfDigitsOfANum(591);
       }
       
       public static void countDigitsOfANum(int num)
       {
    	   int count=0;
    	   while(num>0)
    	   {
    	   num=num/10;
    	   count++;
    	   }
    	   System.out.println("the no of digits are :"+count);
    	 
       }
       @Test
       public static void testCountOfDigitsOfNum()
       {
    	   countDigitsOfANum(1234);
       }
       
       @Test
       public void leftshiftnums()
       {
    	   int [] arr = new int [] {1, 2, 3, 4, 5};  
           //n determine the number of times an array should be rotated  
           int n = 3;  
           //Displays original array  
           System.out.println("Original array: ");  
           for (int i = 0; i < arr.length; i++) {  
               System.out.print(arr[i] + " ");  
           }  
           
           for(int i=0;i<n;i++) {
        	   int firstnum=arr[0];
               int j;
           for(j=0;j<arr.length-1;j++)
           {
        	   arr[j]=arr[j+1];
           }
           arr[j]=firstnum;
           }
           System.out.println("after left shift array: ");  
           for (int i = 0; i < arr.length; i++) {  
               System.out.print(arr[i] + " ");  
           } 
       }
       
}
