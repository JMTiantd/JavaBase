package com.ming.jbase.iobase;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * readLine �?回车符之间的关系
 * @Title: ReadLineTest.java 
 * @Package com.jbase.iotest 
 * @author 王武�?
 * @date 2018�?�?2�?上午10:59:39 
 * @version V1.0
 */
public class ReadLineTest
{

    public static void main(String[] args)
    {
        try
        {
            
            BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

            String readLine = bReader.readLine();
            System.out.println("readLine = " + readLine);

            System.out.println("---------------------");

            /**
             * bReader.readLine(); 会丢弃回车符，�?不是返回回车符，即bReader.readLine()遇到
             * 回车符时终止读取，并且会把读取到的回车符自动丢弃�?
             * bReader.readLine() 返回的是"",而不是null�?
             */
            System.out.println(readLine == null);
            System.out.println(readLine.equals(""));
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
