package com.example.ruby.tddworkshop.data;

import io.reactivex.Observable;

/**
 * Created by Ruby on 6/5/2017.
 */

public class GroupsRepositoryInMemory implements GroupsRepository {
  @Override public Observable<Group> getGroups() {
    return null;
  }

  @Override public void createGroup(Group group) {

  }
}
