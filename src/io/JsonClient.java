package io;

import com.alibaba.fastjson.JSON;

/*
 * JsonClient
 * @Author guobin201314@gmail.com on 2019-06-05 11:40
 */
public class JsonClient {
    public static void main(String[] args) {
        GroupModel groupModel = new GroupModel();
        groupModel.setId(0L);
        groupModel.setName("userGroup");

        UserModel userModel = new UserModel();
        userModel.setId(2L);
        userModel.setName("tom");

        UserModel adminUser = new UserModel();
        adminUser.setId(3L);
        adminUser.setName("admin");

        groupModel.addUser(userModel);
        groupModel.addUser(adminUser);
        // object转json
        String json = JSON.toJSONString(groupModel);
        System.out.println(json);
        String jsonStr = "{\"id\":0,\"name\":\"userGroup\",\"users\":[{\"id\":2,\"name\":\"tom\"},{\"id\":3," +
                "\"name\":\"admin\"}]}";
        // string转object
        GroupModel groupData = JSON.parseObject(jsonStr, GroupModel.class);
        System.out.println(groupData.getName());
    }
}
