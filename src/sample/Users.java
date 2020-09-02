package sample;

import java.util.*;

public class Users {

    private String name;
    private String password;
    private String age;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(name, users.name) &&
                Objects.equals(password, users.password) &&
                Objects.equals(age, users.age) &&
                Objects.equals(list, users.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password, age, list);
    }
    List<Users> list = new ArrayList<>();

    public List<Users> getList() {
        return list;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setList(List<Users> list) {
        this.list = list;
    }

    public void add(Users us) {
    }

    public Users(){}


    public Users(String name, String password, String age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Users{" +
                "users=" + list +
                '}';
    }
}