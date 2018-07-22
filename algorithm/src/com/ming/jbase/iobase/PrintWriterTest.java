package com.ming.jbase.iobase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * PrintWriter类详�?
 * @Title: PrintWriterTest.java 
 * @Package com.jbase.iotest 
 * @author 王武�?
 * @date 2018�?�?1�?下午5:31:13 
 * @version V1.0
 */
public class PrintWriterTest
{
    public static void main(String[] args)
    {
        try
        {
            /*
             * 创建输出流，将文件写入指定的文件�?
             */
            String path = "D:\\eclipse\\workplace\\Algo_java_base\\resource\\stream\\print_writer_reader\\123.txt";
            File file = new File(path);
            // 参数true 表示追加到文本末尾，没有参数或�?为false 表示覆盖原文�?
            OutputStream os = new FileOutputStream(file,true);
            PrintWriter pWriter = new PrintWriter(os);
            
            /**
             * 文件原来的内容呢�?难道是重写，重新覆盖了？
             */
            pWriter.write("hello world\n");
            pWriter.append("i am a programmer\n");
            pWriter.println("world peace\n");
            pWriter.close();
            os.close();
            
            /*
             * 创建输入流，将文件信息读到控制台
             */
            InputStream is = new FileInputStream(file);
            InputStreamReader iReader = new InputStreamReader(is);
            BufferedReader bReader = new BufferedReader(iReader);
            
            String info = "";
            info = bReader.readLine();
            while( info != null)
            {
                System.out.println(info);
                info = bReader.readLine();
            }
            bReader.close();
            iReader.close();
            is.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    /**
     * Printwriter的八种构造方�?
     * url: https://www.cnblogs.com/xiaotiaosi/p/6394147.html
     * @author 王武�?
     * @date 2018�?�?2�?下午1:09:46 
     * @return void    返回类型
     */
    public static void constructionMethon()
    {
        /**
         * PrintWriter 是一个非常实用的输出�?
         */
    }
    
    
}
