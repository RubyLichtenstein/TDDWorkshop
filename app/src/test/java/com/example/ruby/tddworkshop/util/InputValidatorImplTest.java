package com.example.ruby.tddworkshop.util;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Ruby on 6/5/2017.
 */
public class InputValidatorImplTest {

  InputValidator inputValidator;

  String validGroupName = "abc";
  String notValidGroupName = "ab";

  @Before public void init() {
    inputValidator = new InputValidatorImpl();
  }

  @Test public void groupNameMoreThen2Chars_isValid() throws Exception {
    boolean res = inputValidator.isGroupNameValid(validGroupName);
    assertThat(res).isTrue();
  }

  @Test public void groupNameLessThen2Chars_isNotValid() throws Exception {
    boolean res = inputValidator.isGroupNameValid(notValidGroupName);
    assertThat(res).isFalse();
  }
}