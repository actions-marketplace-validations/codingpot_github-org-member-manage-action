package com.github.codingpot.github_org_member_manage_action.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.inject.Qualifier;

/** Annotation used for Members file content INPUT from the action. */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface MembersFileContent {}
