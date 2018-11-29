package com.ming.jbase.mapbase;

import lombok.Data;
import lombok.ToString;

import java.util.*;

/**
 * 实现对HashMap的排序 题目要求：
 * 已知一个HashMap<Integer,User>集合，User有name（string）和age(int)两个属性，请写一个方法实现对HashMap的排序功能
 * 该方法接收对HashMap<Integer,User>为形参，返回类型也为HashMap<Integer,User>。要求对User的age倒叙进行排序。排序时
 * key=value键值对不能拆散。
 * @Project: algorithm
 * @Package com.ming.jbase.mapbase
 * @Author wuming.wang
 * @Description: TODO
 * @CreateTime 2018-11-12 13:21
 * @Version V1.0
 */
public class HashMapSortSubject
{

    public static HashMap<Integer, User> sortUserByAge(HashMap<Integer, User> userHashMap)
    {

        if (userHashMap == null || userHashMap.size() <= 0)
        {
            return userHashMap;
        }

        /**
         * 获取entry集
         */
        Set<Map.Entry<Integer, User>> entries = userHashMap.entrySet();

        /**
         * 将set集合转化成list
         */
        List<Map.Entry<Integer, User>> list = new ArrayList<Map.Entry<Integer, User>>(entries);

        /**
         * 对list进行排序
         */
        Collections.sort(list, new Comparator<Map.Entry<Integer, User>>()
        {
            @Override
            public int compare(Map.Entry<Integer, User> o1, Map.Entry<Integer, User> o2)
            {
                Integer age1 = o1.getValue().getAge();
                Integer age2 = o2.getValue().getAge();

                // 或者使用下面这行代码代替
                // return age2 - age1;
                if (age1 > age2)
                {
                    return -1;
                }
                else if (age1.equals(age2))
                {
                    return 0;
                }
                else
                {
                    return 1;
                }
            }
        });

        /**
         * 因为LinkedHashMap是有序的(先入先出)
         * 新建一个linkedHashMap集合
         */
        LinkedHashMap<Integer, User> linkedHashMap = new LinkedHashMap<Integer, User>();

        for (Map.Entry<Integer, User> map: list)
        {
            linkedHashMap.put(map.getKey(),map.getValue());
        }

        return linkedHashMap;
    }

    public static void main(String[] args)
    {
        HashMap<Integer,User> userMap = new HashMap<Integer, User>();
        userMap.put(1,new User("张三",25));
        userMap.put(5,new User("张三",20));
        userMap.put(3,new User("张三",33));
        userMap.put(2,new User("张三",17));
        userMap.put(4,new User("张三",40));

        HashMap<Integer, User> sortedUserHashMap = sortUserByAge(userMap);

        System.out.println(sortedUserHashMap);
    }

}

@ToString
class User
{
    private String name;

    private Integer age;

    public User(String name, Integer age)
    {
        this.name = name;
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    public Integer getAge()
    {
        return this.age;
    }
}



