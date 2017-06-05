package com.example.ruby.tddworkshop.data;

import io.reactivex.Observable;

/**
 * Created by Ruby on 6/5/2017.
 */

public interface GroupsRepository {
  Observable<Group> getGroups();

  void createGroup(Group group);
}
