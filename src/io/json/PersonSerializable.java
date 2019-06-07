package io.json;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * PersonSerializable
 * @Author guobin201314@gmail.com on 2019-06-07 09:14
 */
public class PersonSerializable implements Serializable {
    private String username;
    private String password;

    private PersonSerializable(String name, String pass) {
        this.username = name;
        this.password = pass;
    }

    @Override
    public String toString() {
        return "{username: \"" + username + "\", password:\"" + password + "\"}";
    }

    public static void main(String[] args) {
        PersonSerializable person1 = new PersonSerializable("jack", "admin888");
        PersonSerializable person2 = new PersonSerializable("tom", "admin123");
        System.out.println(person1);
        System.out.println(person2);
    }
    private void writeObject(ObjectOutputStream outputStream) throws IOException {
        outputStream.defaultWriteObject();
        outputStream.writeObject(username);
    }
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        username=(String) objectInputStream.readObject();
    }
}
