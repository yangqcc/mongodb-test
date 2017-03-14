package com.yqc;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Administrator on 2017/3/12.
 *
 * @TypeAlias can set _class field alias
 * <p>
 * When inserting or saving, if the Id property is not set, the assumption is that its value will be auto-
 * generated by the database. As such, for auto-generation of an ObjectId to succeed the type of the Id
 * property/field in your class must be either a String, ObjectId, or BigInteger.(Spring MongoDB Reference)
 */
@Document(collection = "person")
//@TypeAlias("pers")
public class Person {
    @Id
    private String id;
    private String name;
    private int age;
    private String favorite;
    private Point point;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String favorite) {
        this.name = name;
        this.age = age;
        this.favorite = favorite;
    }

    public Person(String name, Point point) {
        this.name = name;
        this.point = point;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    public String getFavorite() {
        return favorite;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", favorite='" + favorite + '\'' +
                ", point=" + point +
                '}';
    }
}
