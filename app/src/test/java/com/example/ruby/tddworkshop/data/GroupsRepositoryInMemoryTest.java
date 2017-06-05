package com.example.ruby.tddworkshop.data;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Ruby on 6/5/2017.
 * use cases
 * 1. get groups emit empty list
 *
 * 2. add 1 group -> get groups emit list with one group
 */

public class GroupsRepositoryInMemoryTest {
  private GroupsRepository groupsRepository;

  @Before public void setUp() throws Exception {
    groupsRepository = new GroupsRepositoryInMemory();
  }

  @Test public void getGroups_groupsAreEmpty_emitEmptyList() throws Exception {
    groupsRepository.getGroups().subscribe(groups -> {
      assertThat(groups.size()).isEqualTo(0);
    });
  }

  @Test public void createGroup_groupsHaveOneItem_emitListWIthOneItem() throws Exception {
    groupsRepository.createGroup(new Group());
    groupsRepository.getGroups().subscribe(groups -> {
      assertThat(groups.size()).isEqualTo(1);
    });
  }
}