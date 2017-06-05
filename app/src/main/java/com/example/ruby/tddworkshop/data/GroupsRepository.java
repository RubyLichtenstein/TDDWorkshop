package com.example.ruby.tddworkshop.data;

import io.reactivex.Observable;
import java.util.List;

/**
 * Created by Ruby on 6/5/2017.
 */

public interface GroupsRepository {
  Observable<List<Group>> getGroups();

  void createGroup(Group group);
}
