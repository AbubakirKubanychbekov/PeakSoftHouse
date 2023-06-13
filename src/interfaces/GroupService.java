package interfaces;

import model.Group;

import java.util.List;

public interface GroupService {
    void addNewGroup(Long id,String name,String descrition);
    void getGroupByName(String name);
    void updateGroupName(String oldName, String newName);
    void getAllGroups(List<Group>groups);
    void deleteGroup(List<Group>groups);

}
