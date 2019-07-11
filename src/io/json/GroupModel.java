package io.json;

import java.util.ArrayList;
import java.util.List;

/*
 * GroupModel
 * @Author guobin201314@gmail.com on 2019-06-05 11:41
 */
public class GroupModel {

    private Long       id;
    private String     name;
    private List<UserModel> users = new ArrayList<UserModel>();

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<UserModel> getUsers() {
        return users;
    }

    public void setUsers(List<UserModel> users) {
        this.users = users;
    }

    public void addUser(UserModel user) {
        users.add(user);
    }

}
