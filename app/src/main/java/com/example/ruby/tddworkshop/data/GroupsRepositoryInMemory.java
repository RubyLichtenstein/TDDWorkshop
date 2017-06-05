package com.example.ruby.tddworkshop.data;

import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * Created by Ruby on 6/5/2017.
 */

public class GroupsRepositoryInMemory implements GroupsRepository {

  List<Group> groups;
  private Callable<List<Group>> supplier;

  public GroupsRepositoryInMemory() {
    groups = new ArrayList<>();
    supplier = new Callable<List<Group>>() {
      @Override public List<Group> call() throws Exception {
        return groups;
      }
    };
  }

  @Override public Observable<List<Group>> getGroups() {
    return Observable.fromCallable(supplier);
  }

  @Override public void createGroup(Group group) {
    groups.add(group);
    try {
      supplier.call();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
