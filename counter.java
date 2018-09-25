
package wordcounter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



public class wordcounter {


public static void main(String[] args) throws Exception {
  
	
  Scanner input = new Scanner(System.in);
  System.out.println("please input path:");
  String path = input.next();
  int countChar = 0;
  int countword = 0;
  int countline = 0;
  InputStreamReader isr = new InputStreamReader(new FileInputStream(path));
 
  Bufferedreader br = new BufferedReader(isr);

  while(br.read()!=-1)
 
  {
   String s = br.readLine();
   countChar += s.length();
   countword += s.split(" ").length;
   countline++;
  }
  isr.close();
  System.out.println("char cont "+countChar);
  System.out.println("word count "+countword );
  System.out.println("line count "+countline); 
  }
}




