package com.gittest.zhph;

/***
 * idea 测试git类
 * @author  zhixiang.zhang
 * @date 2017年10月20日
 */
public class Test {
    private String name33;
    private  String age44;
    private   String sex55;
    private String name1;
    private String test;
    private  String age;
    private   String sex;

    public String getName() {
        return name1;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + getName() + '\'' +
                ", age='" + getAge() + '\'' +
                ", sex='" + getSex() + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Test test = new Test();
        test.setAge("18");
        test.setName("小名");
        test.setSex("男");
        System.out.println(test);
    }

}
