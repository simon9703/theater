package com.apache.zsm.flavor.domain;

public class People {
    private int id;
    private String name;
    private String interest;
    private double age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append('{')
                .append("编号: ").append(id)
                .append(", 姓名: ").append(name)
                .append(", 爱好: ").append(interest)
                .append("， 年龄: ").append(age)
                .append('}');
        return builder.toString();
    }
}
