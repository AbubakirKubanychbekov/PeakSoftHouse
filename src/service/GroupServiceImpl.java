package service;

import dataBase.DataBase;
import interfaces.GroupService;
import model.Group;

import java.util.List;

public class GroupServiceImpl implements GroupService {
  private DataBase dataBase;

  public GroupServiceImpl(DataBase dataBase) {
    this.dataBase = dataBase;
  }


  @Override
  public void addNewGroup(Long id, String name, String descrition) {
    dataBase.getGroups().add(new Group(id,name,descrition));
      System.out.println(dataBase.getGroups());
    }


  @Override
    public void getGroupByName(String name) {
      List<Group> groups = dataBase.getGroups();
      for (int i = 0; i < dataBase.getGroups().size(); i++) {
        if (dataBase.getGroups().get(i).getName().equalsIgnoreCase(name)){
          System.out.println(dataBase.getGroups().get(i));
        }
      }
  }


    @Override
    public void updateGroupName(String oldName, String newName) {
      for (int i = 0; i < dataBase.getGroups().size(); i++) {
        if (dataBase.getGroups().get(i).getName().equalsIgnoreCase(oldName)){
          dataBase.getGroups().get(i).setName(newName);
          System.out.println("Группа ийгиликтуу алмашты!");
        } else if (!dataBase.getGroups().get(i).getName().equalsIgnoreCase(newName)) {

        }

      }

  }


    @Override
    public void getAllGroups(List<Group> groups) {
      System.out.println(dataBase.getGroups());

    }

  @Override
  public void deleteGroup(List<Group> groups) {
        dataBase.getGroups().clear();
      }
    }
