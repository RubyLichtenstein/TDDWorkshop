package com.example.ruby.tddworkshop.ui.groups;

import com.example.ruby.tddworkshop.data.Group;
import com.example.ruby.tddworkshop.data.GroupsRepository;
import io.reactivex.Observable;
import java.util.List;

/**
 * Created by Ruby on 6/5/2017.
 */

public class GroupsPresenter implements GroupsMVPContract.Presenter {

  final GroupsRepository groupsRepository;
  final GroupsMVPContract.View view;

  public GroupsPresenter(GroupsRepository groupsRepository, GroupsMVPContract.View view) {
    this.groupsRepository = groupsRepository;
    this.view = view;
  }

  /**
   * if groups empty view#showNoGroups
   * if groups NOT empty view#showGroups
   */
  @Override public void loadGroups() {
    groupsRepository.getGroups().subscribe(groups -> {
      if (groups.isEmpty()) {
        view.showNoGroupsMsg();
      } else {
        view.showGroups(groups);
      }
    });
  }


  @Override public void createGroup() {

  }
}
