package com.hooper.service;

/**
 * Created by hooper on 2016/11/30.
 */
public interface BaseService<E,PK> {

    public E get(PK pk);

    public void insert(E e);

    public void modify(E e);

    public void delete(PK pk);

}
