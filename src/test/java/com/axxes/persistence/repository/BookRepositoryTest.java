package com.axxes.persistence.repository;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by dhonorez on 29/08/16.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
@DatabaseSetup(BookRepositoryTest.DATASET)
@TestExecutionListeners(mergeMode = TestExecutionListeners.MergeMode.MERGE_WITH_DEFAULTS, value = {DbUnitTestExecutionListener.class})
public class BookRepositoryTest {

    protected static final String DATASET = "classpath:datasets/books.xml";

    @Test
    public void your_test_here() {
    }

}