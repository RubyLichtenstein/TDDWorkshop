package com.example.ruby.tddworkshop.ui.creategroup;

import com.example.ruby.tddworkshop.data.GroupsRepository;

/**
 * Created by Ruby on 6/5/2017.
 */

public class CreateGroupPresenter implements CreateGroupMVPContract.Presenter {

  final GroupsRepository groupsRepository;
  final CreateGroupMVPContract.View view;

  public CreateGroupPresenter(GroupsRepository groupsRepository, CreateGroupMVPContract.View view) {
    this.groupsRepository = groupsRepository;
    this.view = view;
  }

  /**
   * if group name valid -> call repository create group -> go back
   * if group name not valid -> view show msg group name not valid
   */
  @Override public void createGroup(String groupName) {

  }
}
