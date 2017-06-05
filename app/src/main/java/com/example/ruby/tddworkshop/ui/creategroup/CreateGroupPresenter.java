package com.example.ruby.tddworkshop.ui.creategroup;

import com.example.ruby.tddworkshop.data.Group;
import com.example.ruby.tddworkshop.data.GroupsRepository;
import com.example.ruby.tddworkshop.util.InputValidator;

/**
 * Created by Ruby on 6/5/2017.
 */

public class CreateGroupPresenter implements CreateGroupMVPContract.Presenter {

  final InputValidator inputValidator;
  final GroupsRepository groupsRepository;
  final CreateGroupMVPContract.View view;

  public CreateGroupPresenter(InputValidator inputValidator, GroupsRepository groupsRepository,
      CreateGroupMVPContract.View view) {
    this.inputValidator = inputValidator;
    this.groupsRepository = groupsRepository;
    this.view = view;
  }

  /**
   * if group name valid -> call repository create group -> go back
   * if group name not valid -> view show msg group name not valid
   */
  @Override public void createGroup(String groupName) {
    if (inputValidator.isGroupNameValid(groupName)) {
      groupsRepository.createGroup(new Group(groupName));
      view.back();
    } else {
      view.showMsgGroupNameNotValid();
    }
  }
}
