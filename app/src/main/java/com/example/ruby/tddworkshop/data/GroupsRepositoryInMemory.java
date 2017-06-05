package com.example.ruby.tddworkshop.data;

import io.reactivex.Observable;
import java.util.List;

/**
 * Created by Ruby on 6/5/2017.
 */

public class GroupsRepositoryInMemory implements GroupsRepository {
  @Override public Observable<List<Group>> getGroups() {
    return null;
  }

  @Override public void createGroup(Group group) {

  }
}
