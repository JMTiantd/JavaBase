package com.ming.jbase.threadbase.chapter_1;

/**
 * 构造一个非线程安全的环境
 * result:
 * username=b password=bb
 * username=b password=aa
 *
 * 由于usernameRef和passwordRef是static类型的
 * 当alogin先执行的时候，usernameRef=a,但是sleep了五秒
 * 然后blogin执行，usernameRef=b,当alogin sleep结束的时候usernameRef已经被替换成b了
 * 所以结果中会出现username=b password=aa
 *
 * @Project: algorithm
 * @Package com.ming.jbase.threadbase.chapter_1
 * @Author wuming.wang
 * @Description: TODO
 * @CreateTime 2018-11-20 14:24
 * @Version V1.0
 */
public class LoginServlet
{
    private static String usernameRef;

    private static String passwordRef;

    public static void doPost(String username, String password)
    {
        try
        {
            usernameRef = username;

            if (username.equals("a"))
            {
                Thread.sleep(5000);
            }

            passwordRef = password;

            System.out.println("username=" + usernameRef + " password=" + passwordRef);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}

class Alogin extends Thread
{
    @Override
    public void run()
    {
        LoginServlet.doPost("a", "aa");
    }
}

class Blogin extends Thread
{
    @Override
    public void run()
    {
        LoginServlet.doPost("b", "bb");
    }
}

class RunTest
{
    public static void main(String[] args)
    {
        Alogin alogin = new Alogin();
        alogin.start();

        Blogin blogin = new Blogin();
        blogin.start();

    }
}
