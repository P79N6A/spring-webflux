package com.github.springwebflux.guava.collection;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.PeekingIterator;

import java.util.List;

/**
 * @author: <a href="mailto:lingxiao@2dfire.com">凌霄</a>
 * @time: Created in 下午10:40 2018/10/24
 * @desc
 */
public class PeekingIteratorTest {

    public static void main(String[] args) {

        List source = Lists.newArrayList();
        List result = Lists.newArrayList();

        source.add(1);
        source.add(2);
        source.add(3);
        source.add(3);
        PeekingIterator iterator = Iterators.peekingIterator(source.iterator());
        while (iterator.hasNext()) {
            int tmp = (int) iterator.next();
            while (iterator.hasNext() && iterator.peek().equals(tmp)) {
                iterator.next();
            }
            result.add(tmp);
        }

        result.forEach(System.out::println);
    }
}
