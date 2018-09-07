package com.ming.jbase.mapbase;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

public class ConcurrentMapTest
{

    private static Map<String, Long> mapWordCounts = new HashMap<>();

    private static ConcurrentMap<String, Long> concurrentMap = new ConcurrentHashMap<>();

    public static int count = 0;

    public static long mapIncrease(String word)
    {
        Long oldValue = mapWordCounts.get(word);

        Long newValue = (oldValue == null) ? 1L : oldValue + 1;

        mapWordCounts.put(word, newValue);

        return newValue;
    }

    public static long concurrentMapIncrease(String word)
    {
        Long oldValue, newValue;
        while (true)
        {
            oldValue = concurrentMap.get(word);
            if (oldValue == null)
            {
                newValue = 1L;
                // 以及有key了就返回放入的值，否则返回空
                if (concurrentMap.putIfAbsent(word, newValue) == null)
                {
                    break;
                }
            }
            else
            {
                newValue = oldValue + 1;
                // 值替换，每次替换时都会比较上面拿到oldValue是否就是当前map里面的值，是才替换，否则继续获取
                if (concurrentMap.replace(word, oldValue, newValue))
                {
                    break;
                }
            }
        }
        return newValue;
    }

    public static void mapWordCounts() throws InterruptedException, ExecutionException
    {
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                int count = 0;
                while (count++ < 10000)
                {
                    ConcurrentMapTest.mapIncrease("work");
                }
            }
        }).start();

        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                int count = 0;
                while (count++ < 10000)
                {
                    ConcurrentMapTest.mapIncrease("work");
                }
            }
        }).start();

        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                int count = 0;
                while (count++ < 10000)
                {
                    ConcurrentMapTest.mapIncrease("work");
                }
            }
        }).start();

        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                int count = 0;
                while (count++ < 10000)
                {
                    ConcurrentMapTest.mapIncrease("work");
                }
            }
        }).start();

    }

    public static void concurrentWordCount() throws InterruptedException, ExecutionException
    {
        new Thread(new Runnable()
        {
            public void run()
            {
                int count = 0;
                while (count++ < 10000)
                    ConcurrentMapTest.concurrentMapIncrease("work");
            }
        }).start();
        new Thread(new Runnable()
        {
            public void run()
            {
                int count = 0;
                while (count++ < 10000)
                    ConcurrentMapTest.concurrentMapIncrease("work");
            }
        }).start();
        new Thread(new Runnable()
        {
            public void run()
            {
                int count = 0;
                while (count++ < 10000)
                    ConcurrentMapTest.concurrentMapIncrease("work");
            }
        }).start();
        new Thread(new Runnable()
        {
            public void run()
            {
                int count = 0;
                while (count++ < 10000)
                    ConcurrentMapTest.concurrentMapIncrease("work");
            }
        }).start();
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException
    {
        ConcurrentMapTest.mapWordCounts();
        Thread.sleep(10000);

        // 多线程累加，每次都少于40000，故线程不安全
        System.out.println("final count map:" + ConcurrentMapTest.mapWordCounts.get("work"));

        // 多线程累加，每次都是40000
        ConcurrentMapTest.concurrentWordCount();
        Thread.sleep(10000);
        System.out.println("final count concurrentMap:" + ConcurrentMapTest.concurrentMap.get("work"));
    }
}
